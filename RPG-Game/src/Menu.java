import java.util.Scanner;
public class Menu {

	public static Character character;
	
	
	public static  void MainMenu() {
		System.out.println("--------------------\n�dv�z�llek Kalandor! \n 1.�j j�t�k \n 2.Folytat�s \n 3.Kil�p�s\n--------------------");
		Scanner Main = new Scanner(System.in);
		int menu=Main.nextInt();
		switch(menu) {
		  case 1:
			  NewGame();
		    break;
		  case 2:			 
			  Continue();
		    break; 
		  case 3:
			  Exit();
			break;
		}
	
	}
	public static void NewGame() {
		
		
		System.out.println("N�v:");
		Scanner data = new Scanner(System.in);
		character= new Character(data.next(),Spec.WARIOR);
		System.out.println(character.GetHealth());
		
	}
	public static void Continue() {
		System.out.println("M�k�dik");
	}
	public static void Exit() {
		System.out.println("M�k�dik");
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	
	
	
}
