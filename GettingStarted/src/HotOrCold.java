import com.phidget22.*;
public class HotOrCold {

	 public static void main(String[] args) throws Exception{
	 
		//Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        
        //Address
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        //Open
        greenLED.open(1000);
        redLED.open(1000);
        temperatureSensor.open(1000);
        
        while (true) {

		System.out.println(" Temperature: " + temperatureSensor.getTemperature() + " °C");
		Thread.sleep(350);
		

	        if (24 > temperatureSensor.getTemperature() && 20 < temperatureSensor.getTemperature() ) {
	        	greenLED.setState(true);
	        	redLED.setState(false);  
	        }
	        
	        else {
	        	redLED.setState(true);
	        	greenLED.setState(false);
	        }
	        
}
	 }

}
