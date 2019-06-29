package domain;

public class AdultBicycle extends Bicycle{
	protected boolean professionalAmateur; //professional = true

	public boolean isProfessionalAmateur() {
		return professionalAmateur;
	}

	public void setProfessionalAmateur(boolean professionalAmateur) {
		this.professionalAmateur = professionalAmateur;
	}
	
	
}
