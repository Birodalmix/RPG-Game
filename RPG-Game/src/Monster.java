public class Monster {
	private String Name;
	private int Level;
	private int Health;
	private int Power;
	private int Armor;
	private int TrueDamage;
	
	private Monstre Type;
	
	 public Monster(String name,int level,int a) {
		 this.Name=name;
		 this.Level=level;
		 SetStartType(a);
		 
	 }
	 void SetStartType(int a) {
		 switch(a) {
		  case 1:
			 Type=Monstre.BAT;
			 SetHealth(70*Dungeon.GetLevel());
			 SetPower(3*Dungeon.GetLevel());
			 SetArmor(0+Dungeon.GetLevel());
		    break;
		  case 2:			 
			  Type=Monstre.SPIDER;
			  SetHealth(70*Dungeon.GetLevel());
			  SetPower(30*Dungeon.GetLevel());
			  SetArmor(0+Dungeon.GetLevel());	  
		    break; 
		  case 3:			 
			  Type=Monstre.DOG;
			  SetHealth(70*Dungeon.GetLevel());
			  SetPower(3*Dungeon.GetLevel());
			  SetArmor(0+Dungeon.GetLevel());	  
		    break; 
		 }
		}
		//Getterek ezekkel lehet kiolvasni a betokozott adatokat
		 public String GetName() {
			 return Name;
		 }
		 public int GetLevel() {
			 return Level;
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
		 public Monstre GetType() {
			 return Type;
		 }
		 
		 
		 //Setterek ezekkel lehet felülírni a betokozott adatokat
		 public  void SetName(String n) {
			 Name=n;
		 }
		 public  void SetLevel(int l) {
			 Level=l;
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
				 Type=Monstre.BAT;
			    break;
			  case 2:			 
				  Type=Monstre.SPIDER;
			    break; 
			}
		 }
		 
		public int getTrueDamage() {
			return TrueDamage;
		}
		public void setTrueDamage(int Damage,int Armor) {
			if(0 <= Damage-Armor) {
				TrueDamage = Damage-Armor;
				}else {
					TrueDamage = 0;
				}
		}
	 
}
