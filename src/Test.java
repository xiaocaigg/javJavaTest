import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

    System.out.println("github,hello!12");
    }
}

//两数之和
//    int[] numbers = {2, 7, 11, 15};
//    int target = 9;
//    SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();
//    int[] targetNum = sumTwoNumbers.twoSum(numbers,target);
//    for(int i = 0;i<targetNum.length;i++){
//        System.out.println("两数之和："+targetNum[i]);
//    }
//定义二维数组
//        int[][] arr={{1,2},{2,3},{3,4},{1,3}};
//        int[] arr2={1,3,2,4};
//
//        Arrays.sort(arr,new Comparator<int[]>() {
//            @Override//验证下方的方法名是否父类所有，不是则报错
//            public int compare(int[] o1,int[] o2) {
//                return o1[1]-o2[1];
//            }
//        });
//输出二维数组
//        for(int x=0;x<arr.length;x++){
//            for(int y=0;y<arr[x].length;y++){
//                System.out.print(arr[x][y]);
//            }
//            System.out.println();
//        }

//        int len=arr.length;
//        System.out.println("数组长度："+len);
//
//        NonOverlappingInterval nonOverlappingInterval = new NonOverlappingInterval();
//        System.out.println("区间："+nonOverlappingInterval.eraseOverlapIntervals(arr));


//        int[] c1 =  new int[]{1,2};
//        int[] c2 =  new int[]{2,3};
//        TestArr testArr = new TestArr();
//        System.out.println("c1c2:"+ testArr.compare1(c1,c2));
//分糖果
//        int[] c =  new int[]{1, 0, 2};
//        System.out.println("c:"+c[0]+c[1]+c[2]);
//        Candy candy = new Candy();
//        System.out.println("糖果数:"+candy.candy(c));
//分饼干
//        int[] child = new int[3];
//        int[] cookies = new int[2];
//        child[0] = 1;
//        child[1] = 2;
//        child[2] = 3;
//        cookies[0] = 1;
//        cookies[1] = 1;
//        ShareCookies shareCookies = new ShareCookies();
//        System.out.println("最右："+shareCookies.findContentChildren(child,cookies));

//验证回文字符串
//        String s1 = "BA man, a plan, a canal: Panama";
//        String s2 = "race a car";
//        Palindrome palindrome = new Palindrome();
//        PalindromeRegular palindromeRegular = new PalindromeRegular();
//        System.out.println("是否为回文字符串："+palindrome.isPalindrome(s1));
//        System.out.println("是否为回文字符串："+palindrome.isPalindrome(s2));

//        System.out.println("是否为回文字符串-正则："+palindromeRegular.isPalindrome(s1));
//        System.out.println("是否为回文字符串-正则："+palindromeRegular.isPalindrome(s2));
//查找个数大于n/2的数
//        int[] nums = new int[4];
//        nums[0] = 3;
//        nums[1] = 1;
//        nums[2] = 1;
//        nums[3] = 3;
//        Solution solution =  new Solution();
//        System.out.println("计算结果："+solution.majorityElement(nums));