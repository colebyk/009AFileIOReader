import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/compsci/eclipse-workspace/009AFileIOPrintWriter/Credits.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str + "\n");
				
			}
			br.close();
		}catch (IOException e){
			System.out.println("IO error" + e);
		}

	}

}
