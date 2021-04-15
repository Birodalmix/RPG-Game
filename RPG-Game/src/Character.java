public class Character {
	 private  String Name;
	 private  int Level;
	 private  int Experience;
	 
	 private  int Health;
	 private  int Power;
	 private  int Armor;
	 
	 private  Spec Type;
	 
	 public Character(String name, Spec type) {
		 this.Name=name;
		 this.Type=type;
		 this.Level=1;
		 this.Experience=0;
		 SetStartingStats(type);
		 
	 }
	 void SetStartingStats(Spec s){
		 switch(s) {
		  case WARIOR:
			  SetHealth(15);
			  SetPower(13);
			  SetArmor(15);
		    break;
		  case ARCHER:			 
			  SetHealth(6);
			  SetPower(20);
			  SetArmor(6);
		    break; 
		}
	 }
	 
	 
	 //Getterek ezekkel lehet kiolvasni a betokozott adatokat
	 public  String GetName() {
		 return Name;
	 }
	 public int GetLevel() {
		 return Level;
	 }
	 public int GetExperience() {
		 return Experience;
	 }
	 public int GetHealth() {
		 return Health;
	 }
	 public int GetPower() {
		 return Power;
	 }
	 public int GetArmor() {
		 return Armor;
	 }
	 public Spec GetType() {
		 return Type;
	 }
	 
	 
	 //Setterek ezekkel lehet felülírni a betokozott adatokat
	 public  void SetName(String n) {
		 Name=n;
	 }
	 public  void SetLevel(int l) {
		 Level=l;
	 }
	 public  void SetExperience(int e) {
		 Experience=e;
	 }
	 public  void SetHealth(int h) {
		 Health=h;
	 }
	 public  void SetPower(int p) {
		 Power=p;
	 }
	 public  void SetArmor(int a) {	
		 Armor=a;
	 }
	 public  void SetType(int a) {	
		 switch(a) {
		  case 1:
			 Type=Spec.WARIOR;
		    break;
		  case 2:			 
			  Type=Spec.ARCHER;
		    break; 
		}
	 }
	 
}
