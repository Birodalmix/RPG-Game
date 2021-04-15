import java.util.*;
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
			  try {
				  character.GetName();
				  Continue();
			    } catch (Exception e) {
			    	NewGame();
			    }
		    break; 
		  case 3:
			  Exit();
			break;
		}
		Main.close();
	}
	public static void NewGame() {
		
		System.out.println("Név:");
		Scanner neve = new Scanner(System.in);
		String NEve=neve.next();
		
		System.out.println("Harczos(1) vagy Ijász(2)?");
		Scanner data = new Scanner(System.in);
		int datta=data.nextInt();
		
		character= new Character(NEve,datta);
		clear();
		
		Continue();
	}
	public static void Continue() {
		System.out.println("--------------------\nÜdvözöllek "+ character.GetName() +"!\n 1.Statisztika \n 2.Kazamata mászás folytatás \n 3.Bolt \n 4.Küldetések \n 5.Kilépés\n--------------------");
		Scanner counta = new Scanner(System.in);
		int menus=counta.nextInt();
		switch(menus) {
		  case 1:
			  Statistics.GetStatistics();
		    break;
		  case 2:			 
			  DunCrawl();
		    break; 
		  case 3:			 
			  Shop();
		    break; 
		  case 4:			 
			  Quest();
		    break; 
		  case 5:
			  Exit();
			break;
		}
		counta.close();
	}
	public static void Exit() {
		System.out.println("Müködik");
		System.exit(0);
	} 
	public static void clear() {
	    for (int i = 0; i<50; i++){
	        System.out.print('\n');
	     }
	 }
	public static void DunCrawl() {
		System.out.println("Müködik");
	}
	public static void Shop() {
		System.out.println("Müködik");
	}
	public static void Quest() {
		System.out.println("Müködik");
	}

}
