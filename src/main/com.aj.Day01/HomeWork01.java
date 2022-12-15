public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("打印直角三角形！！！");
        for (int i=1;i<6;i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("打印等边三角形");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for (int i=1;i<=10;i++) {
//            for (int j = 1; j <= 10 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
