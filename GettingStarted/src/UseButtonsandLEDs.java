//Add Phidgets Library 
import com.phidget22.*;
public class UseButtonsandLEDs {
//Handle Exceptions 
public static void main(String[] args) throws Exception{

    //Create 
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput greenLED = new DigitalOutput();
    DigitalInput redButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    int buttonCount = 0;
    Boolean buttonPressed = true;
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
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);

    //Use your Phidgets 
    while(true){

        if( redButton.getState()){
            greenLED.setState(false);
        } else {
            greenLED.setState(true);
        }

        if(greenButton.getState()){
            redLED.setState(false);
        } else {
            redLED.setState(true);
        }

        
       	if((greenButton.getState() || redButton.getState()) && !buttonPressed) {
   		 buttonCount++;
   		 System.out.println("Button has been pressed " + buttonCount + " times");
   		 buttonPressed = true;
       	}  
		else if((!greenButton.getState() && !redButton.getState()) && buttonPressed) {
			buttonPressed = false;
		}
        
        
        Thread.sleep(100);
    }
}
}

