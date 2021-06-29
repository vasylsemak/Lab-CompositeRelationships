
public class WeatherMachine {
	private Thermometer tm = new Thermometer();
	int[] tempsArr;
	
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
		System.out.println("Your Last 24 Hours:");
		System.out.println("                   ");
		
		WeatherMachine wm = new WeatherMachine();
		int[] tempsArr = wm.getPastTemperatures();
        
        for(int i = 0; i < tempsArr.length; i++) {
        	System.out.println(i + ":00 - " + tempsArr[i] + " degrees");
        	System.out.println("                   ");
        }
	}
	
}
