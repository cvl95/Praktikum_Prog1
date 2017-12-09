package aufgabe7;

public class Crypto {
   
   public static char[] encryptCeasar (char[] array, int key){
      
      for(int i=0;i<array.length;i++) {
         int character = (int) array[i];
         if(character+key>'z') {
        	 for(int j=key;j>=1;j--) {
        		 if(character=='z') {
        			 character='a';
        		 }
        		 else
        	 	 character++;
        	 }
         }
         else
        	 character=character+key;         
         array[i]=(char)character;
      }
      return array;
   }
   public static char[] decryptCeasar (char[] array, int key){
	   
	      for(int i=0;i<array.length;i++) {
	          int character = (int) array[i];
	          if(character-key<'a') {
	            	 for(int j=key;j>=1;j--) {
	            		 if(character=='a') {
	            			 character='z';
	            		 }
	        		 else
	        	 	 character--;
	            	 }
	          }
	          else
	         	 character=character-key;         
	          array[i]=(char)character;
	       }
   
	  return array;
   }
   public static char[] encryptBijective (char[] array, char[] keyArray) {

	   for(int i=0;i<array.length;i++) {
		   int characterIndex=array[i]-'a';
		   array[i]=keyArray[characterIndex];
	   }
	   return array;
   }
   public static char[] decryptBijective (char[] array, char[] keyArray) {

	   int characterIndex=0;
	   for(int i=0;i<array.length;i++) {
		   for(int j=0;j<keyArray.length;j++) {
			   if(array[i]==keyArray[j]) {
				   characterIndex=j;
			   }
		   }

		   
		   array[i]=(char) ('a'+characterIndex);
	   }

	   return array;
   }
   
   public static char[] arrayInitializer() {
	   char[] array=new char[26];
	   for(int i=0;i<26;i++) {
		   char array2[]= {'q','w','e','r','t','z','u','i','o','p','a','s','d','f','g','h','j','k','l','y','x','c','v','b','n','m'};
		   array[i]=array2[i];
		   }	   
	   return array;
   }
}