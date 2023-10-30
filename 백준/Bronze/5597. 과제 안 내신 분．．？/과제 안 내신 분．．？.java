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
				
		// StringTokenizer st = new StringTokenizer(br.readLine());
		
		// int N = Integer.parseInt(st.nextToken());
		// int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[30];
		
		for(int i=0; i<30; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<28; i++) {
			int check = Integer.parseInt(br.readLine());
			
			arr[check-1] = 0;	
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i] != 0) {
				bw.write(arr[i]+"\n");
			}
		}
		
		
		bw.flush();			
		bw.close();
				
	}
}



