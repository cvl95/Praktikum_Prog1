package aufgabe8;

public class D {
   
	public static boolean isPrimeOpt(int n) {
		if(n>2&n%2==0)
			return false;
		for(int t=3;t<n;t++,t++) {
			if(n%t==0)
				return false;
		}
		
			return true;
		
	}
	public static boolean isPrime(int n) {
      for(int t=3;t<n;t++) {
         if(n%t==0)
            return false;
      }
      
         return true;
      
   }
	public static int[] findPrimesOpt(int n) {
		int[] array=new int[n];
		int arrayCount=0;
		for(int i=0;i<n;i++) {
			if(isPrimeOpt(i)==true) {
				array[arrayCount]=i;
				arrayCount++;
			}
		}
		return array;
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
	
	public static void timeForFindPrimesOpt(int steps, int stepSize) {
	   long time=System.nanoTime();
		for(int i=1;i<=steps;i++) {
			findPrimesOpt(stepSize*i);
			System.out.print("A"+stepSize*i+","+(System.nanoTime()-time)+"\n");
		}
	}
	public static void timeForFindPrimes(int steps, int stepSize) {
      long time=System.nanoTime();
      for(int i=1;i<=steps;i++) {
         findPrimes(stepSize*i);
         System.out.print("A"+stepSize*i+","+(System.nanoTime()-time)+"\n");
      }
   }

	public static void timeForFindPrimesOpt(int steps) {
	   long time=System.nanoTime();
		for(int i=1;i<=steps;i++) {
			findPrimesOpt((int)Math.pow(2, i));
			System.out.print("A"+(int)Math.pow(2, i)+","+(System.nanoTime()-time)+"\n");
		}
	}
	public static void timeForFindPrimes(int steps) {
      long time=System.nanoTime();
      for(int i=1;i<=steps;i++) {
         findPrimes((int)Math.pow(2, i));
         System.out.print("A"+(int)Math.pow(2, i)+","+(System.nanoTime()-time)+"\n");
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
		System.out.println(isPrime(271));
		printArr(findPrimes(271));
		timeForFindPrimesOpt(20,2386);
		timeForFindPrimesOpt(24);
		timeForFindPrimes(20,2386);
		timeForFindPrimes(24);
		
	}

}
