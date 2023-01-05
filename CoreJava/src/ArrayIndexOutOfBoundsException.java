
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
		//Declaring 4 elements in the String array                                       
		          
		        for(int i=0;i<=arr.length;i++) {       
		  
		//Here, no element is present at the iteration number arr.length, i.e 4  
		             System.out.println(arr[i]);                
		        }  // TODO Auto-generated method stub

	}

}
