public class SumTwoNumbers {
        public int[] twoSum(int[] numbers, int target) {
            int low =0;
            int hight =numbers.length-1;
            while(low<hight){
                if(numbers[low]+numbers[hight]==target){
                    return new int [] {low+1,hight+1};
                }
                if(numbers[low]+numbers[hight]<target){
                    low++;
                }
                else{
                    hight--;
                }
            }
            return null;
        }
}
