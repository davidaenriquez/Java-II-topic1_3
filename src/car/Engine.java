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
 * The Engine class simulates a car Engine
 * and provides methods to start and stop
 * the engine
 */
public class Engine {
	private boolean running;
	
	/**
	 * Constructs an Engine object with the
	 * initial state of running set to false
	 */
	public Engine() {
		this.running = false;
	}
	
	/**
	 * This method starts the engine if it is
	 * not running and outputs the action to
	 * the console
	 */
	public void start() {
        if (!running) {
            running = true;
            System.out.println("Engine started.");
        }
        else {
            System.out.println("Engine is already running.");
        }
    }
	
	/**
	 * This method stops the engine if it is
	 * running and outputs the action to
	 * the console
	 */
	public void stop() {
        if (running) {
            running = false;
            System.out.println("Engine stopped.");
        }
        else {
            System.out.println("Engine is already stopped.");
        }
    }
}
