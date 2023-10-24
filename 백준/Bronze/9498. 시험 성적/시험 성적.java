import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a = Integer.parseInt(st.nextToken());
		
		if( a >= 90 && a <=100) {
			bw.write("A");
		}else if(a >= 80 && a <=89) {
			bw.write("B");
		}else if(a >= 70 && a <=79){
			bw.write("C");
		}else if(a >= 60 && a <=69){
			bw.write("D");
		}else {
			bw.write("F");
		}

		bw.flush();
		bw.close();
	}
}