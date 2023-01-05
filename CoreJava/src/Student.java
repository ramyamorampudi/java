 class College{
	void departments() {
		System.out.println("1.ECE 2.CSE 3.IT 4.CIVIL");
	}
	void selectDepartment(String department) {
		System.out.println("Department selected is "+department);
	}
	String admitDepartment() {
		return "ECE";
	}
	String admissionFee(int fee) {
		System.out.println("Amount given is "+fee);
	return "Paid";
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College sai=new College();
		sai.departments();
		sai.selectDepartment("ECE");
		System.out.println("Admitted department is "+sai.admitDepartment());
		System.out.println("Admission Fee is "+sai.admissionFee(1000));

	}

}
