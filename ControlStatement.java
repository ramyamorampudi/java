
public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3,j=7;
		if (i<j) {
			i=i+j;
			System.out.println("The value of i is "+i);
		}
		else if (j<i){
			System.out.println("not possible");
		}
		else {
			System.out.println("sum wrong");
		}
	}

}
