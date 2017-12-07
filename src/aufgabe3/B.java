package aufgabe3;

import java.io.IOException;

public class B {
   
   public static void main(String[]args) {
      
      int op1 = 0, op2 = 0, operator = 0;
      


      try {
         op1=System.in.read();
         operator=System.in.read();
         op2=System.in.read();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      /*System.out.println(op1);
      System.out.println(operator);
      System.out.println(op2);*/
      
      if((op1>='a'&& op1<='z')) {
         
         op1=op1+('A'-'a');
         
      }
      if((op2>='a'&& op2<='z')) {
         
         op2=op2+('A'-'a');
         
      }
      
      boolean b1=false, b2=false;
      
      
      if(op1== 'F') {
         b1=false;   
      }
      else {         
         if(op1=='T') {            
            b1 = true;            
         }
         else {            
            System.out.println("Falsche Eingabe!: Erster Operand");  
            return;
         }
      }
      
      if(op2== 'F') {         
         b2=false;         
      }
      else {         
         if(op2=='T') {            
            b2 = true;            
         }
         else {            
            System.out.println("Falsche Eingabe!: Zweiter Operand");
            return;
         }
    
     }
      
     switch (operator) {
     case '&':{         
         System.out.println(b1&b2);
         break;
     }
     case '|':{         
         System.out.println(b1|b2);    
         break;
     }
     case '^':{         
         System.out.println(b1^b2);
         break;
     }
     
     }
          
   }

}
