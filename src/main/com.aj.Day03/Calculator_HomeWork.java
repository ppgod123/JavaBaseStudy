import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator_HomeWork {

    public  BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }
    public  BigDecimal subtract(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }
    public  BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }
    public  BigDecimal divide(BigDecimal a, BigDecimal b){
        return a.divide(b,30,BigDecimal.ROUND_CEILING);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第一个数字：");
            BigDecimal a = scanner.nextBigDecimal();
            System.out.println("输入内容必须为数字！！！");
            System.out.print("请输入运算符：");
            String C = scanner.next();
            System.out.println("输入字符必须为*、/、-、+");
            System.out.print("请输入第二个数字：");
            BigDecimal b = scanner.nextBigDecimal();
            System.out.println("输入内容必须为数字！！！");
        Calculator_HomeWork calculator_homeWork = new Calculator_HomeWork();
        if ("+".equals(C)){
            System.out.println(calculator_homeWork.add(a,b));
        }else if ("-".equals(C)){
            System.out.println(calculator_homeWork.subtract(a,b));
        }else if ("*".equals(C)){
            System.out.println(calculator_homeWork.multiply(a,b));
        }else if ("/".equals(C)){
            System.out.println(calculator_homeWork.divide(a,b));
        }
        scanner.close();
    }
}
