import java.util.Scanner;

public class Quest {
	
	private static int QLevel=2;
	private static int Q1Gold=3;
	private static int Q1Experience=2;
	
	private static int QExperienceCost=12;
	private static int QExperienceContainer=0;
	private static int Q2Gold=8;
	
	private static int QTrueDamage=500;
	private static int QTrueDamageContainer=0;
	private static int Q3Gold=8;
	private static int Q3Experience=12;
	
	public static void Selecter() {
		Menu.clear();
		System.out.println("///////////////////////////////////// \nNagy kalandor elfogadod a kihívást?\nAkkor teljesítsd az alábbi küldetéseket!\n/////////////////////////////////////");
		FirstQ();
		SeconQ();
		ThirdQ();
	    System.out.println("-------------------------------------");
	    System.out.println("Nyomj egy Entert hogy vissza menj a fõmenübe.");
	    Menu.Back();
	}
	public static void FirstQ() {
		if(Menu.character.GetLevel()>=getQLevel()) {
			System.out.println("-------------------------------------");
		    System.out.println("Teljesítetted az egyes számú küldetést!");
		    System.out.println("Jutalom "+getQGold()+" arany és "+getQExperience()+" tapasztalati pont.");
		    System.out.println("-------------------------------------");
		    
		    Menu.character.SetExperience(Menu.character.GetExperience()+getQExperience());
		    Menu.character.SetGold(Menu.character.GetGold()+getQGold());
		    
		    setQLevel(getQLevel()+2);
		    setQGold(getQGold()+33);
		    setQExperience(getQExperience()+3);
		}else {
			System.out.println("-------------------------------------");
		    System.out.println("1.Érd el a "+Menu.character.GetLevel()+"/"+getQLevel()+". szintet!");
		    System.out.println("Jutalom "+getQGold()+" arany és "+getQExperience()+" tapasztalati pont.");
		}
		
		
	}
	
	public static void SeconQ() {
		if(getQExperienceContainer()>=getQExperienceCost()){
			System.out.println("-------------------------------------");
		    System.out.println("Teljesítetted az második számú küldetést!");
		    System.out.println("Jutalom "+getQ2Gold()+" arany.");
		    System.out.println("-------------------------------------");
		    
		    Menu.character.SetGold(Menu.character.GetGold()+getQ2Gold());
		    
		    
		    setQExperienceCost(getQExperienceCost()+30);
		    setQGold(getQGold()+15);
		    setQExperienceContainer(0);

		}else {
			System.out.println("-------------------------------------");
		    System.out.println("2.Növeld a tapasztalati pontodat "+getQExperienceContainer()+"/"+getQExperienceCost()+" értékkel!");
		    System.out.println("Jutalom "+getQ2Gold()+" arany.");
		}
		
	    
	}
	
	public static void ThirdQ() {
		if(getQTrueDamageContainer()>=getQTrueDamage()) {
			System.out.println("-------------------------------------");
		    System.out.println("Teljesítetted az harmadik számú küldetést!");
		    System.out.println("Jutalom "+getQ3Gold()+" arany és "+getQ3Experience()+" tapasztalati pont.");
		    System.out.println("-------------------------------------");
		    
		    Menu.character.SetExperience(Menu.character.GetExperience()+getQ3Experience());
		    Menu.character.SetGold(Menu.character.GetGold()+getQ3Gold());
		    
		    setQTrueDamage(getQTrueDamage()+40);
		    setQ3Gold(getQ3Gold()+25);
		    setQ3Experience(getQ3Experience()+4);
		    setQTrueDamageContainer(0);
		    
		}else {
			System.out.println("-------------------------------------");
		    System.out.println("3.Érj el "+getQTrueDamageContainer()+"/"+getQTrueDamage()+" valódi sebzést!");
		    System.out.println("Jutalom "+getQ3Gold()+" arany és "+getQ3Experience()+" tapasztalati pont.");
		}
	}
	
	public static int getQLevel() {
		return QLevel;
	}
	public static void setQLevel(int qLevel) {
		QLevel = qLevel;
	}
	public static int getQGold() {
		return Q1Gold;
	}
	public static void setQGold(int qGold) {
		Q1Gold = qGold;
	}
	public static int getQExperience() {
		return Q1Experience;
	}
	public static void setQExperience(int qExperience) {
		Q1Experience = qExperience;
	}
	
	
	
	
	
	public static int getQExperienceContainer() {
		return QExperienceContainer;
	}
	public static void setQExperienceContainer(int qExperienceContainer) {
		QExperienceContainer = qExperienceContainer;
	}
	public static int getQExperienceCost() {
		return QExperienceCost;
	}
	public static void setQExperienceCost(int qExperience) {
		QExperienceCost = qExperience;
	}
	public static int getQ2Gold() {
		return Q2Gold;
	}
	public static void setQ2Gold(int Q2gold) {
		Q2Gold = Q2gold;
	}
	
	
	public static int getQTrueDamage() {
		return QTrueDamage;
	}
	public static void setQTrueDamage(int QtrueDamage) {
		QTrueDamage = QtrueDamage;
	}
	public static int getQTrueDamageContainer() {
		return QTrueDamageContainer;
	}
	public static void setQTrueDamageContainer(int qTrueDamageContainer) {
		QTrueDamageContainer = qTrueDamageContainer;
	}
	public static int getQ3Gold() {
		return Q3Gold;
	}
	public static void setQ3Gold(int Q3gold) {
		Q3Gold = Q3gold;
	}
	public static int getQ3Experience() {
		return Q3Experience;
	}
	public static void setQ3Experience(int Q3experience) {
		Q3Experience = Q3experience;
	}
	
}