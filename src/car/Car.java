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
 * The Car class represents a vehicle
 * with an engine, tires, and speed
 */
public class Car {
	private Engine engine;
	private Tire[] tires;
	private int speed;
	
	/**
	 * Constructs a new Car object with
	 * default values, Engine object initialized,
	 * Four Tire objects created, with speed
	 * set to zero
	 */
	public Car() {
		this.engine = new Engine();
		this.tires = new Tire[]{new Tire(), new Tire(), new Tire(), new Tire()};
		this.speed = 0;
	}
	
	/**
	 * This method initiates the starting
	 * simulation for the car's engine
	 * calls the start() method from the
	 * Engine class
	 */
	public void startEngine() {
		engine.start();
	}
	
	/**
	 * This method initiates the stopping
	 * simulation for the car's engine
	 * calls the stop() method from the
	 * Engine class
	 */
	public void stopEngine() {
		engine.stop();
	}
	
	/**
	 * This method checks if the tire pressure is above
	 * the specified threshold for all tires
	 * returns true if the tire pressure is above
	 * 32 PSI for all tires, false otherwise.
	 * @return
	 */
	public boolean checkTirePressure() {
	    boolean allAboveThreshold = true;
	    for (Tire tire : tires) {
	        if (tire.checkPressure() < 32) {
	            allAboveThreshold = false;
	            break; // If any tire is below 32 PSI, exit the loop
	        }
	    }
	    if (allAboveThreshold) {
	        System.out.println("Tire pressure is above 32 PSI for all tires.");
	    } else {
	        System.out.println("Tire pressure is below 32 PSI for at least one tire.");
	    }
	    return allAboveThreshold;
	}
	
	/**
	 * This method checks if the vehicle has all four tires
	 * returns true if the vehicle has exactly four tires, false otherwise.
	 * @return
	 */
    public boolean hasAllFourTires() {
        boolean allFourTires = tires.length == 4;
        if (allFourTires) {
            System.out.println("All four tires are present on the vehicle.");
        } else {
            System.out.println("The vehicle does not have all four tires.");
        }
        return allFourTires;
    }
	
    /**
     * This method increases the car's speed
     * by 10 mph, up to a max speed of 60 mph,
     * and outputs to the console each time
     * the method is called 
     */
	public void accelerate() {
        if (speed < 60) {
            speed += 10; // Increase speed by 10 mph
            System.out.println("Speed increased to " + speed + " mph.");
        } else {
            System.out.println("Maximum speed reached.");
        }
    }
	
	/**
	 * This method decreases the car's speed
	 * by 10 mph and output to the console each
	 * time the method is called, if the car is at
	 * a speed of zero, the car has stopped
	 */
	public void brake() {
        if (speed > 0) {
            speed -= 10; // Decrease speed by 10 mph
            System.out.println("Speed decreased to " + speed + " mph.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
}
