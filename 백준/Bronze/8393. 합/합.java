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
			
		int Tcase = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		int sum = 0;
		
		for(int i = 1; i<=Tcase; i++) {
			sum += i;
		}
		
		bw.write(sum+"\n");
		
		bw.flush();
		bw.close();		
	}
}