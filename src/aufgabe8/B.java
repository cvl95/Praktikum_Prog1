package aufgabe8;

public class B {
   public static int counter=0;
   
   public static int expPowerRec(int a, int n) {
      counter++;
      if(n==0) 
         return 1;
      if(n==1)
         return a;
      return a*expPowerRec(a,n-1);
   }
   public static int expPowerIter(int a, int n) {
      
      int value=1;     
      for(int i=0;i<n;i++) {
         value=value*a;
         counter++;
      }
      return value;
   }
   public static int expPowerRecMod(int a, int n) {
      
      if(n==0) 
         return 1;
      if(n==1)
         return a;
      if(n%2==0) {
         a=expPowerRecMod(a,n/2);
         counter++;
         return (a*a);
      }
      else {
    	 counter++;
         return a*expPowerRecMod(a,n-1);
      }
      
   }
   public static void main(String args[]) {
      
      System.out.println("Rekursiv:             "+expPowerRec(6,48)+" Durchläufe: "+counter);
      counter=0;
      System.out.println("Iterativ:             "+expPowerIter(6,48)+" Durchläufe: "+counter);
      counter=0;
      System.out.println("Rekursiv verbessert:  "+expPowerRecMod(6,48)+" Durchläufe: "+counter);
   }

}
