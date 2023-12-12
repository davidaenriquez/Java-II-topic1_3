/**
 * David Enriquez
 * CST-239
 * Assignment: CST-239 Activity 1 topic1-3
 * December 12, 2023
 * Citations(s):
 * Grand Canyon University CST-239 Activity 1 Guide
 */
package game;
import car.Car;

/**
 * The Game class simulates the game involving
 * a car object and reflects the functionalities
 * of the Car class
 */
public class Game {

	/**
	 * The main method is the entry point
	 * of the application where we create
	 * a Car object and perform actions on
	 * the Car object by calling the various
	 * methods
	 * @param args
	 */
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.hasAllFourTires();
		myCar.checkTirePressure();
		myCar.startEngine();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.brake();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.brake();
		myCar.stopEngine();

	}

}
