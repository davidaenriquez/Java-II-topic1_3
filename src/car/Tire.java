/**
 * David Enriquez
 * CST-239
 * Assignment: CST-239 Activity 1 topic1-3
 * December 12, 2023
 * Citations(s):
 * Grand Canyon University CST-239 Activity 1 Guide
 */
package car;

/**
 * The Tire class simulates a tire on
 * a vehicle and provides methods to 
 * check the tire pressure
 */
public class Tire {
	private int pressure;
	
	/**
	 * Constructs a Tire object with the
	 * default pressure set to 35
	 */
	public Tire() {
		this.pressure = 35;
	}
	
	/**
	 * This method checks the tire pressure
	 * and returns the tire pressure value
	 * @return
	 */
	public int checkPressure() {
		return pressure;
	}
}
