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
		
		for(int i=1; i<N+1; i++) {
			arr[i-1] = i;
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer gt = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(gt.nextToken());
			int b = Integer.parseInt(gt.nextToken());
			
			int temp = 0;
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
			
		}
		
		for(int i=0; i<N; i++) {
			
			bw.write(arr[i]+" ");
		}
		
		bw.flush();			
		bw.close();
				
	}
}