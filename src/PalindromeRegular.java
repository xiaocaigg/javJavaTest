public class PalindromeRegular {
    public boolean isPalindrome(String s) {
        //去掉非字母数字的字符
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        //把字符反转
        String rev = new StringBuffer(actual).reverse().toString();
        //反转的字符与原有的字符比较
        return actual.equals(rev);
    }
}
