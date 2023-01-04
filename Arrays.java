import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
		System.out.println("Enter array element:");
		a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.println(a[i][j]);
			}
}
}
}