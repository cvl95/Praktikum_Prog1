package aufgabe3;

import java.io.IOException;

public class C {
   
   public static void main(String args[]) {
      
      int z1=0,z2=0,z3=0,z4=0,z5=0,z6=0;

      
      try {
         z1=System.in.read();
         z2=System.in.read();
         z3=System.in.read();
         z4=System.in.read();
         z5=System.in.read();
         z6=System.in.read();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      if(z1!='\\') {         
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet");
         return;
      }
      
      if(z2!='u') {
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet");
         return;         
      }
      
      
   
      
      if(!(z3>='0'&&z3<='9'||z3>='a'&&z3<='f')) {
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet1");
         return;          
      }
      
      if(!(z4=='0'||z4=='1'||z4=='2'||z4=='3'||z4=='4'||z4=='5'||z4=='6'||z4=='7'||z4=='8'||z4=='9'||z4=='a'||z4=='b'||z4=='c'||z4=='d'||z4=='e'||z4=='f')) {
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet2");
         return;
      }
      
      if(!(z5=='0'||z5=='1'||z5=='2'||z5=='3'||z5=='4'||z5=='5'||z5=='6'||z5=='7'||z5=='8'||z5=='9'||z5=='a'||z5=='b'||z5=='c'||z5=='d'||z5=='e'||z5=='f')) {         
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet3");
         return;     
      }
      
      if(!(z6=='0'||z6=='1'||z6=='2'||z6=='3'||z6=='4'||z6=='5'||z6=='6'||z6=='7'||z6=='8'||z6=='9'||z6=='a'||z6=='b'||z6=='c'||z6=='d'||z6=='e'||z6=='f')) {
         System.out.print("Bei der Eingabe handelt es sich nicht um Unicode Ersatzdarstellung. Das Programm wird beendet4");
         return;     
      }

 /*     if(z3>='0'&&z3<='9') {
         z3 = z3 - '0';
      }
      else if(z3>='a'&&z3<='f') 
         z3 = z3 - 'a' + 10;
      else if(z3>='A'&&z3<='F') 
         z3 = z3 - 'A' + 10;
   */   
      char c3,c4,c5,c6;//Eingabe muss zu char gecastet werden, zur Weiterverarbeitung mit der Funktion getNumericValue der Klasse Character
      c3 = (char) z3;  
      c4 = (char) z4;
      c5 = (char) z5;
      c6 = (char) z6;
      
      
      String hexWert = ""+c3+c4+c5+c6; //Zusammenfügen der einzelnen Characters in einen String
      System.out.print("hex: " + hexWert+", ");
      int i3 = Character.getNumericValue(c3);//Die Weiterverarbeitung ist nur mit dem Literal des Zeichwerts möglich, nicht mit dem Wert des Zeichens im Darstellungscode, siehe System.in.read()
      int i4 = Character.getNumericValue(c4);
      int i5 = Character.getNumericValue(c5);
      int i6 = Character.getNumericValue(c6);
   
      int decWert = (i6*1 + i5*16 + (i4*16*16) + (i3*16*16*16));
      
      
      System.out.print("dec: " +(i6*1 + i5*16 + (i4*16*16) + (i3*16*16*16))+ ", ");
      System.out.print("char: "+ (char)decWert);//Int wird zu char gecastet
      
      return;
      
      
      
   }

}
