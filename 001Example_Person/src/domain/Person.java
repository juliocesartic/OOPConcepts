package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
	
	private HairColor hairColor;
	private GlassesColor glassesColor;
	private List<LanguageLevel> languages;
	private List<Allergies> allergies;
	
	public Person() {
		this.hairColor = HairColor.BROWN;
		this.glassesColor = GlassesColor.BLACK;
		this.languages = new ArrayList<LanguageLevel>();
		this.allergies = new ArrayList<Allergies>();
		
	}
	
	public void setHairColor(HairColor newColor) {
		this.hairColor = newColor;
	}
	
	public void setGlassesColor(GlassesColor newColor) {
		this.glassesColor = newColor;
	}
	/*
	 * Prerequisite: the language must be in the list,
	 * if the language doesn't exist a new language will add to the list.
	 */
	public void improveLanguage(LanguageLevel languageLevel) {
		Languages language = languageLevel.getLanguage();
		int listPosition = this.findLanguage(language);
		
		if(listPosition == -1) {
			this.languages.add(languageLevel);
		}
		else {
			LanguageLevel languageLevelFound = this.languages.get(listPosition);
			languageLevelFound.setLevel(languageLevel.getLevel());
		}
	}
	
	/*
	 * Prerequisites: the language must not be in the list,
	 * if the language doesn't exist a new language will not add to the list.
	 */
	public void learnLanguage(Languages newLanguage) {
		int listPosition = this.findLanguage(newLanguage);
		if(listPosition == -1) {
			LanguageLevel languageLevel = new LanguageLevel();
			languageLevel.setLanguage(newLanguage);
			languageLevel.setLevel(0);
			this.languages.add(languageLevel);
		}
		
	}
	
	/*
	 * Prerequisite: the allergy must not be in the list,
	 * if the language doesn't exist a new language will not add to the list.
	 */
	public void detectAllergy(Allergies newAllergy) {
		if(!this.findAllergy(newAllergy)) {
			this.allergies.add(newAllergy);
		}
	}
	
	public void showPerson() {
		
		System.out.println("The information of the Person are the following:");
		
		/*
		 * Hair color
		 */
		
		System.out.println("The hair color is: ");
		if(this.hairColor == HairColor.BLACK) {
			System.out.println("black");
		}
		else if(this.hairColor == HairColor.BLOND) {
			System.out.println("blond");
		}
		else if(this.hairColor == HairColor.BROWN) {
			System.out.println("brown");
		}
		else if(this.hairColor == HairColor.RED_HAIR) {
			System.out.println("red hair");
		}
		
		
		/*
		 * Glasses color
		 */
		
		System.out.println("The glass color is: ");
		if(this.glassesColor == GlassesColor.BLACK) {
			System.out.println("black");
		}
		else if(this.glassesColor == GlassesColor.BLUE) {
			System.out.println("blue");
		}
		else if(this.glassesColor == GlassesColor.GREY) {
			System.out.println("grey");
		}
		else if(this.glassesColor == GlassesColor.RED) {
			System.out.println("red");
		}
		
		/*
		 * Languages
		 */
		
		Iterator it = this.languages.iterator();
		if(!it.hasNext()) {
			System.out.println("No speak any languages.");
		}
		else {
			System.out.println("The language that this person speaks are:");
			while(it.hasNext()) {
				LanguageLevel levelThisLanguage = (LanguageLevel)it.next();
				Languages language = levelThisLanguage.getLanguage();
				int levelLanguage = levelThisLanguage.getLevel();
				if(language == Languages.CHINESE) {
					System.out.println(" - " + "CHINESE" + " - Level: " + levelLanguage + ".");
				}
				else if(language == Languages.ENGLISH) {
					System.out.println(" - " + "ENGLISH" + " - Level: " + levelLanguage + ".");
				}
				else if(language == Languages.FRENCH) {
					System.out.println(" - " + "FRENCH" + " - Level: " + levelLanguage + ".");
				}
				else if(language == Languages.GERMAN) {
					System.out.println(" - " + "GERMAN" + " - Level: " + levelLanguage + ".");
				}
				else if(language == Languages.PORTUGUESE) {
					System.out.println(" - " + "PORTUGUESE" + " - Level: " + levelLanguage + ".");
				}
				else if(language == Languages.SPANISH) {
					System.out.println(" - " + "SPANISH" + " - Level: " + levelLanguage + ".");
				}
				
			}
		}
		
		/*
		 * Allergies
		 */
		
		it = this.allergies.iterator();
		if(!it.hasNext()) {
			System.out.println("This persons don't have any allergies.");
		}
		else {
			System.out.println("The person suffer the following allergies: ");
			while(it.hasNext()) {
				Allergies thisAllergy = (Allergies)it.next();
				
				if(thisAllergy == Allergies.GRASSES) {
					System.out.println(" - " + "Allergic with Grasses" + ".");
				}
				else if(thisAllergy == Allergies.LACTOSE) {
					System.out.println(" - " + "Allergic with the Lactose" + ".");
				}
				else if(thisAllergy == Allergies.MITES) {
					System.out.println(" - " + "Allergic with Mites" + ".");
				}
				else if(thisAllergy == Allergies.POLLEN) {
					System.out.println(" - " + "Allergic with Pollen" + ".");
				}

			}
		}
		
		
		
		
	}
	
	private int findLanguage(Languages language) {
		int i = 0;
		boolean found = false;
		Iterator it = this.languages.iterator();
		while(it.hasNext() && !found) {
			LanguageLevel thisLanguageLevel = (LanguageLevel)it.next();
			Languages thisLanguage = thisLanguageLevel.getLanguage();
			
			if(thisLanguage == language) {
				found = true;
			}else {
				i++;
			}
		}
		
		if(!found) {
			i = -1;
		}
		
		return i;
	}
	
	private boolean findAllergy(Allergies allergy) {
		boolean found = false;
		Iterator it = this.allergies.iterator();
		while(it.hasNext() && !found) {
			Allergies thisAllergy = (Allergies)it.next();
			if(thisAllergy == allergy) {
				found = true;
			}
		}
		return found;
	}

}
