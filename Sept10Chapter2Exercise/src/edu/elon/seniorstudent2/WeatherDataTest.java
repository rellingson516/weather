/**
 * 
 */
package edu.elon.seniorstudent2;

import static org.junit.Assert.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author rellingson
 *
 */
public class WeatherDataTest {
	
	WeatherData weatherData;
	ModelObserver observer1;
	ModelObserver observer2;

	/**
	 * @throws java.lang.Exception
	 */
	
	public class ModelObserver implements Observer {
		
		float temp;
		float humid;
		float press;
		
		

		@Override
		public void update(Observable o, Object arg) {
			WeatherData data = (WeatherData) o;
			temp = data.getTemperature();
			humid = data.getHumidity();
			press = data.getPressure();
			
		}

		public float getTemp() {
			return temp;
		}
		
		public float getHumid() {
			return humid;
		}

		public float getPress() {
			return press;
		}

	}
	
	@Before
	public void setUp() throws Exception {
		observer1 = new ModelObserver();
		observer2 = new ModelObserver();
		weatherData = new WeatherData();
		weatherData.addObserver(observer1);
		weatherData.addObserver(observer2);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		weatherData = null;
	}

	@Test
	public void testSetMeasurementTemp() {
		ModelObserver observer3 = new ModelObserver();
		weatherData.addObserver(observer3);
		weatherData.setMeasurements(10, 20, 30);
		float expected = 10;
		float actual = observer3.getTemp();
		assertEquals(expected, actual, .00);
		
	}
	@Test
	public void testSetMeasurementHum() {
		ModelObserver observer3 = new ModelObserver();
		weatherData.addObserver(observer3);
		weatherData.setMeasurements(10, 20, 30);
		float expected = 20;
		float actual = observer3.getHumid();
		assertEquals(expected, actual, .00);
		
	}
	@Test
	public void testSetMeasurementPress() {
		ModelObserver observer3 = new ModelObserver();
		weatherData.addObserver(observer3);
		weatherData.setMeasurements(10, 20, 30);
		float expected = 30;
		float actual = observer3.getPress();
		assertEquals(expected, actual, .00);
		
	}
	
	@Test
	public void testAddObserver() {
		ModelObserver observer3 = new ModelObserver();
		weatherData.addObserver(observer3);
		int expectedCount = 3;
		int actualCount = weatherData.countObservers();
		assertEquals(expectedCount, actualCount);
	}
	
	@Test
	public void testDeleteObserver() {
		weatherData.deleteObserver(observer1);
		int expectedCount = 1;
		int actualCount = weatherData.countObservers();
		assertEquals(expectedCount, actualCount);
	}

}
