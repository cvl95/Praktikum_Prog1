package aufgabe9;


public class Car  {
	   private float x;
	   private int speedState,fuelState,watchState;
	   private final int maxSpeed,maxFuel,cubicCap;
	   private final int[] fuelConsumption=new int[20];
	   private boolean motorState;
	   
	   public Car(int speed,int fuel,int cap){
		   maxSpeed=speed;
		   maxFuel=fuel;
		   cubicCap=cap;
		   for(int i=0;i<fuelConsumption.length;i++)
			   fuelConsumption[i]=(int)Math.pow(i, cubicCap)/100;
		   speedState=0;
		   fuelState=0;
		   watchState=0;
		   motorState=false;
	   }
	   public Car(Car c){//(copy constructor) kopiert Modelltyp
		   maxSpeed=c.maxSpeed;
		   maxFuel=c.maxFuel;
		   cubicCap=c.cubicCap;
		   speedState=0;
		   fuelState=0;
		   watchState=0;
		   motorState=false;
	   }


	    
	   public void setEngine() {
		   motorState= !motorState;
	   }
	   public void setSpeed(int chosenSpeed) {
		   if(motorState==true&chosenSpeed<=maxSpeed) {
			   speedState=chosenSpeed;
		   }
	   }
	   public void refuel(int volume) {
		   if(fuelState+volume<=maxFuel)
			   fuelState=fuelState+volume;
		   else
			   fuelState=maxFuel;
	   }
	   public void tick() {
		   watchState++;
		   updateState();
	   }
	   public void updateState() {
		   float x0=x;
		   x=x+speedState*1;
		   while(fuelState>0) {
			   fuelState=(int) (fuelState-(fuelConsumption[speedState]*(x-x0)));
		   }
		   if(fuelState==0&motorState==true) {
			   setEngine();
			   speedState=0;
		   }
		   
		   
	   }
	   public String toString() {
		   return ("Motor läuft: "+motorState+"\nMomentangeschwindigkeit in m/s: "+speedState+"\nTankfüllstand in l:"+fuelState+"\nUhrzeit: "+watchState);
	   }
	   	   
	   
	   public float getX()  {
	      return x++; 
	   }
	    
	   public float getY()  {
	      return 50;
	   }
	    
	    
	   public boolean getMotorOn() {
	      return motorState; 
	   }
	    
	   public float getFuelTankCapacity() {
	      return maxFuel;
	   }
	    
	   public float getFuel() {
	      return fuelState;
	   }
	    
	   public float getMaxSpeed() {
	      return maxSpeed;
	   }
	    
	   public float getSpeed() {
		return speedState;
	   }
	   public static void main() {
		   Car ferrari=new Car(80,70,2);
		   ferrari.setEngine();
		   ferrari.setSpeed(60);
		   System.out.print(ferrari.toString());
		   for(int i=0;i<9000;i++)
		   {
			   ferrari.tick();
		   }
		   System.out.print(ferrari.toString());
	   }

	    
	}