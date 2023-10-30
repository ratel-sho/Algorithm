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
		
		int TestCase = Integer.parseInt(st.nextToken());
		
		String check = st.nextToken();
		
		StringTokenizer gt = new StringTokenizer(br.readLine());
		
		for(int i=0; i<TestCase; i++) {
			String temp = gt.nextToken();
			
			if(Integer.parseInt(temp) < Integer.parseInt(check)) {
				bw.write(temp+" ");
			}
		}
		
		bw.write("\n");
		
		bw.flush();			
		bw.close();
				
	}
}
