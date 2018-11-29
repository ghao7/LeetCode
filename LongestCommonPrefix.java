public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] s = {""};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        boolean go = true;
        StringBuffer sentence = new StringBuffer();
        int count = 0;
        int shortest = Integer.MAX_VALUE;
        while (go){
            if (strs[0].length() == 0) return sentence.toString();
            char c = strs[0].charAt(count);
            for (int i = 0; i< strs.length;i++){
                if (strs[i].length() == 0) return sentence.toString();
                if (strs[i].length()<shortest) shortest = strs[i].length();
                if (c != strs[i].charAt(count)) {
                    return sentence.toString();
                }
            }
            sentence.append(strs[0].charAt(count));
            count++;
            System.out.println(count);

            if (count >= shortest){
                go = false;
            }
        }

        return sentence.toString();
    }
    public String longestCommonPrefixBetter(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
