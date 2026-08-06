import java.util.Scanner;

class Solution {
    public static int closestNumber(int n, int m) {
        int num1 = n;
        while (num1 % m != 0){
            num1++;
        }
        int num2 = n;
        while (num2 % m != 0){
            num2--;
        }
        int val1 = Math.abs(num1);
        int val2 = Math.abs(num2);
        int diff1 = Math.abs(num1 - n);
        int diff2 = Math.abs(n - num2);
        return diff1 != diff2 ? diff1 < diff2 ? num1 : num2 : val1 > val2 ? num1 : num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(closestNumber(n, m));
    }
}