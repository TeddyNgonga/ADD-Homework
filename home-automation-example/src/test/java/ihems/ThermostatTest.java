package ihems;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ThermostatTest {

	private TemperatureSensor mockTemperatureSensor = mock(TemperatureSensor.class);
	private Furnace mockFurnace = mock(Furnace.class);
	private Thermostat thermostat = new Thermostat(mockTemperatureSensor, mockFurnace);

	/**
	 * Given the measured temperature is at or above the desired minimum
	 * temperature, When the desired minimum temperature is set to a value greater
	 * than the measured temperature, Then the Furnace should start.
	 */
	@Test
	void testWhenDesiredMinSetHigherThenFurnaceStarts() {
		when(mockTemperatureSensor.getTemperature()).thenReturn(20.0);
		thermostat.setDesiredTemperature(20.0);
		verify(mockFurnace).stop();
		thermostat.setDesiredTemperature(21.0);
		verify(mockFurnace).start();
	}

}
