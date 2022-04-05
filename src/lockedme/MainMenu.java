package lockedme;
import java.io.File;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args){
        // Root directory
        String rootDir = "C:/Users/91859/eclipse-workspace/LockedMe/main";
        try {

            File folder = new File(rootDir);

            // list all the files
            File[] files = folder.listFiles();
            for(File file : files) {
            	 if(file.isFile()) {
					  
				    System.out.println(file.getName());
				  }
				  }
            
          } catch (Exception e) {
            e.getStackTrace();
          }
    }
	
	public static void WelcomeScreen() throws Exception {
		
		int num=-1;
		Scanner sc = new Scanner(System.in);
		do {
			
			try {
				
			MenuOptions.displayOptions();
			num=sc.nextInt();
		switch(num) {
		
		case 1: 
			System.out.println("\n"+"Displaying file names in ascending order:"+"\n");
			MainMenu.main(null);
		break;
		
		case 2: 
			SubMenu.FileHandling();
			break;
			
		case 3: 
			System.out.println("\n"+"Program exited succesfully");
			System.exit(0);
		break;
		
		default:
			System.out.println("\n"+"Please select a valid option from above.");
		
		         }
		
			}catch (Exception e) {
				System.out.println("\n"+"Invalid input"+"\n"+e.getClass().getName());
				WelcomeScreen();
				}
			
       }while(num!=3);
}
}