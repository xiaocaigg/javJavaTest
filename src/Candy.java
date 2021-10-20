import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];//学生分糖果的数组
        Arrays.fill(candies, 1);//把数组candies填充为1
        System.out.println("c1:"+candies[0]+candies[1]+candies[2]);
        //从左到右遍历并分配糖果，仅更新评分比左邻居高且糖果数小于等于左邻居的学生
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        System.out.println("c2:"+candies[0]+candies[1]+candies[2]);
        int sum = candies[ratings.length - 1];
        System.out.println("sum:"+sum);
        //从右到左遍历，如果 ratings[i] > ratings[i + 1]，
        // 更新为candies[i] = max(candies[i], candies[i + 1] + 1])
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            sum += candies[i];
        }
        return sum;
    }

}
