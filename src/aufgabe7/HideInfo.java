package aufgabe7;

public class HideInfo {
	   public static char[] replaceLetters(char[] array) {
		      array=CharArrayOps.replaceChar(array, 'e','i');
		      array=CharArrayOps.replaceChar(array, 'a','u');
		      return array;
	   }
	   public static char[] addLetters(char[] array) {
		      for(int i=1;i<array.length+1;i++,i++) 
		          array=CharArrayOps.insertChar(array, i, 'e');
		      return array;
	   }
	   public static char[] weaveArr(char[] array, char[] message) {
		      int messageIndex=0;
		      for(int i=1;i<array.length+1;i++,i++) {
		    	  array=CharArrayOps.insertChar(array,i,message[messageIndex]);
		    	  array=CharArrayOps.deleteLocArr(array, i+1);
		    	  messageIndex++;
		    	  if(messageIndex==message.length)
		    		  messageIndex=0;
		      }
		      return array;
	   }
	   public static char[] deleteVocals(char[] array) {
		      array=CharArrayOps.deleteChar(array,'a');
		      array=CharArrayOps.deleteChar(array,'e');
		      array=CharArrayOps.deleteChar(array,'i');
		      array=CharArrayOps.deleteChar(array,'o');
		      array=CharArrayOps.deleteChar(array,'u');
		      return array;
	   }

}
