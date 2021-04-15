import java.util.Scanner;
public class Menu {

	public static Character character;
	
	
	public static  void MainMenu() {
		System.out.println("--------------------\nÜdvözöllek Kalandor! \n 1.Új játék \n 2.Folytatás \n 3.Kilépés\n--------------------");
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
		
		
		System.out.println("Név:");
		Scanner data = new Scanner(System.in);
		character= new Character(data.next(),Spec.WARIOR);
		System.out.println(character.GetHealth());
		
	}
	public static void Continue() {
		System.out.println("Müködik");
	}
	public static void Exit() {
		System.out.println("Müködik");
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	
	
	
}
