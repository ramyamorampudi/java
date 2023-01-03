class Employee{
	int emp_id;
	int projects;
	String emp_des;
	static String company_name;
}
public class InstanceVariable {

	public static void main(String[] args) {
		Employee sri=new Employee();
		sri.emp_id=123;
		sri.projects=4;
		sri.emp_des="Manager";
		Employee.company_name="Amazon";
		System.out.println("Employee ID="+sri.emp_id);
		System.out.println("Employee Projects="+sri.projects);
		System.out.println("Employee Designation="+sri.emp_des);
		System.out.println("Employee Company="+Employee.company_name);
		
	}

}
