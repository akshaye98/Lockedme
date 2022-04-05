package lockedme;

import java.util.*;

import java.io.File;

import java.io.IOException;

public class FileOperations { 
	public static final String rootDir="C:/Users/91859/eclipse-workspace/LockedMe/main";
	File newfile = new File(rootDir);
	//1.Add File
	public static void addFile() {
	     Scanner sc = new Scanner(System.in);
    try {
    	System.out.println("   "+"Enter file name");
    	String fileName = sc.nextLine();
        File myObj = new File(rootDir,fileName);
        if (myObj.createNewFile()) {
          System.out.println("\n"+"   "+"File created: " + myObj.getName()+"\n");
        } else {
          System.out.println("\n"+"   "+"File already exists."+"\n");
        }
      } catch (IOException e) {
        System.out.println("\n"+"   "+"An error occurred."+"\n");
        e.printStackTrace();
      }
    }
	//2.Delete File
	 public static void deleteFile() { 
		    Scanner sc = new Scanner(System.in);
		    System.out.println("\n"+"   "+"Enter file name");
	    	String fileName = sc.nextLine();
		    File myObj = new File(rootDir,fileName); 
		    if (myObj.delete()) { 
		      System.out.println("\n"+"   "+"Deleted the file: " + myObj.getName()+"\n");
		    } else {
		      System.out.println("\n"+"   "+"Failed to delete the file."+"\n");
		    } 
		  } 
	 //3.Search For File
	 public static void searchForFile() {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("\n"+"   "+"Enter file name");
		    String fileName = sc.nextLine();
		    File myObj = new File(rootDir,fileName);
		    if (myObj.exists()) {
		      System.out.println("\n"+"   "+"File name: " + myObj.getName()+"\n");
		      System.out.println("\n"+"   "+"Absolute path: " + myObj.getAbsolutePath()+"\n");
		    } else {
		      System.out.println("\n"+"   "+"This file" +" "+"'"+myObj.getName()+"'"+" " +"does not exist."+"\n");
		    }
		  }
	
}


