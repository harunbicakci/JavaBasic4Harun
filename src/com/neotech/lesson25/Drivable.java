package com.neotech.lesson25;

public interface Drivable {

	// java automatically adds public static final
	boolean DRIVE_FAST = true;
	
	// java adds itself abstract in front of it, just because we are in an interface
	void drive();
}

abstract class Vehicles{
	
	void start(){
		System.out.println("Vehicles can start!");
	}
	
	abstract void stop();
}

class Cars extends Vehicles implements Drivable{

	@Override
	public void drive() {
		System.out.println("Cars can drive!");
		
	}

	@Override
	void stop() {
		System.out.println("Cars can stop!");
		
	}
	
}