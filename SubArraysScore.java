// The score of an array is defined as the product of its sum and its length.
// For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
// Given a positive integer array nums and an integer k, return the number of non-empty subarrays of nums whose score is strictly less than k.
// A subarray is a contiguous sequence of elements within an array.

public class SubArraysScore {
    public static int scoreNumber(int[] arr, int k) {
        int count = 0;
        int a = 0;
        while (a < arr.length) {
            int sum = 0;
            int t = 0;
            for (int i = a; i < arr.length; i++) {
                sum = sum + arr[i];
                t++;
                int pro = sum * t;
                if (pro < k) {
                    count++;
                }
            }
            a++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1,1 };
        int k = 10;
        int n = scoreNumber(arr, k);
        System.out.println("total score : " + n);
    }
}
