class Laptop{
	void input() {
		System.out.println("Different types of Laptop Companies");
	}
}
class Windows extends Laptop{
	void window() {
		System.out.println("Windows laptops");
	}
}
class Dell extends Windows{
	void lapy() {
		System.out.println("Dell Laptop");
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dell x=new Dell();
		x.input();
		x.window();
		x.lapy();
	}
}
