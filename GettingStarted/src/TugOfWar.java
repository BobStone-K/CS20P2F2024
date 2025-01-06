import com.phidget22.*;
public class TugOfWar {

 public static void main(String[] args) throws Exception{
	  
//Create | Create objects for your buttons and LEDs.
    DigitalInput redButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput greenLED = new DigitalOutput();
    //Address | Address your four objects which lets your program know where to find them.
    greenButton.setHubPort(5);
    greenLED.setHubPort(4);
    greenButton.setIsHubPortDevice(true);
    greenLED.setIsHubPortDevice(true);
    redButton.setHubPort(0);
    redLED.setHubPort(1);
    redButton.setIsHubPortDevice(true);
    redLED.setIsHubPortDevice(true);   
    //Open | Connect your program to your physical devices.
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);
    
    int greenCount = 0, redCount = 0;
    
    while (greenCount < 10 && redCount <10) {
    	if (greenButton.getState()) {
    		greenCount++;  
    		Thread.sleep(100);
    	}
    	if (redButton.getState()) {
    		redCount++;
    		Thread.sleep(100);
    	}
    	
    }
    	
    
    if (greenCount >= 10 || redCount >=10) {
    	greenLED.setState(true);
    	redLED.setState(true);
        Thread.sleep(400);
        greenLED.setState(false);
        redLED.setState(false);
        Thread.sleep(400);
    }
    	
    
    if (greenCount >= 10) {
    	 
        for (int i = 0; i < 5; i++) {
            greenLED.setState(true);
            Thread.sleep(300);
            greenLED.setState(false);
            Thread.sleep(300);
        }
    }
    
    if (redCount >= 10) {
        for (int i = 0; i < 5; i++) {
            redLED.setState(true);
            Thread.sleep(300);
            redLED.setState(false);
            Thread.sleep(300);
        }
    } 


  }

}
