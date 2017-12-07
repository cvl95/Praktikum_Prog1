package aufgabe7;

import java.io.IOException;

public class CharArrayOps {   
   public static char[] readInArr() {//1. Einlesen des Array-Inhalts als eine Zeile von der Standardeingabe 
      int iCount=1,costArr=0;
      char cInput=' ';                
      char costumArray[];
      char[] buffArray = new char[30];
      System.out.println("Geben Sie hier eine Zeichenkette mit max. 30 Zeichen ein:");
      while(cInput!='\n'){
            try {
               cInput = (char) System.in.read();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }                     
         buffArray[iCount-1]=cInput;
         iCount++;
      }     
      costumArray = new char[iCount-3];
      for(int i = 0; i<iCount-3;i++) {
         costumArray[i]=buffArray[i];            
      }
      return costumArray;
   }
   public static void printArr(char array[]) {//2. Ausgeben des Array-Inhalts als eine Zeile auf die Standardausgabe
      for(int i = 0;i<array.length;i++) {
         if(array[i]!=' ') {
            System.out.print(array[i]+"");            
         }
         
      }
      System.out.println();
   }
   public static char[] replaceChar(char array[], char z1, char z2) { //3. Ersetzen eines spezifizierten Buchstabens durch einen anderen spezifizierten Buchstaben im gesamten Array.
      char [] replacedArray;
      replacedArray = new char[array.length];
      for(int i = 0; i<array.length;i++) {   
         replacedArray[i]=array[i];
         if(replacedArray[i]==z1)
            replacedArray[i]=z2;          
      }
      return replacedArray;
   }
   public static int searchStrArr(char[] array, char[] searchArray2) {//4. Prüfen, ob ein Array als Muster (Teilarray) in einem anderen Array enthalten ist. Wenn ja, Rückgabe wo (Anfangsposition, bei mehreren Vorkommen die erste), ansonsten Rückgabe von -1.
      for(int i=0;i<=array.length-searchArray2.length;i++) {
         int matches = 0;
         for(int k=0;k<=searchArray2.length-1;k++) {
            if(searchArray2[k]==array[i+k]) {
               matches++;
            }
            if(matches==searchArray2.length) {
              return i;   
            }
         }
         
      }
      return -1;
   }
   public static char[] deleteLocArr(char[] array,int iDel){//5. Löschen eines einzelnen Zeichens, dessen Position im Array als Parameter vorgegeben wird.
      char[] deletedArray = new char[array.length-1];
      for(int i=iDel; i<array.length-1;i++) {         
         array[i]=array[i+1];
      }
      for(int i = 0; i<deletedArray.length;i++) {
         deletedArray[i]=array[i];
      }
      return deletedArray;
   }
   
   public static char[] deleteChar(char[] array, char cDel) {//6. Löschen aller Vorkommen eines per Parameter vorgegebenen Zeichens im Array.     
      int delCount=0;
      if(array[array.length-1]==cDel) 
         array[array.length-1]=' '; 
      
      for(int i=0;i<array.length;i++) {
         if(array[i]==cDel) 
            delCount++;                         
         }
      char [] deletedArray = new char[array.length-delCount];
      int j=0;
      for(int i=0;i<array.length;i++) {         
         if(array[i]!=cDel) {
         deletedArray[j]=array[i];
         j++;
         }
      }     
      return deletedArray;
   }
   public static char[] insertChar(char[] array,int index, char cIn) {//7. Einfügen eines Zeichens (evtl. sogar Zeichenfolge) an einer vorgebbaren Stelle.
      if(index>array.length) {
         index=0;
      }     
      char[] insertedArray = new char[array.length+1];
      insertedArray[index]=cIn;
      for(int i=0;i<index;i++) {
         insertedArray[i]=array[i];
      }
      for(int i=index;i<array.length;i++) {
         insertedArray[i+1]=array[i];
      }  
      return insertedArray;
   }
   public static char[] copyArr(char[] array) {
	   char [] copiedArray = new char[array.length-1];
	   for(int i=0;i<array.length-1;i++)
		   copiedArray[i]=array[i];
	   return copiedArray;
   }

}
   