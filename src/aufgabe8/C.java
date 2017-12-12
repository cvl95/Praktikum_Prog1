package aufgabe8;

public class C {
	
	public static void print(int par) {
		while(par>-1){
			print(par-1);
			for(int i=0;i<=par;i++) {
				System.out.print(par);
			}
			System.out.println();
			par--;
		}
	}
	
	public static void main(String args[]) {
		print(6);
	}

}
