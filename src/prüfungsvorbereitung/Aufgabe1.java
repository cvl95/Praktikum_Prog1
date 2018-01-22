package prüfungsvorbereitung;

public class Aufgabe1 {
   public static void main(String[] args) {
      int i = 1;
      System.out.println("A:" + (i=5) + " " + i); //5 5

      char c = 'D';
      System.out.println("B:" + ( 'a' < c && c < 'z') + " " + c);//false D

      c = 'y';
      System.out.println("C:" + (c++) + " " + c) ;//y z

      i = 7;
      System.out.println("D:" + (i /= 3) + " " + i);//2 2
      System.out.println(7/3);

      i = 7;
      System.out.println("E:" + (i >> 2) + " " + i);//1 7

      i = -1;
      System.out.println("F:" + Integer.toHexString(i));//ffffffff

      System.out.println("G:" + ("2" + "3"));//23

      Object object = "1.2";
      System.out.println("H:" + (object instanceof String));//true
      
       i = 0;
      System.out.println("A:" + i++ + " " + i);//A:0 1

      i = 0;
      System.out.println("B:" + --i + " " + i++ + " " + i);//B: -1 -1 0

      c = 'b';
      System.out.println("C:" + ('d' - c));//C:2

      i = 6;
      System.out.println("D:" + (i >> 2) + " " + i);//D:1 6

      i = 0x6;
      System.out.println("E:" + (i & 0x2));//E:2
      System.out.println("F:" + (i | 0x2));//F:6

      float f = Float.MAX_VALUE;
      System.out.println("G:" + (f+f));//G:Infinity

      String s1= new String("hallo"); String s2 = new String("hallo");
      System.out.println("H:" + (s1 == s2) + " " + s1.equals(s2));//H:false true
      
      i = 1;
      System.out.println("A:" + (i+=5) + " " + i);//A:6 6

      c = 'y';
      System.out.println("B:" + ( c < 'z' || ++c < 'z') + " " + c) ;//B:true z
      System.out.println(c);

      c = 'y';
      System.out.println("C:" + ( c < 'z' && ++c < 'z') + " " + c) ;//C:false z
      System.out.println(c);

      i = 7;
      System.out.println("D:" + (i / 5) + " " + i);//D:1 7

      i = 7;
      System.out.println("E:" + (i % 5) + " " + i);//E:2 7

      i = 15;
      System.out.println("F:" + Integer.toHexString(i));//F:f
      i++;
      System.out.println("G:" + Integer.toHexString(i));//G:10

      byte b = Byte.MAX_VALUE;
      System.out.println("H:" + Integer.toBinaryString(b));//H:1111111
      }
     }


