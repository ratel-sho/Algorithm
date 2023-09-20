import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int A, B;
		int[] temp = new int[3];
		A = sc.nextInt();			
		B = sc.nextInt();
		int i=0;
		int sum=0;		
		
		while(B!=0) {
			temp[i] = B%10;
			i++;
			B = B/10;
			}
		
		for(i=0; i<temp.length; i++) {
			System.out.println(A*temp[i]);
		}
		
		sum = A*temp[0] + A*temp[1]*10 + A*temp[2]*100;
		
		System.out.println(sum);
	}
}

