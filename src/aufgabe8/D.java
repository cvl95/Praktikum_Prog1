package aufgabe8;

public class D {
	public static boolean isPrime(int n) {
		if(n>2&n%2==0)
			return false;
		for(int t=3;t<n;t++,t++) {
			if(n%t==0)
				return false;
		}
			return true;
		
	}
	public static int[] findPrimes(int n) {
		int[] array=new int[n];
		int arrayCount=0;
		for(int i=0;i<n;i++) {
			if(isPrime(i)==true) {
				array[arrayCount]=i;
				arrayCount++;
			}
		}
		return array;
	}
	public static void printArr(int array[]) {//Ausgeben des Array-Inhalts als eine Zeile auf die Standardausgabe
	      for(int i = 0;i<array.length;i++) {
	         if(array[i]!=0) {
	            System.out.print(array[i]+"\n");            
	         }
	         
	      }
	      System.out.println();
	   }
	
	public static void timeForFindPrimes(int steps, int stepSize) {
		for(int i=1;i<=steps;i++) {
			findPrimes(stepSize*i);
			System.out.print("A"+stepSize*i+","+Math.floor(System.nanoTime()*1e-7)+"\n");
		}
	}

	public static void timeForFindPrimes(int steps) {
		for(int i=1;i<=steps;i++) {
			findPrimes((int)Math.pow(2, i));
			System.out.print("A"+(int)Math.pow(2, i)+","+Math.floor(System.nanoTime()*1e-7)+"\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(13));
		System.out.println(isPrime(256));
		System.out.println(isPrime(19));
		System.out.println(isPrime(109));
//		System.out.println(isPrime(271));
//		printArr(findPrimes(271));
		//timeForFindPrimes(9,238609294);
//		timeForFindPrimes(24);
		
	}

}
