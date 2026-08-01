import java.util.Scanner;

class Solution{
    public static void utility (int x){
        while (x >= 0){
            System.out.print(x + " ");
            x--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        utility(x);
    }
}