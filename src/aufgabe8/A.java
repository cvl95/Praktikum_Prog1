package aufgabe8;

public class A {
	
	public static int f1(int x) {
		return (int) (-1/Math.exp(x) + 1e20);//
	}
	public static int f(int x) {
		return (int) (Math.pow(x, 3)-24*Math.pow(x, 2)+59*x+420);
	}
	
	public static int simpleZero(int lower, int upper) {
		int zero=1, middle=0, count=0;
		while(zero!=middle) {
			if(f(middle)>middle||f(middle)<middle) {
				if(f(middle)>middle)
					upper=middle;
				else
					lower=middle;
			}			
			middle=(Math.abs(lower)+upper)/2+lower;
			if(f(middle)==0) 	
				zero=middle;
			count++;
		}
		System.out.println("Schleifendurchläufe: "+ count);
		return zero;
		
	}
	public static int simpleZeroRec(int lower, int upper,int count) {
		int middle=(Math.abs(lower)+upper)/2+lower;
		while(f(middle)!=0) {
			if(f(middle)>middle)
				return simpleZeroRec(lower, middle, count+1);
			else
				return simpleZeroRec(middle, upper, count+1);
		}
		System.out.println("Schleifendurchläufe: "+ count);
		return middle;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Nullstelle für x3 - 24 x2 + 59 x + 420: "+ simpleZeroRec(-10000,10000,0));

	}

}
