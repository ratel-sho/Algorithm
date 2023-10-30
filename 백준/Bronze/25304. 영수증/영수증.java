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
		
		int Tcost = Integer.parseInt(br.readLine());
		int Tcase = Integer.parseInt(br.readLine());
		

		int sum = 0;
		
		for(int i = 0; i<Tcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cost = Integer.parseInt(st.nextToken());
			int  count= Integer.parseInt(st.nextToken());
			
			sum += (cost *count); 
		}
		
		if(Tcost == sum) {
			bw.write("Yes");
		}else {
			bw.write("No");
		}		
		
		bw.flush();
		bw.close();		
	}
}