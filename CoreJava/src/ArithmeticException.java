public class ArithmeticException  
{  
void division(int a, int b)  
{  
int div = a / b;   
System.out.println("Division result is: " + div);  
}  
public static void main(String argvs[])  
{    
ArithmeticException a = new ArithmeticException();  
a.division(2, 1);  
}  
}  