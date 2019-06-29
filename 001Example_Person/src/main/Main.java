package main;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Person julio = new Person();
		
		julio.setHairColor(HairColor.BLACK);
		julio.setGlassesColor(GlassesColor.BLACK);
		julio.learnLanguage(Languages.SPANISH);
		julio.learnLanguage(Languages.ENGLISH);
		julio.learnLanguage(Languages.PORTUGUESE);
		
		LanguageLevel levelLanguageSpanish = new LanguageLevel();
		LanguageLevel levelLanguageEnglish = new LanguageLevel();
		LanguageLevel levelLanguagePortuguese = new LanguageLevel();
		levelLanguageSpanish.setLanguage(Languages.SPANISH);
		levelLanguageSpanish.setLevel(5);//Native language
		levelLanguageEnglish.setLanguage(Languages.ENGLISH);
		levelLanguageEnglish.setLevel(3);//Intermediate
		levelLanguagePortuguese.setLanguage(Languages.PORTUGUESE);
		levelLanguagePortuguese.setLevel(2);//Basic advanced
		
		julio.improveLanguage(levelLanguageEnglish);
		julio.improveLanguage(levelLanguageSpanish);
		julio.improveLanguage(levelLanguagePortuguese);
		
		julio.detectAllergy(Allergies.MITES);
		julio.detectAllergy(Allergies.MITES);
		
		julio.showPerson();
		
		
		
		

	}

}
