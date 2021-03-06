import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("HashTableIterator")
public class HashTableIterator implements Iterator {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("head")
   Node head;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   @Export("table")
   IterableHashTable table;
   @ObfuscatedName("a")
   @Export("index")
   int index;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("tail")
   Node tail;

   @ObfuscatedSignature(
      signature = "(Lgi;)V"
   )
   HashTableIterator(IterableHashTable var1) {
      this.head = null;
      this.table = var1;
      this.reset();
   }

   @ObfuscatedName("q")
   @Export("reset")
   void reset() {
      this.tail = this.table.buckets[0].next;
      this.index = 1;
      this.head = null;
   }

   public void remove() {
      if(this.head == null) {
         throw new IllegalStateException();
      } else {
         this.head.unlink();
         this.head = null;
      }
   }

   public Object next() {
      Node var1;
      if(this.table.buckets[this.index - 1] != this.tail) {
         var1 = this.tail;
         this.tail = var1.next;
         this.head = var1;
         return var1;
      } else {
         do {
            if(this.index >= this.table.size) {
               return null;
            }

            var1 = this.table.buckets[this.index++].next;
         } while(var1 == this.table.buckets[this.index - 1]);

         this.tail = var1.next;
         this.head = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.table.buckets[this.index - 1] != this.tail) {
         return true;
      } else {
         while(this.index < this.table.size) {
            if(this.table.buckets[this.index++].next != this.table.buckets[this.index - 1]) {
               this.tail = this.table.buckets[this.index - 1].next;
               return true;
            }

            this.tail = this.table.buckets[this.index - 1];
         }

         return false;
      }
   }
}
