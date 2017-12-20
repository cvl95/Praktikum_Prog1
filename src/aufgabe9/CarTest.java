package aufgabe9;

public class CarTest  {  
    public static void main(String[] args) { 
        Car ferrari = new Car(79, 40, 1);
        Traffic trafficlane1 = new Traffic(ferrari);
        trafficlane1.setSize(1000, 200);
        trafficlane1.setVisible(true);  
     
        // start animation
        trafficlane1.start();
        ferrari.refuel(10);
        ferrari.setEngine();
        Traffic.waitAWhile(1000);
        ferrari.setSpeed(50);
        Traffic.waitAWhile(5000);        
        Traffic.waitAWhile(7000);
        ferrari.changeLane();
        Traffic.waitAWhile(5000);
        ferrari.refuel(30);
        Traffic.waitAWhile(5000);
        ferrari.setEngine();
        Traffic.waitAWhile(1000);
        ferrari.setEngine();
        ferrari.setEngine();
        ferrari.setSpeed(20);
        

        
        // put your code for car state manipulation here
    } 
}
