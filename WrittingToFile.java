import java.io.FileWriter;
import java.io.IOException;
public class WrittingToFile{
	static void enterDetails (String a,String b,String c,int d, String e, String f) throws IOException{ 
			FileWriter fw=new FileWriter(a);
			fw.write(a+'\n'+b+'\n'+c+'\n'+d+'\n'+e+'\n'+f);
			fw.close(); 
		} 
	static void enterMarks (String a,String b,String c,String d, String e, String f) throws IOException{ 
		String name="marks"+f;
		FileWriter fw=new FileWriter(name);
		fw.write(a+'\n'+b+'\n'+c+'\n'+d+'\n'+e+'\n'+f);
		fw.close(); 
	} 
	static void remove(String a) throws IOException{ 
		FileWriter fw=new FileWriter(a);
		fw.write("null\nnull\nnull\nnull\nnull\nnull");
		fw.close(); 
	} 
	}


