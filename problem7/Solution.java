
/**
 * Created by guhao on 7/24/17.
 */
public class Solution {
    public int reverse(int x) {
        long result = 0;
        int temp = Math.abs(x);
        while (temp > 0){
            result *= 10;
            result += temp%10;
            if (result > Integer.MAX_VALUE){
                return 0;
            }
            temp /=10;
        }
        return x>0?(int)result:(int)-result;
    }
}
