import java.io.IOException;

public class Management {
	static public void enrollStudent() throws IOException
	{
		Student stu =new Student();
		WrittingToFile.enterDetails(stu.studId,stu.name,stu.contact,stu.branchId,stu.address,stu.yoj);
	}
	

}
