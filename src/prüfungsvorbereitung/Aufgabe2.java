package prüfungsvorbereitung;

import java.lang.reflect.Array;

public class Aufgabe2 {
   
   public static int indexOf(char array[], char search) {
      
      for(int i=0; i<array.length-1;i++) {
         if(array[i]==search) {
            return i;
         }
      }
         return -1;
      
   }
   public static char[] deleteAt(char array[], int index) {
      
      char[] deletedArray = new char[array.length-1];
      
      if(index==array.length-1) {
         for(int i=0;i<deletedArray.length;i++) {
            deletedArray[i]=array[i];
         }
        
      }
      else {
         for(int i=0;i<index;i++) {
            deletedArray[i]=array[i];
         }
         for(int i=index;i<deletedArray.length;i++) {
            deletedArray[i]=array[i+1];
         }
      }
      return deletedArray;
   }
   
   public static String toString(char[] array) {
      String s="";
      for(int i=0;i<array.length;i++) {
         s+=array[i];
      }  
      return s;
   }
   public static char[] deleteAll(char[] arr,char del) {
      int i=0;
      while(i!=-1) {
         i=indexOf(arr,del);
         if(i!=-1) {
            arr=deleteAt(arr,i);
         }
      }
      return arr;
   }
   public static void main(String args[]) {
      char[] arr= {'a','a','b','c','d','e','f'};
      System.out.println(toString(deleteAll(arr,'a')));
     
      
   }
   
   
   

}
