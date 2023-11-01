import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String temp = br.readLine();
		
		String[] Arr = temp.split("");
		
		String[] rArr = new String[Arr.length];
		
		int count = 0;
		
		for(int i=Arr.length-1; i>=0; i--) {
			rArr[count++] = Arr[i];
		}		
		
		count = 0;
		for(int i=0; i<Arr.length; i++) {
			if(rArr[i].equals(Arr[i])) {
				count++;
			}
		}
		
		if(count == Arr.length) {
			bw.write("1");
		}else {
			bw.write("0");
		}
			
		
		bw.flush();
		bw.close();
	}
}
