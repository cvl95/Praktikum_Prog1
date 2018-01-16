package aufgabe10;

public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Queue queue1= new Queue();
      queue1.pushLL("Günther");
      queue1.pushLL("Klaus");
      queue1.pushLL("Elisa");
      queue1.pushLL("Chris");
      queue1.pushLL("Mario");
      queue1.pushLL("Chiu");
      System.out.println(queue1.tostringLL());
      System.out.println(queue1.popLL().name);
      System.out.println(queue1.popLL().name);
      System.out.println(queue1.popLL().name);
      System.out.println(queue1.popLL().name);
      System.out.println(queue1.tostringLL());
      queue1.pushArr("Günther");
      queue1.pushArr("Klaus");
      queue1.pushArr("Elisa");
      queue1.pushArr("Chris");
      queue1.pushArr("Mario");
      queue1.pushArr("Chiu");
      System.out.println(queue1.toStringArr());
      System.out.println(queue1.popArr().name);
      System.out.println(queue1.popArr().name);
      System.out.println(queue1.popArr().name);
      System.out.println(queue1.popArr().name);
      System.out.println(queue1.toStringArr());
      
      
   }

}
