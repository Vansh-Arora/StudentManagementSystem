import java.io.*;
import java.util.*;
class FetchInfo implements Percentage { 
    public static void readFile(String roll) throws IOException 
    { 
     	try  
    	{  
    	//the file to be opened for reading  
    	FileInputStream fis=new FileInputStream(roll);       
    	Scanner sc=new Scanner(fis);
    	System.out.println("Student Details");
    	System.out.println("RollNo: "+ sc.nextLine());
    	System.out.println("Name: "+ sc.nextLine());
    	System.out.println("Contact Number: "+ sc.nextLine());
    	System.out.println("CourseId: "+ sc.nextLine());
    	System.out.println("Address: "+ sc.nextLine());
    	System.out.println("Year of Joining: "+ sc.nextLine());
    	
    	sc.close();
    	}
     	catch(IOException e)  
     	{  
     	e.printStackTrace();  
     	}  
    }
    public static void readMarks(String roll) throws IOException 
    { 
     	try  
    	{  
    	//the file to be opened for reading  
    	FileInputStream fis=new FileInputStream("marks"+roll);       
    	Scanner sc=new Scanner(fis);
    	System.out.println("Student's Report");
    	System.out.println("Network: "+ sc.nextLine());
    	System.out.println("Java: "+ sc.nextLine());
    	System.out.println("ADBMS: "+ sc.nextLine());
    	System.out.println("SEPM: "+ sc.nextLine());
    	System.out.println("Core: "+ sc.nextLine());    	
    	sc.close();
    	}
     	catch(IOException e)  
     	{  
     	e.printStackTrace();  
     	}  
    }
    public void calculatePercent(int marks) {
    	System.out.println("Percentage: "+(marks/500)*100+"%");
    }
    public static void calculatePercent(String roll) throws IOException {
    	int marks =0,i=1;
		FileInputStream fis=new FileInputStream("marks"+roll);       
    	Scanner sc=new Scanner(fis);
    	while(i<=5) {
    		marks = marks + Integer.parseInt(sc.nextLine());
    		i++;
    	}
    	FetchInfo per = new FetchInfo();
    	per.calculatePercent(marks);
    }
    }