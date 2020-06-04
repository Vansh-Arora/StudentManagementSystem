import java.util.Scanner;
public class Student{
	String studId;
	int branchId;
	String name;
	String contact;
	String address;
	String yoj;
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details:\nEnter Student's RollNo");
		studId = sc.nextLine();
		
		System.out.println("Enter student's name");
		name = sc.nextLine();
		System.out.println("Enter student's Year of Joining");
		yoj = sc.nextLine();
		System.out.println("Enter student's contact number");
		contact = sc.nextLine();
		System.out.println("Enter student's address");
		address = sc.nextLine();
		System.out.println("1: BigData\n2: Devops\n3: AIML\n4: IOT\n 5: OSOS\n6: CCVT\nEnter student's branchId");
		branchId = Integer.parseInt(sc.nextLine());
	}
}
