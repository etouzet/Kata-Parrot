package fr.unilim.iut.kataparrot;

public abstract class Parrot {

	protected double BASE_SPEED =12.0;
	protected double MIN_SPEED =0.0;
	public abstract double getSpeed();

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}




}
