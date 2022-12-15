public class Array_HomeWork {
    public static void main(String[] args) {
        //增强for循环
        String [] a = {"111","123","223","1112","467777"};
        for (String b:a) {
            System.out.println(b);
        }
        //0-100奇数和偶数分别求和
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < 101; i++) {
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("0-100偶数和:"+sum1);
        System.out.println("0-100奇数和:"+sum2);
        //冒泡排序
        int[] nums = {9,4,3,2,1,77,199,23,11,17};
        System.out.println("=======================排序前=======================");
        for (int num:nums) {
            System.out.print(num+"\t");
        }
        System.out.println();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i ; j++) {
                if (nums[j]>nums[j+1]){
                    int ss = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = ss;
                }
            }
        }
        System.out.println("=========================排序后=======================");
        for (int num: nums) {
            System.out.print(num+"\t");
        }
    }
}
