import java.util.Scanner;
public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int i=7;
		if (i<10) {
			int num=sc.nextInt();
			i=i+num;
			System.out.println("The value of i is "+i);
		}
		else {
			System.out.println("sum wrong");
		}
	}
}