package aufgabe9;

public class CarTest  {  
    public static void main(String[] args) { 
        Car ferrari = new Car(79, 40, 3);
        Traffic trafficlane1 = new Traffic(ferrari);
        trafficlane1.setSize(1000, 200);
        trafficlane1.setVisible(true);  
     
        // start animation
        
        ferrari.refuel(30);
        ferrari.setEngine();
        ferrari.setSpeed(50);
        trafficlane1.start();
        Traffic.waitAWhile(7000);
        ferrari.changeLane();
        ferrari.refuel(30);
        Traffic.waitAWhile(1000);
        ferrari.setEngine();
        ferrari.setSpeed(3);
        
        // put your code for car state manipulation here
    } 
}
