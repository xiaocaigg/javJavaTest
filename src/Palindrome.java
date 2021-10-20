public class Palindrome {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length()-1;
        while(left < right){
            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right){//如果指针指的不是字母和数字，指针前移
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right)) && right > left){
                right--;
            }
            //比较指针所指的字母是否相等，如果相等，返回上面，执行while循环；如果不相等，返回false，退出循环。
            if(!(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
