class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int curr = 0;
        for(int num : nums){
            if(count == 0) {
                curr = num;
                count = 1;
                System.out.println("算法里1："+num);
                continue;
            }
            System.out.println("算法里2："+num);
            if(curr == num){
                System.out.println("算法里3："+num);
                count ++;
            }else{
                System.out.println("算法里4："+num);
                count --;
            }
        }
        return curr;

    }
}