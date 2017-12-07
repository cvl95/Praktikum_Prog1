package Aufgabe2;

public class Overflow {
	
	public static void main(String[] args) {

	   float r=1.0f/6;
	   System.out.println(r);
	   System.out.println(r*3);
	   System.out.println(r*3.0==0.5);
	   //Float.toBinaryString(r);
	   long bits = Float.floatToIntBits(r);
	   System.out.println(bits);
	   System.out.println(r);
	   r=r*3;
	   System.out.println(r);
	   r=r*2;
	   System.out.println(r);
	   System.out.println(r==1);
		//#int i = ();
		//System.out.println(i);
	}

}
