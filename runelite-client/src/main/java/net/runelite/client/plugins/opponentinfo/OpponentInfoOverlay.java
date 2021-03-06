/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.opponentinfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.client.RuneLite;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;

class OpponentInfoOverlay extends Overlay
{
	private static final int WIDTH = 140;

	private static final int TOP_BORDER = 2;
	private static final int BOTTOM_BORDER = 2;

	private static final int BAR_WIDTH = 124;
	private static final int BAR_HEIGHT = 20;

	private static final Color BACKGROUND = new Color(Color.gray.getRed(), Color.gray.getGreen(), Color.gray.getBlue(), 127);
	private static final Color HP_GREEN = new Color(0, 146, 54, 230);
	private static final Color HP_RED = new Color(102, 15, 16, 230);

	private static final Duration WAIT = Duration.ofSeconds(3);

	private final OpponentConfig config;
	private Integer lastMaxHealth;
	private DecimalFormat df = new DecimalFormat("0.0");
	private float lastRatio = 0;
	private Instant lastTime = Instant.now();
	private String opponentName;
	private Map<String, Integer> oppInfoHealth = OpponentInfo.loadNpcHealth();

	OpponentInfoOverlay(OpponentInfo plugin)
	{
		super(OverlayPosition.TOP_LEFT, OverlayPriority.HIGH);
		this.config = plugin.getConfig();
	}

	private Actor getOpponent()
	{
		Client client = RuneLite.getClient();

		Player player = client.getLocalPlayer();
		if (player == null)
		{
			return null;
		}

		return player.getInteracting();
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (RuneLite.getClient().getGameState() != GameState.LOGGED_IN || config.enabled() == false)
		{
			return null;
		}

		Actor opponent = getOpponent();

		if (opponent != null && opponent.getHealth() > 0)
		{
			lastTime = Instant.now();
			lastRatio = (float) opponent.getHealthRatio() / (float) opponent.getHealth();
			opponentName = opponent.getName();
			lastMaxHealth = oppInfoHealth.get(opponent.getName() + "_" + opponent.getCombatLevel());
		}

		if (Duration.between(Instant.now(), lastTime).abs().compareTo(WAIT) > 0)
		{
			return null; //don't draw anything.
		}
		FontMetrics fm = graphics.getFontMetrics();

		int height = TOP_BORDER + fm.getHeight(); // opponent name
		if (lastRatio >= 0)
		{
			height += 2 // between name and hp bar
				+ BAR_HEIGHT; // bar
		}
		height += BOTTOM_BORDER;

		graphics.setColor(BACKGROUND);
		graphics.fillRect(0, 0, WIDTH, height);

		int x = (WIDTH - fm.stringWidth(opponentName)) / 2;
		graphics.setColor(Color.white);
		graphics.drawString(opponentName, x, fm.getHeight() + TOP_BORDER);

		if (lastRatio >= 0)
		{
			int barWidth = (int) (lastRatio * (float) BAR_WIDTH);
			int barY = TOP_BORDER + fm.getHeight() + 1;

			graphics.setColor(HP_GREEN);
			graphics.fillRect((WIDTH - BAR_WIDTH) / 2, barY, barWidth, BAR_HEIGHT);

			graphics.setColor(HP_RED);
			graphics.fillRect(((WIDTH - BAR_WIDTH) / 2) + barWidth, barY, BAR_WIDTH - barWidth, BAR_HEIGHT);

			graphics.setColor(Color.white);

			String str;

			if (lastMaxHealth != null)
			{
				int currHealth = (int) (lastRatio * lastMaxHealth);
				str = currHealth + "/" + lastMaxHealth;
			}
			else
			{
				str = df.format(lastRatio * 100) + "%";
			}

			graphics.drawString(str, (WIDTH - fm.stringWidth(str)) / 2, barY + fm.getHeight());
		}

		return new Dimension(WIDTH, height);
	}
}
