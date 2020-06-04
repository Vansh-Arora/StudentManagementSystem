import java.io.IOException;
import java.util.Scanner;
public class Teacher extends Subjects {
	public void assignMarks(String roll,int bid) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks in Networks");
		Networks = scan.nextLine();
		System.out.println("Enter marks in Java");
		java = scan.nextLine();
		System.out.println("Enter marks in ADBMS");
		ADBMS = scan.nextLine();
		System.out.println("Enter marks in SEPM");
		SEPM = scan.nextLine();
		if(bid==1){
			System.out.println("Enter marks in Python");
			Python = scan.nextLine();
			WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,Python,roll);

		}		
		else if(bid==2){
			System.out.println("Enter marks in Scala");
			Scala = scan.nextLine();
			WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,Scala,roll);

		}	
		else if(bid==3){
			System.out.println("Enter marks in Python");
			Python = scan.nextLine();
			WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,Python,roll);

		}	
		else if(bid==4){
			System.out.println("Enter marks in OS");
			OS = scan.nextLine();
			WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,OS,roll);

		}	
		else if(bid==5)
		{
			System.out.println("Enter marks in Vagrant");
			Vagrant = scan.nextLine();
			WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,Vagrant,roll);

		}			
		else if(bid==6){
				System.out.println("Enter marks in Cloud");
				Cloud = scan.nextLine();
				WrittingToFile.enterMarks(Networks,SEPM,java,ADBMS,Cloud,roll);

			}	
	}

}
