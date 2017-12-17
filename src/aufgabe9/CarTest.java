package aufgabe9;

public class CarTest  {  
    public static void main(String[] args) { 
        Car ferrari = new Car();
        Car ford = new Car();
        Traffic trafficlane1 = new Traffic(ferrari);
        Traffic trafficlane2 = new Traffic(ford);
        trafficlane1.setSize(1000, 200);
        trafficlane2.setVisible(true);  
     
        // start animation
        traffic.start();
        
        // put your code for car state manipulation here
    } 
}
