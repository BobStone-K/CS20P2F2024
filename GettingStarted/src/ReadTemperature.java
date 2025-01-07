import com.phidget22.*;
public class ReadTemperature {

	 public static void main(String[] args) throws Exception{

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
            System.out.println("Temperature in Farenheit: " + (1.8*temperatureSensor.getTemperature() + 32) + "°F" );
            System.out.println("Temperature in Celsius: " + (temperatureSensor.getTemperature()) + "°C" );
            Thread.sleep(500);
	        }
	    }

}
