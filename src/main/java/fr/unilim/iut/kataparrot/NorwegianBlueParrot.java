package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot{

	protected double voltage;
	protected boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super();
		//ParrotTypeEnum.NORWEGIAN_BLUE, voltage, isNailed
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		if (isNailed)
			return 0;
		else
			return Math.min(24.0, voltage * BASE_SPEED);
	}
	
}
