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
		
		int Tcase = Integer.parseInt(br.readLine());
		int answer = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String check = br.readLine();
		
		for(int j=0; j<Tcase; j++) {
			if(st.nextToken().equals(check)) {
				answer++;
			}
		}
		
		bw.write(answer+"\n");
		
		bw.flush();			
		bw.close();
				
	}
}
