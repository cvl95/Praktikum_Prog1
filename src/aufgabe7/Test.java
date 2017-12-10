package aufgabe7;

public class Test {
	public static void main(String args[]) {
		
		char[] array=CharArrayOps.readInArr();
//		char[] message=CharArrayOps.readInArr();
//		CharArrayOps.printArr(array);
//		CharArrayOps.printArr(message);
//		
//		array=HideInfo.replaceLetters(array);
//		CharArrayOps.printArr(array);
//		array=HideInfo.addLetters(array);
//		CharArrayOps.printArr(array);
//		array=HideInfo.weaveArr(array,message);
//		CharArrayOps.printArr(array);
//		array=HideInfo.deleteVocals(array);
//		CharArrayOps.printArr(array);
		array=Crypto.encryptCeasar(array, 6);
		System.out.println("Encrypt Ceasar:");CharArrayOps.printArr(array);
		array=Crypto.decryptCeasar(array, 6);
		System.out.println("Decrypt Ceasar:");CharArrayOps.printArr(array);
		Crypto.encryptBijective(array, Crypto.arrayInitializer());
		System.out.println("Encrypt Blockchiffre:");CharArrayOps.printArr(array);
		Crypto.decryptBijective(array, Crypto.arrayInitializer());
		System.out.println("Decrypt Blockchiffre:");CharArrayOps.printArr(array);
	}

}
