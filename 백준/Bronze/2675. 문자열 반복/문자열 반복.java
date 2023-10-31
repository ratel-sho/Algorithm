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
		
		int TestCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<TestCase; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int re = Integer.parseInt(st.nextToken());
			
			String P = st.nextToken();	
			
			for(int j=0; j<P.length(); j++) {
				char p = P.charAt(j);
				
				for(int k=0; k<re; k++) {
					bw.write(p);
				}
				
			}
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}
