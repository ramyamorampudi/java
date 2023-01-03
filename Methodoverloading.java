class Addition{
	void sum(int x, float y) {
		System.out.println("Two Integer sum="+(x+y));
		
	}
	void sum(float x, int y) {
		System.out.println("Two integer sum="+(x+y));
	} 
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a= new Addition();
		a.sum(1.6f,6);
	}
}