package Aufgabe2;

public class C {
	
	public static void main(String[] args) {
				
		System.out.println("4+3 = "+ (4+3));
		System.out.println("2.4+3.7 = "+ (2.4+3.7));
		System.out.println("2.4pi+2.3e2 ="+ (2.4*Math.PI+2.3e2));
		System.out.println("\n");
		
		System.out.println("4-3 = "+ (4-3));
		System.out.println("2.4-3.7 = "+ (2.4-3.7));
		System.out.println("2.4pi-2.3e2 ="+ (2.4*Math.PI-2.3e2));
		System.out.println("\n");
		
		System.out.println("4*3 = "+ (4*3));
		System.out.println("2.4*3.7 = "+ (2.4*3.7));
		System.out.println("2.4pi*2.3e2 ="+ (2.4*Math.PI*2.3e2));
		System.out.println("\n");
		
		System.out.println("4:3 = "+ (4/3));
		System.out.println("2.4:3.7 = "+ (2.4/3.7));
		System.out.println("2.4pi:2.3e2 ="+ (2.4*Math.PI/2.3e2));
		System.out.println("\n");
		
		System.out.println("7/2 = "+ (7/2));
		System.out.println("9.5/2 = "+ (9.5/2));
		System.out.println("2.3e2/2 = " + (2.3e2/2));
		System.out.println("\n");
		
		System.out.println("333333333 + 3 = " + (333333333+3));
		System.out.println("2222222222222222.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444e22 * 2 = " + (22222222222222222222222222222222222222222222222222222222222222222222222222.44444444444444444444444444444444444444444444444444444444444444444444444444444444444443e222 * 2));
		System.out.println("\n");
		
		System.out.println("2147483647 + 1 = " + ((2147483647 + 1)) );// ein Bit wird angehängt, die Stellen klappen um das 32. Bit gibt das Minus-Vorzeichen an
	   System.out.println("2147483647 * 2 = " + ((2147483647 *2)) );//
		System.out.println("1.8*10e308 + 1.8*10e1 = "+ (1.8*10e307 + 1.8+10e1));// Verlässt den mit Float darstellbaren Zahlenbereich, deshalb Infinity
		System.out.println("\n");

		
		try {
         System.out.println("0 / 0 = " + (0/0)); //Löst Exception aus
         
         System.out.println("-2 / 0 = " + (-2/0));
         System.out.println("2 / 0 = " + (2/0));
         System.out.println("-2.3e1 / 0 = " + (-2.3e1/0));
         System.out.println("2.3e1 / 0 = " + (2.3e1/0));
         System.out.println("\n");
      } catch (ArithmeticException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
		
		
		
		
	}

}
