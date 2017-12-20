package aufgabe9;


public class Car  {
	   private float x,y;
	   private long lastTime,startTime;
	   private int speedState;
	   private int fuelState;
	   private final int maxSpeed,maxFuel;
	   private final double cubicCap;
	   private final double[] fuelConsumption=new double[80];
	   private boolean motorState;
	   
	   public Car(int speed,int fuel,double cap){
		   maxSpeed=speed;
		   maxFuel=fuel;
		   cubicCap=cap;
		   for(int i=0;i<fuelConsumption.length;i++)
			   fuelConsumption[i]=Math.pow(i, cubicCap)/1000000;
		   speedState=0;
		   lastTime=(System.nanoTime()/1000000000);
		   startTime=lastTime;
		   fuelState=0;
		   motorState=false;
		   y=50;
	   }
	   public Car(Car c){//(copy constructor) kopiert Modelltyp
		   maxSpeed=c.maxSpeed;
		   maxFuel=c.maxFuel;
		   cubicCap=c.cubicCap;
		   speedState=0;
		   fuelState=0;
		   lastTime=(System.nanoTime()/1000000000);
		   motorState=false;
		   y=c.y;
	   }


	    
	   public void setEngine() {
	      
		   motorState= !motorState;
		   updateState();
	   }
	   public void setSpeed(int chosenSpeed) {
		   if(motorState==true&chosenSpeed<=maxSpeed) {
			   speedState=chosenSpeed;
			   updateState();
		   }
	   }
	   public void refuel(int volume) {
//		   if(fuelState+volume<=maxFuel)
			   fuelState=fuelState+volume;
//		   else
//			   fuelState=maxFuel;
            updateState();
	   }
	   public void changeLane() {
	      if(y==50)
	         y=100;
	      else
	         y=50;
	   }
//	   public void tick() {
//		   watchState++;
//		   updateState();
//	   }
	   public void updateState() {
	      long newtime=(System.nanoTime()/1000000000)-lastTime;
		   float x0=x;
		   
		   lastTime=(System.nanoTime()/1000000000);
		   if(fuelState>0&motorState==true) {
		      x=x+speedState*(newtime);
			   fuelState= (int) (fuelState-(fuelConsumption[speedState]*(x-x0)));			   
		   }
		      
		   if(fuelState==0&motorState==true||motorState==false) {
			   motorState=false;
			   speedState=0;
		   }
		   if(fuelState<0)
		      fuelState=0;
	   }
	   public String toString() {
		   return ("Motor läuft: "+motorState+"\nMomentangeschwindigkeit in m/s: "+speedState+"\nTankfüllstand in l:"+fuelState+"\nUhrzeit: "+(lastTime-startTime)+"\n"+"Strecke: "+x+"\n");
	   }
	   
	   	   
	   
	   public float getX()  {
	      updateState();
	      return x;

	   }
	    
	   public float getY()  {
	      return y;
	   }
	    
	    
	   public boolean getMotorOn() {
	      return motorState;
	   }
	    
	   public float getFuelTankCapacity() {
	      return maxFuel;
	   }
	    
	   public double getFuel() {
	      return fuelState;
	   }
	    
	   public float getMaxSpeed() {
	      return maxSpeed;
	   }
	    
	   public float getSpeed() {
		return speedState;
	   }
	   public static void main(String[] args) {

		   Car ferrari=new Car(80,70,1);
		   
		   ferrari .refuel(50);
		   ferrari.setEngine();
		   ferrari.setSpeed(30);
		   for(int i=0;i<100;i++) {
		      
		      Traffic.waitAWhile(1000);
		      ferrari.updateState();
		      System.out.print(ferrari.toString());
		   }
		   System.out.print(ferrari.toString());
		   System.out.print(ferrari.toString());
	   }

	    
	}