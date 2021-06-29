
public class Simulation {

	public static void main(String[] args) {
		WeatherMachine wm = new WeatherMachine();
		wm.getWeatherReport();
		
		WeatherMachine wm2 = new WeatherMachine("Ternopil");
		wm2.getWeatherReport();
	}

}
