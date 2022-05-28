package observer_pattern.observables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WeatherStationTest {

	@Test
	@DisplayName("Idojaras allomastol kapott homerseklet")
	void testGetTemperature() {
		WeatherStation ws = new WeatherStation();
		assertNotNull(ws.GetTemperature());
	}

}
