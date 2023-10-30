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
						
		
		int a = -1, b = -1;
		int sum = 0;
		
		String s;
		
		while((s=br.readLine()) != null) {
		
			StringTokenizer st = new StringTokenizer(s);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sum = a+b;
			
			//if(a==0 && b==0) break;
			
			bw.write(sum+"\n");
			
		}
		bw.flush();			
		bw.close();
		
				
	}
}