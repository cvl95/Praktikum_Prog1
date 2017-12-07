package aufgabe6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharArrayManipulation {
	public static void printLn(char array[]) {
		for(int i = 0;i<array.length;i++) {
			if(array[i]!=' ') {
				System.out.print(array[i]+"");				
			}
			
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char cInput=' ';
		int iCount = 1;
		char[] buffArray;  
		char[] costumArray;
		char[] replacedArray;
		char[] deletedArray;
		char[] deletedArray2;
		char[] insertedArray;
		int iCostArr=0;
		
		buffArray = new char[30];
		System.out.println("Geben Sie hier eine Zeichenkette mit max. 30 Zeichen ein:");
		while(cInput!='\r'){
				cInput = (char) System.in.read();							
			buffArray[iCount-1]=cInput;
			iCount++;
		}
		
		costumArray = new char[iCount-2];
		for(int i = 0; i<iCount-2;i++) {
			costumArray[i]=buffArray[i];
				
		}
		printLn(costumArray);
		
//		//Aufgabe 1
//		char z1=' ',z2=' ';
//		System.out.println("Ersetzen Sie ein Zeichen mit einem anderen(z.B.: a mit b ersetzen, Eingabeform:ab):");		
//		for(int i = 0; i<3;i++) {	
//			char cInput2 = (char) System.in.read();			
//			if(i==1)
//				z1=cInput2;
//			if(i==2)
//				z2=cInput2;
//		}
//		replacedArray = new char[costumArray.length];
//		for(int i = 0; i<costumArray.length;i++) {	
//			replacedArray[i]=costumArray[i];
//			if(replacedArray[i]==z1)
//				replacedArray[i]=z2;				
//		}
//		printLn(replacedArray);
//		
//		//Aufgabe 2
//		System.out.println("Geben Sie den Index der zu löschenden Stelle im Array an, beginnend mit 0:");
//		
//		int iDel=2;
//		
//		String input =  br.readLine();
//		System.out.print(input);
//		//iDel=Integer.valueOf(input);
//		deletedArray = new char[costumArray.length-1];
//		for(int i=iDel; i<costumArray.length-1;i++) {			
//			costumArray[i]=costumArray[i+1];
//		}
//		for(int i = 0; i<deletedArray.length;i++) {
//			deletedArray[i]=costumArray[i];
//		}		
//		printLn(deletedArray);
		//Aufgabe 3
//		System.out.println("Geben Sie einen Buchstaben an der aus dem Array entfernt werden soll:");
//		char cDel='f';
//		int delCount=0;
//		if(costumArray[costumArray.length-1]==cDel) 
//			costumArray[costumArray.length-1]=' '; 
//		
//		for(int i=0;i<costumArray.length;i++) {
//			if(costumArray[i]==cDel) 
//				delCount++;									
//			}
//		deletedArray2 = new char[costumArray.length-delCount];
//		int j=0;
//		for(int i=0;i<costumArray.length;i++) {			
//			if(costumArray[i]!=cDel) {
//			deletedArray2[j]=costumArray[i];
//			j++;
//			}
//		}		
//		printLn(deletedArray2);
		//Aufgabe 4 
//		System.out.println("Geben Sie einen Index an, an dieser Stelle wird ein Bindestrich eingefügt: ");
		
//		int index=1;
//		if(index>costumArray.length-1) {
//			System.out.println("Index zu hoch, Standartwert 1 wird verwendet");
//			index=4;
//		}
//		insertedArray = new char[costumArray.length+1];
//		insertedArray[index]='-';
//		for(int i=0;i<index;i++) {
//			insertedArray[i]=costumArray[i];
//		}
//		for(int i=index;i<costumArray.length;i++) {
//			insertedArray[i+1]=costumArray[i];
//		}
//		
//		printLn(insertedArray);
		
		//Aufgabe 5
		
		
	}
	
}

	


