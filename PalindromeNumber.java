import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int t = x;
        int sum = 0;
        while(t>0){
            int r = t%10;
            sum = sum*10+r;
            t/=10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    boolean palindrome = isPalindrome(n);
    if(palindrome){
        System.out.println(n+" is a palindrome number");
    }else{
        System.out.println(n+" is not a palindrome number");
    }
    sc.close();
}
