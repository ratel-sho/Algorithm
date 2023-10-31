import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String temp1 = st.nextToken();
		String temp2 = st.nextToken();
		
		String[] tempOne = temp1.split("");
		String[] tempTwo = temp2.split("");
		
		
		String t1="", t2="";
		
		for(int i=temp1.length()-1; i>=0; i--) {
			t1 += tempOne[i];			
		}
		for(int i=temp2.length()-1; i>=0; i--) {
			t2 += tempTwo[i];
		}
		
		
		if(Integer.parseInt(t1) >= Integer.parseInt(t2)) {
			bw.write(t1+" ");
		}else {
			bw.write(t2+" ");
		}
		
		bw.flush();
		bw.close();
	}
}
