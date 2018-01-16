package aufgabe10;

import java.util.Scanner;

public class Queue {
   private Paesant first, between, last;
   public void push(String name) {
     if(first==null) {
        first = new Paesant(name, null);
     }
     else {
        if(first.next==null) {
           between = new Paesant(name, null);
           first.next=between;
        }
        else {
           last = new Paesant(name,null);
           between.next=last;
           between=last;
        }
     }
        
   }
   public Paesant top() {
      if(first!=null) {
         return first;
      }
      else {
         System.out.println("Keine Schlange");
         return null;
      }
   }
   public Paesant pop() {
      Paesant out;
      if(first!=null) {
         out=first;
         first=first.next;       
         return out;
      }
      else {
         System.out.println("Keine Schlange");
         return null;
      }
   }
   public String tostring() {
      Paesant lnk=first;
      String queue = "";
      while(lnk!=null) {
         queue+=lnk.name+", ";
         lnk=lnk.next;
      }
      return queue;
   }
   
   public static void main(String args[]) {
      

   }

}
