import java.util.Scanner;

public class ControlStatementFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n=sc.nextInt();
		int i,sum=0,average=0;
		for(i=1;i<n;i++) {
			sum = sum+i;
			average = sum/n;
		}
		System.out.println(average);
	}

}
