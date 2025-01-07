import com.phidget22.*; 
public class LEDBrightness {

	public static void main(String[] args)throws Exception {
	    //Create 
	    DigitalOutput redLED = new DigitalOutput();
	
	    //Address 
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	
	    //Open 
	    redLED.open(1000);
	
	    //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
	    for(int i = 0; i <= 10; i++) {
	    	Thread.sleep(200);
	    	redLED.setDutyCycle(i * 0.1);
	    	
	    }
	    
	    for(int i = 10; i >= 0; i--) {
	    	Thread.sleep(200);
	    	redLED.setDutyCycle(i * 0.1);
	    	
	    }
	}
}
		  

	


