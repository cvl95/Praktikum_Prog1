package aufgabe7;

public class Crypto {
   
   public static char[] encryptCeasar (char[] array, int key){
      
      for(int i=0;i<array.length;i++) {
         int character = (int) array[i];
         if(character+key>'z') 
        	 character=character+key-61;
         else
        	 character=character+key;         
         array[i]=(char)character;
      }
      return array;
   }
   public static char[] decryptCeasar (char[] array, int key){
	   
	      for(int i=0;i<array.length;i++) {
	          int character = (int) array[i];
	          if(character+key<'a') 
	         	 character=character-key+61;
	          else
	         	 character=character-key;         
	          array[i]=(char)character;
	       }
   
	  return array;
   }
   public static char[] encryptBijective (char[] array, char[] keyArray) {

	   for(int i=0;i<array.length;i++) {
		   int characterIndex=(int) array[i]-'a';
		   array[i]=keyArray[characterIndex+26];
	   }
	   return array;
   }
   public static char[] decryptBijective (char[] array, char[] keyArray) {
	   char[] reverseKey = new char [52];
	   int j=51;
	   for(int i=0;i<52;i++) {

		   reverseKey[i]=keyArray[j];
		   j--;
	   }
		   
	   for(int i=0;i<array.length;i++) {
		   int characterIndex=(int) array[i]-'a';
		   
		   array[i]=reverseKey[characterIndex];
	   }

	   return array;
   }
   
   public static char[] arrayInitializer() {
	   char[] array=new char[52];
	   for(int i=0;i<26;i++) {
		   array[i]= (char) ('a'+i);
	   }
	   for(int i=26;i<52;i++) {
		   char array2[]= {'q','w','e','r','t','z','u','i','o','p','a','s','d','f','g','h','j','k','l','y','x','c','v','b','n','m'};
		   array[i]=array2[i-26];
		   }	   
	   return array;
   }
}