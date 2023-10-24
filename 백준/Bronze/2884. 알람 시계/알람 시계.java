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
		int b = Integer.parseInt(st.nextToken());
		
		int temp = 0;
		int at = 0;
		int bt = 0;
		
		
		//시간 계산
		if(a != 0 ) {
			temp = a*60 + b - 45;
		}else {
			if(b >= 45) {
				temp = a*60 + b - 45;
			}else {
				temp = 24*60 - (45-b);			
			}
		}
		
		at = temp/60;
		bt = temp%60;
		
		bw.write(at + " " + bt);		
		
		bw.flush();
		bw.close();
	}
}