package lockedme;

public class MenuOptions {
public static void printLockedMeWelcome(String companyName,String welcomeMessage, String developerDetails) {
	String companydetails = "\n" + "                                                                  "+companyName+"\n"+"\n"+"\n"+"                                                             "+welcomeMessage+"\n"+"                                                              "+developerDetails;
	String appDescription = "\n"+"\n"+"   "+"Uses of the Application:-"+"\n"+"   "+"* Retrieves all file names in ascending order"+"\n"+"   "+"* Add,Delete and Search files ";
	System.out.println(companydetails);
	
	
	System.out.println(appDescription);
}

public static void displayOptions() {
	String options = "\n\n"+"   "+"Choose one of the options listed below and press enter:-"+"\n\n"+"   "+"1. Retrieves all file names in ascending order"+"\n"+"   "+"2. Display file operations menu"+"\n"+"   "+"3. Exit program";
	System.out.println(options);
}

}
