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
		
		
		String temp = br.readLine();
			
		int Tcase = Integer.parseInt(temp);
		
		int a = 0, b = 0;
		int answer = 0;
		
		for(int i = 0; i<Tcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());		
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			answer = a + b;
			bw.write(answer+"\n");
		}
		
		bw.flush();
		bw.close();		
	}
}
