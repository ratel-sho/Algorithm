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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}	
		
		for(int i=0; i<M; i++) {
			StringTokenizer gt = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(gt.nextToken())-1;
			int b = Integer.parseInt(gt.nextToken())-1;		
			int sub = b-a;
		
			for(int j = 0; j<=sub/2; j++) {
				int temp = arr[b-j];
				arr[b-j] = arr[a+j];
				arr[a+j] = temp;							
			}		
		}
		
		for(int z=0; z<N; z++) { bw.write(arr[z]+" "); }
		
	
		bw.flush();			
		bw.close();		
	}
	
}