import com.phidget22.*;

public class Thermostat {

	public static void main(String[] args) throws Exception{
	    //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput greenLED = new DigitalOutput();
	    DigitalInput redButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	    
	    //Address 
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);

	    //Open 
	    temperatureSensor.open(1000);
	    greenButton.open(1000);
	    greenLED.open(1000);
	    redButton.open(1000);
	    redLED.open(1000);

	    
	    double setTemperature = 21;
	    Boolean buttonPressed = false;
	    double currentTemperature;
	    int loopCounter = 50;
	    
	    while(true) {
	    	loopCounter++;
	    	currentTemperature = temperatureSensor.getTemperature();
	       	if(greenButton.getState() && !buttonPressed) {
	       		setTemperature++;
	      		 buttonPressed = true;
	          	} else if(redButton.getState() && !buttonPressed){
	          		setTemperature--;
	          		buttonPressed = true;
	    }else if((!greenButton.getState() && !redButton.getState()) && buttonPressed) {
	   			buttonPressed = false;
	   		}
	       	//if condition to know when 10 seconds pass to print messages
	       	if (loopCounter >= 50) {
		       	System.out.println("Current temperature is: " + currentTemperature + "°C");
		       	System.out.println("Set temperature is: " + setTemperature + "°C");
		       	loopCounter = 0;
	       	}
	       	
	        if (Math.abs(currentTemperature - setTemperature) <= 2) {
	        	greenLED.setState(true); 
	        	redLED.setState(false); 
	        }
	        else {
	        	 redLED.setState(true);
		         greenLED.setState(false);
	        }
	        Thread.sleep(200);
	    }
	}

}
