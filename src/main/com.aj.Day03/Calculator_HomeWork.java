import java.math.BigDecimal;

public class Calculator_HomeWork {

    public static double add(double a, double b){
        return a+b;
    }
    public static double minus(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static BigDecimal divide(BigDecimal a, BigDecimal b){
        return a.divide(b,30,BigDecimal.ROUND_CEILING);
    }

    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(minus(3,12));
        System.out.println(multiply(3,12));
        BigDecimal aa = new BigDecimal(3);
        BigDecimal bb = new BigDecimal(7);
        System.out.println(divide(aa,bb));
    }
}
