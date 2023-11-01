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
	
		String temp1 = "1 1 2 2 2 8";
		
		StringTokenizer st1 = new StringTokenizer(temp1);
				
		String temp2;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<6; i++) {
			
			int be = Integer.parseInt(st1.nextToken());
			int af = Integer.parseInt(st2.nextToken());
			
			if(0 < af) {
				if(af<=be) {
					bw.write(be-af+" ");
				}else {
					bw.write("-"+(af-be)+" ");
				}				
			}else if(0 == af) {
				bw.write(be+" ");
			}else if(0 > af){
				bw.write((Math.abs(af)+be)+" ");
			}			
		}
		
		bw.flush();
		bw.close();
	}
}
