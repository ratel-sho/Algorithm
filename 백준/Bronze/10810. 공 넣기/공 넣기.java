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
		
		int arr[] = new int[N];
		
		for(int i=0; i<M; i++) {
			StringTokenizer gt = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(gt.nextToken());
			int b = Integer.parseInt(gt.nextToken());
			int c = Integer.parseInt(gt.nextToken());
			
			for(int j=a-1; j<=b-1; j++) {
				arr[j] = c; 
			}			
		}
		
		for(int i=0; i<N; i++) {
			
			if(arr[i] == 0) {
				arr[i] = 0;
			}
			
			bw.write(arr[i]+" ");
		}
		
		bw.flush();			
		bw.close();
				
	}
}