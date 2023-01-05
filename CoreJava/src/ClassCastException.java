import java.math.BigDecimal;
 public class ClassCastException {
    public static void main(String[] args)
    {
       
        Object sampleObject = new BigDecimal(8.67);
       
        System.out.println(String.valueOf(sampleObject));
    }
}