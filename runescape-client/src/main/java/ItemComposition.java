import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ItemComposition")
public class ItemComposition extends CacheableNode {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   @Export("items")
   static NodeCache items;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   @Export("itemModelCache")
   static NodeCache itemModelCache;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   @Export("itemSpriteCache")
   static NodeCache itemSpriteCache;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -948582439
   )
   public static int field3486;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ljm;"
   )
   public static Font field3489;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -632954321
   )
   @Export("maleHeadModel")
   int maleHeadModel;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 2009312137
   )
   @Export("maleModel")
   int maleModel;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 847975361
   )
   @Export("inventoryModel")
   int inventoryModel;
   @ObfuscatedName("af")
   @Export("countObj")
   int[] countObj;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1351801545
   )
   @Export("team")
   int team;
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   IterableHashTable field3532;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1352289517
   )
   @Export("maleHeadModel2")
   int maleHeadModel2;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1444109231
   )
   @Export("maleModel1")
   int maleModel1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 384300633
   )
   @Export("maleModel2")
   int maleModel2;
   @ObfuscatedName("ad")
   @Export("inventoryActions")
   public String[] inventoryActions;
   @ObfuscatedName("c")
   @Export("name")
   public String name;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -373231015
   )
   @Export("femaleHeadModel")
   int femaleHeadModel;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -119220311
   )
   @Export("zoom2d")
   public int zoom2d;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1885961671
   )
   @Export("id")
   public int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 256632007
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1162609681
   )
   @Export("femaleModel")
   int femaleModel;
   @ObfuscatedName("ak")
   @Export("countCo")
   int[] countCo;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 961744203
   )
   @Export("femaleModel1")
   int femaleModel1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -155289013
   )
   @Export("femaleModel2")
   int femaleModel2;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1493300221
   )
   @Export("xan2d")
   public int xan2d;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -642559271
   )
   @Export("resizeX")
   int resizeX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 343508667
   )
   @Export("yan2d")
   public int yan2d;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -785314131
   )
   @Export("offsetX2d")
   public int offsetX2d;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 2070858109
   )
   @Export("isStackable")
   public int isStackable;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1730939479
   )
   @Export("resizeY")
   int resizeY;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -791846435
   )
   @Export("offsetY2d")
   public int offsetY2d;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1541935377
   )
   @Export("zan2d")
   public int zan2d;
   @ObfuscatedName("al")
   @Export("isMembers")
   public boolean isMembers;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1035916441
   )
   @Export("price")
   public int price;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -44110411
   )
   @Export("resizeZ")
   int resizeZ;
   @ObfuscatedName("z")
   @Export("colourToReplace")
   short[] colourToReplace;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 929347075
   )
   @Export("maleOffset")
   int maleOffset;
   @ObfuscatedName("e")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 42606727
   )
   @Export("notedTemplate")
   public int notedTemplate;
   @ObfuscatedName("ag")
   @Export("groundActions")
   public String[] groundActions;
   @ObfuscatedName("u")
   @Export("colourToReplaceWith")
   short[] colourToReplaceWith;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1288123293
   )
   @Export("femaleOffset")
   int femaleOffset;
   @ObfuscatedName("p")
   @Export("textToReplaceWith")
   short[] textToReplaceWith;
   @ObfuscatedName("bv")
   public boolean field3487;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1744554947
   )
   @Export("ambient")
   public int ambient;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1895962339
   )
   @Export("notedId")
   int notedId;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -914625957
   )
   @Export("contrast")
   public int contrast;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1758409059
   )
   @Export("note")
   public int note;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1580733737
   )
   public int field3531;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1915846531
   )
   public int field3497;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1800295979
   )
   @Export("unnotedId")
   int unnotedId;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -827376157
   )
   public int field3536;

   static {
      items = new NodeCache(64);
      itemModelCache = new NodeCache(50);
      itemSpriteCache = new NodeCache(200);
   }

   ItemComposition() {
      this.name = "null";
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.isStackable = 0;
      this.price = 1;
      this.isMembers = false;
      this.groundActions = new String[]{null, null, "Take", null, null};
      this.inventoryActions = new String[]{null, null, null, null, "Drop"};
      this.team = -2;
      this.maleModel = -1;
      this.maleModel1 = -1;
      this.maleOffset = 0;
      this.femaleModel = -1;
      this.femaleModel1 = -1;
      this.femaleOffset = 0;
      this.maleModel2 = -1;
      this.femaleModel2 = -1;
      this.maleHeadModel = -1;
      this.maleHeadModel2 = -1;
      this.femaleHeadModel = -1;
      this.femaleHeadModel2 = -1;
      this.note = -1;
      this.notedTemplate = -1;
      this.resizeX = 128;
      this.resizeY = 128;
      this.resizeZ = 128;
      this.ambient = 0;
      this.contrast = 0;
      this.field3531 = 0;
      this.field3487 = false;
      this.unnotedId = -1;
      this.notedId = -1;
      this.field3536 = -1;
      this.field3497 = -1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lfp;II)V",
      garbageValue = "-850785163"
   )
   @Export("populateFromBuffer")
   void populateFromBuffer(Buffer var1, int var2) {
      if(var2 == 1) {
         this.inventoryModel = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.offsetX2d = var1.readUnsignedShort();
         if(this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if(var2 == 8) {
         this.offsetY2d = var1.readUnsignedShort();
         if(this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if(var2 == 11) {
         this.isStackable = 1;
      } else if(var2 == 12) {
         this.price = var1.readInt();
      } else if(var2 == 16) {
         this.isMembers = true;
      } else if(var2 == 23) {
         this.maleModel = var1.readUnsignedShort();
         this.maleOffset = var1.readUnsignedByte();
      } else if(var2 == 24) {
         this.maleModel1 = var1.readUnsignedShort();
      } else if(var2 == 25) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if(var2 == 26) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.groundActions[var2 - 30] = var1.readString();
         if(this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.inventoryActions[var2 - 35] = var1.readString();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.colourToReplace = new short[var3];
            this.colourToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.colourToReplace[var4] = (short)var1.readUnsignedShort();
               this.colourToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.textureToReplace = new short[var3];
            this.textToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.textureToReplace[var4] = (short)var1.readUnsignedShort();
               this.textToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 42) {
            this.team = var1.readByte();
         } else if(var2 == 65) {
            this.field3487 = true;
         } else if(var2 == 78) {
            this.maleModel2 = var1.readUnsignedShort();
         } else if(var2 == 79) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if(var2 == 90) {
            this.maleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 91) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 92) {
            this.maleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 93) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if(var2 == 97) {
            this.note = var1.readUnsignedShort();
         } else if(var2 == 98) {
            this.notedTemplate = var1.readUnsignedShort();
         } else if(var2 >= 100 && var2 < 110) {
            if(this.countObj == null) {
               this.countObj = new int[10];
               this.countCo = new int[10];
            }

            this.countObj[var2 - 100] = var1.readUnsignedShort();
            this.countCo[var2 - 100] = var1.readUnsignedShort();
         } else if(var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if(var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if(var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if(var2 == 113) {
            this.ambient = var1.readByte();
         } else if(var2 == 114) {
            this.contrast = var1.readByte() * 5;
         } else if(var2 == 115) {
            this.field3531 = var1.readUnsignedByte();
         } else if(var2 == 139) {
            this.unnotedId = var1.readUnsignedShort();
         } else if(var2 == 140) {
            this.notedId = var1.readUnsignedShort();
         } else if(var2 == 148) {
            this.field3536 = var1.readUnsignedShort();
         } else if(var2 == 149) {
            this.field3497 = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.field3532 = class34.method516(var1, this.field3532);
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IS)Lem;",
      garbageValue = "255"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class169.getItemDefinition(var2).getModel(1);
         }
      }

      Model var5 = (Model)itemModelCache.get((long)this.id);
      if(var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.method2414(CombatInfoListHolder.field1378, this.inventoryModel, 0);
         if(var6 == null) {
            return null;
         } else {
            if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.method2466(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if(this.colourToReplace != null) {
               for(var4 = 0; var4 < this.colourToReplace.length; ++var4) {
                  var6.recolor(this.colourToReplace[var4], this.colourToReplaceWith[var4]);
               }
            }

            if(this.textureToReplace != null) {
               for(var4 = 0; var4 < this.textureToReplace.length; ++var4) {
                  var6.method2465(this.textureToReplace[var4], this.textToReplaceWith[var4]);
               }
            }

            var5 = var6.light(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            var5.field1957 = true;
            itemModelCache.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IS)Lde;",
      garbageValue = "16359"
   )
   public final ModelData method4553(int var1) {
      int var3;
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class169.getItemDefinition(var2).method4553(1);
         }
      }

      ModelData var4 = ModelData.method2414(CombatInfoListHolder.field1378, this.inventoryModel, 0);
      if(var4 == null) {
         return null;
      } else {
         if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.method2466(this.resizeX, this.resizeY, this.resizeZ);
         }

         if(this.colourToReplace != null) {
            for(var3 = 0; var3 < this.colourToReplace.length; ++var3) {
               var4.recolor(this.colourToReplace[var3], this.colourToReplaceWith[var3]);
            }
         }

         if(this.textureToReplace != null) {
            for(var3 = 0; var3 < this.textureToReplace.length; ++var3) {
               var4.method2465(this.textureToReplace[var3], this.textToReplaceWith[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ZB)Z",
      garbageValue = "-14"
   )
   public final boolean method4559(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!CombatInfoListHolder.field1378.method4137(var2, 0)) {
            var4 = false;
         }

         if(var3 != -1 && !CombatInfoListHolder.field1378.method4137(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1671415037"
   )
   @Export("post")
   void post() {
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ZI)Lde;",
      garbageValue = "-1679374923"
   )
   public final ModelData method4564(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.method2414(CombatInfoListHolder.field1378, var2, 0);
         if(var3 != -1) {
            ModelData var5 = ModelData.method2414(CombatInfoListHolder.field1378, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if(this.colourToReplace != null) {
            for(var7 = 0; var7 < this.colourToReplace.length; ++var7) {
               var4.recolor(this.colourToReplace[var7], this.colourToReplaceWith[var7]);
            }
         }

         if(this.textureToReplace != null) {
            for(var7 = 0; var7 < this.textureToReplace.length; ++var7) {
               var4.method2465(this.textureToReplace[var7], this.textToReplaceWith[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lfp;B)V",
      garbageValue = "-12"
   )
   @Export("loadBuffer")
   void loadBuffer(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.populateFromBuffer(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "1999574722"
   )
   @Export("readyWorn")
   public final boolean readyWorn(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!CombatInfoListHolder.field1378.method4137(var2, 0)) {
            var5 = false;
         }

         if(var3 != -1 && !CombatInfoListHolder.field1378.method4137(var3, 0)) {
            var5 = false;
         }

         if(var4 != -1 && !CombatInfoListHolder.field1378.method4137(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ZI)Lde;",
      garbageValue = "-897205923"
   )
   @Export("getWornModelData")
   public final ModelData getWornModelData(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.method2414(CombatInfoListHolder.field1378, var2, 0);
         if(var3 != -1) {
            ModelData var6 = ModelData.method2414(CombatInfoListHolder.field1378, var3, 0);
            if(var4 != -1) {
               ModelData var7 = ModelData.method2414(CombatInfoListHolder.field1378, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if(!var1 && this.maleOffset != 0) {
            var5.method2453(0, this.maleOffset, 0);
         }

         if(var1 && this.femaleOffset != 0) {
            var5.method2453(0, this.femaleOffset, 0);
         }

         int var9;
         if(this.colourToReplace != null) {
            for(var9 = 0; var9 < this.colourToReplace.length; ++var9) {
               var5.recolor(this.colourToReplace[var9], this.colourToReplaceWith[var9]);
            }
         }

         if(this.textureToReplace != null) {
            for(var9 = 0; var9 < this.textureToReplace.length; ++var9) {
               var5.method2465(this.textureToReplace[var9], this.textToReplaceWith[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lix;Lix;I)V",
      garbageValue = "-230006052"
   )
   void method4555(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.price = var2.price;
      this.isStackable = 1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lix;Lix;B)V",
      garbageValue = "-2"
   )
   void method4609(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var2.colourToReplace;
      this.colourToReplaceWith = var2.colourToReplaceWith;
      this.textureToReplace = var2.textureToReplace;
      this.textToReplaceWith = var2.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.isStackable = var2.isStackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.maleHeadModel = var2.maleHeadModel;
      this.maleHeadModel2 = var2.maleHeadModel2;
      this.femaleHeadModel = var2.femaleHeadModel;
      this.femaleHeadModel2 = var2.femaleHeadModel2;
      this.field3531 = var2.field3531;
      this.groundActions = var2.groundActions;
      this.inventoryActions = new String[5];
      if(var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lix;Lix;I)V",
      garbageValue = "1542795067"
   )
   void method4570(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.isStackable = var1.isStackable;
      this.name = var2.name;
      this.price = 0;
      this.isMembers = false;
      this.field3487 = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lix;",
      garbageValue = "71"
   )
   public ItemComposition method4556(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class169.getItemDefinition(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1352989138"
   )
   public int method4563() {
      return this.team != -1 && this.inventoryActions != null?(this.team >= 0?(this.inventoryActions[this.team] != null?this.team:-1):("Drop".equalsIgnoreCase(this.inventoryActions[4])?4:-1)):-1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "599891641"
   )
   public int method4561(int var1, int var2) {
      return class20.method174(this.field3532, var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-118"
   )
   public String method4562(int var1, String var2) {
      return class43.method653(this.field3532, var1, var2);
   }
}
