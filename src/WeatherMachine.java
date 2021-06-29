import java.util.Arrays;

public class WeatherMachine {
	private Thermometer tm = new Thermometer();
	
	private int[] getPastTemperatures() {
		int[] temperatures = new int[24];
		
		for(int i = 0; i < temperatures.length; i++) {
			temperatures[i] = tm.getTemperature();
		}
		
		return temperatures;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherMachine wm = new WeatherMachine();
		
		System.out.println("--> " + Arrays.toString( wm.getPastTemperatures() ));
	}

}
