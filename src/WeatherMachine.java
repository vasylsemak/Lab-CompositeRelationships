
public class WeatherMachine {
	Thermometer tm;
	
	// class constructor
	public WeatherMachine() {
		tm = new Thermometer();
	}
	
	// getPastTemperatures
	private int[] getPastTemperatures() {
		int[] temperatures = new int[24];
		
		for(int i = 0; i < temperatures.length; i++) {
			temperatures[i] = tm.getTemperature();
		}
		
		return temperatures;
	}
	
	// getWeatherReport
	public void getWeatherReport() {
		int[] tempsArr = getPastTemperatures();
		
		System.out.println("Your Last 24 Hours:");
		System.out.println("                   ");
        
        for(int i = 0; i < tempsArr.length; i++) {
        	System.out.println(i + ":00 - " + tempsArr[i] + " degrees");
        	System.out.println("                   ");
        }
	}
	
}
