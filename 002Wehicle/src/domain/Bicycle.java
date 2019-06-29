package domain;

public class Bicycle extends Vehicle {

	protected int velocityNumbers;
	protected boolean usefulForCompete;
	
	public int getVelocityNumbers() {
		return velocityNumbers;
	}
	public void setVelocityNumbers(int velocityNumbers) {
		this.velocityNumbers = velocityNumbers;
	}
	public boolean isUsefulForCompete() {
		return usefulForCompete;
	}
	public void setUsefulForCompete(boolean usefulForCompete) {
		this.usefulForCompete = usefulForCompete;
	}
	
	
}
