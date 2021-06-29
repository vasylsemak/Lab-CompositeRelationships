
public class WeatherMachine {
	Thermometer tm = new Thermometer();
	String city;
	
	// class constructors
	public WeatherMachine() { this.city = ""; }
	public WeatherMachine(String city) { this.city = city; }
	
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
		
		if(!city.equals("")) {
			System.out.println("Location: " + city);
			System.out.println("                   ");
		}
		System.out.println("Your Last 24 Hours:");
		System.out.println("                   ");
        
        for(int i = 0; i < tempsArr.length; i++) {
        	System.out.println(i + ":00 - " + tempsArr[i] + " degrees");
        	System.out.println("                   ");
        }
	}
	
}
