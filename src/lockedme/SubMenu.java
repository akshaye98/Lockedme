package lockedme;

import java.util.Scanner;

public class SubMenu {
	public static void FileHandling(){
		int num=-1;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				
			System.out.println("   "+"Choose one of the options listed below and press enter:-");
			System.out.println("   "+"1.Add a file ");
			System.out.println("   "+"2.Delete a file ");
			System.out.println("   "+"3.Search for a file ");
			System.out.println("   "+"4.Previous Menu ");
			System.out.println("   "+"5.Exit");
			num=sc.nextInt();
		
		switch(num) {
		case 1:  //Add file
			FileOperations.addFile();
		break;
		
		case 2: //Delete file
			FileOperations.deleteFile();
			break;
		case 3: //Search file
			FileOperations.searchForFile();
		break;
		case 4://Return to main menu
			MainMenu.WelcomeScreen();
         break;
		case 5://Exit program
			System.out.println("\n"+"Program Exited Succesfully");
			System.exit(0);
		default:
			System.out.println("\n"+"Please choose a valid option."+"\n");
		}
		}catch (Exception e) {
			System.out.println("\n"+"Invalid input"+"\n"+e.getClass().getName()+"\n");
			FileHandling();
			}
		
	    }while(num!=5);
}
}
