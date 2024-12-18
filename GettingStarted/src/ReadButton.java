//Add Phidgets Library 
import com.phidget22.*;
public class ReadButton {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        Boolean buttonPressed = true;
        //Create 
        DigitalInput greenButton = new DigitalInput();
        //Address 
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        
        //Open 
        greenButton.open(1000);

        //Use your Phidgets 
        while(true){
        	if(greenButton.getState() && !buttonPressed) {
        		 System.out.println("Button State: " + greenButton.getState());
        		 buttonPressed = true;
        	}  
        	else if(!greenButton.getState() && buttonPressed) {
        		System.out.println("Button State: " + greenButton.getState());
        		buttonPressed = false;
        	}
        	Thread.sleep(150);
        }
    }
}
