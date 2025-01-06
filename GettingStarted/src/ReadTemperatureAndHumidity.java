import com.phidget22.*;
public class ReadTemperatureAndHumidity {

    public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
        	if (humiditySensor.getHumidity() < 30) {
        		System.out.println("Humidity is low");
        		Thread.sleep(1000);
        	}
        	else {
        		System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH ");
        		Thread.sleep(200);
        	}
        	
        	if (temperatureSensor.getTemperature() < 21) {
        		System.out.println("Room is too cold.");
	            Thread.sleep(1000);
        	}
            else {
                System.out.println(" Temperature: " + temperatureSensor.getTemperature() + " °C");
                Thread.sleep(200);
            }
        }
    }

}
