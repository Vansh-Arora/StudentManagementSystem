import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Executing  {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String studId;
		int branchId;
		String name;
		String contact;
		String address;
		String yoj;
		int count=0;
		System.out.println("Select one of the following operations:\n1: Enroll a Student\n2: Get details of a student\n"
				+ "3: Edit details of a student\n4:Count number of students\n5: Remove Student\n6: Assign Marks to a Student\n"
				+ "7: Display marks of a student\n8: Display Percentage of a student\n0: Exit ");
		while(true) {
		System.out.println("Enter your choice:");
		int driverVariable = Integer.parseInt(s.nextLine());
		if(driverVariable==1) {
			count+=1;
		}
		switch(driverVariable) {
		case 0:
			break;
		case 1:
			Management.enrollStudent();
			System.out.println("Student Enrolled");
			break;
		case 2:
			System.out.println("Enter the roll no. of the studnet");
			FetchInfo.readFile(s.nextLine());
			break;
		case 3:
			System.out.println("Enter Student's RollNo");
			studId = s.nextLine();
			
			System.out.println("Enter student's name");
			name = s.nextLine();
			System.out.println("Enter student's Year of Joining");
			yoj = s.nextLine();
			System.out.println("Enter student's contact number");
			contact = s.nextLine();
			System.out.println("Enter student's address");
			address = s.nextLine();
			System.out.println("1: BigData\n2: Devops\n3: AIML\n4: IOT\n 5: OSOS\n6: CCVT\nEnter student's branchId");
			branchId = Integer.parseInt(s.nextLine());

			WrittingToFile.enterDetails(studId,name,contact,branchId,address,yoj);
			System.out.println("Updates Done");
			break;

		case 4:
			System.out.println("Total number of students:"+ count);
			break;
		case 5:
			System.out.println("Enter student's RollNo");
			String del = s.nextLine();
			WrittingToFile.remove(del);
			System.out.println("Student Removed");
			break;
			
		case 6:
			System.out.println("Enter roll no of student");
			String no = s.nextLine();
			System.out.println("1: BigData\n2: Devops\n3: AIML\n4: IOT\n 5: OSOS\n6: CCVT\nEnter student's branchId");
			int branch = Integer.parseInt(s.nextLine());
			Teacher obj = new Teacher();
			obj.assignMarks(no, branch);
			System.out.println("Marks Entered");
			break;
		case 7:
			System.out.println("Enter roll no of student");
			String rno = s.nextLine();
			FetchInfo.readMarks(rno);
			break;
		case 8:
			System.out.println("Enter roll no. of student");
			String rid = s.nextLine();
			FetchInfo.calculatePercent(rid);
			break;
			

		
		}
		if(driverVariable == 0) {
			System.out.println("Thank you!");
			break;
		}

	}
	}
}
