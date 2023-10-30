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
				
		int[] arr = new int[9];
		
		int max = 0;
		int count = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}			
		
		max = arr[0];
		for(int j=1; j<9; j++) {
			if(arr[j]>max) {
				max = arr[j];
				count = j+1;
			}
		}
		
		if(max == arr[0]) {
			max= arr[0];
			count = 1;
		}
		
		bw.write(max +"\n"+count+"\n");	
		
		bw.flush();			
		bw.close();
				
	}
}
