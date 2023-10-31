import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 97 -> a, 122 -> z				
		String temp = br.readLine();
		char[] tempArr = new char[temp.length()];
		
		for(int i=0; i<temp.length(); i++) {
			tempArr[i] = temp.toCharArray()[i];
		}		 
		
		int[] answer = new int[26];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = -1;
		}		
		
		for(int i=0; i<temp.length(); i++) {
			int n = tempArr[i] -97;
			if(answer[n] == -1) {
				answer[n] = i;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			bw.write(answer[i]+" ");
		}
		
		bw.flush();
		bw.close();
	}

}
