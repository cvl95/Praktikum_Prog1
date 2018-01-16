package aufgabe10;

import java.util.Scanner;

public class Queue {
   private Paesant first, between, last;
   
   private int iLast=0;
   Paesant[] queue = new Paesant[30];
   
   
   public void pushArr(String name) {// Push Array
      
      queue[iLast]= new Paesant(name, null);
      iLast++;
   }
   
   public Paesant popArr() {// Pop Array
      
      Paesant out=queue[0];
      for(int i=0;i<iLast-1;i++) {
         queue[i]=queue[i+1];
      }
      queue[iLast-1]=null;
      iLast--;
      return out;
   }
   
   public String toStringArr() {
      String out="";
      for(int i=0;i<iLast;i++) {
         if(queue[i]!=null) {
            out+=queue[i].name; 
         }
         if(queue[i+1]!=null) {
            out+=", ";
         }
      }
     
      return out;
   }
   
   
   public void pushLL(String name) {// Push Verkettete Liste
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
   public Paesant topLL() {//Top Verkettete Liste
      if(first!=null) {
         return first;
      }
      else {
         System.out.println("Keine Schlange");
         return null;
      }
   }
   
   public Paesant popLL() {// Pop Verkettete Liste
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
   
   public String tostringLL() {// to String Verkettete Liste
      Paesant lnk=first;
      String queue = "";
      while(lnk!=null) {
         queue+=lnk.name;
         if(lnk.next!=null) {
            queue+=", ";
         }
         lnk=lnk.next;
      }
      return queue;
   }
   
   public static void main(String args[]) {
      

   }

}
