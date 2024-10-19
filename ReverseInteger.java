/* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.  */
class ReverseInteger {
    public int reverse(int x) {
        int n = Math.abs(x); 
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            if (rev > (Integer.MAX_VALUE - r) / 10) {
                return 0;
            }
            rev = rev * 10 + r;
            n /= 10;
        }
        // Restore the sign
        if (x < 0) {
            rev = -rev;
        }
        return rev;
    }
}
