import java.util.*;
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
		
		System.out.println("N�v:");
		Scanner neve = new Scanner(System.in);
		String NEve=neve.next();
		
		System.out.println("Harczos(1) vagy Ij�sz(2)?");
		Scanner data = new Scanner(System.in);
		int datta=data.nextInt();
		
		character= new Character(NEve,datta);
		clear();
		
		Continue();
	}
	public static void Continue() {
		System.out.println("--------------------\n�dv�z�llek "+ character.GetName() +"!\n 1.Statisztika \n 2.Kazamata m�sz�s folytat�s \n 3.Bolt \n 4.K�ldet�sek \n 5.Kil�p�s\n--------------------");
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
		System.out.println("M�k�dik");
		System.exit(0);
	} 
	public static void clear() {
	    for (int i = 0; i<50; i++){
	        System.out.print('\n');
	     }
	 }
	public static void DunCrawl() {
		System.out.println("M�k�dik");
	}
	public static void Shop() {
		System.out.println("M�k�dik");
	}
	public static void Quest() {
		System.out.println("M�k�dik");
	}

}
