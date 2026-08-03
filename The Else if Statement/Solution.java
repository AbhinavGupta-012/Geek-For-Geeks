import java.util.Scanner;

class Solution {
    public static void utility(int number) {
        if (number > 100){
            System.out.println("Big");
        }
        else if (number < 10){
            System.out.println("Small");
        }
        else{
            System.out.println("Number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        utility(n);
    }
}