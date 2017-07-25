import java.util.ArrayList;
import java.util.List;

/**
 * Created by guhao on 7/24/17.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> list = new ArrayList<>();
        while (x != 0){
            list.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) != list.get(list.size()-i-1)) return false;
        }

        return true;
    }
}


