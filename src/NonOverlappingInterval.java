import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval {
    public int eraseOverlapIntervals(int[][] intervals) {
        //贪心算法
        //按照每行第二个元素升序排序，即每个区间的结尾进行升序排序
        //每次选择结尾最小的且不与当前已有区间重合的
        //用总共区间的个数-不重叠区间的个数=最少删去区间的个数
        int len=intervals.length;
        if(len==0)
            return 0;
        Arrays.sort(intervals,new Comparator<int[]>() {
            @Override//验证下方的方法名是否父类所有，不是则报错
            public int compare(int[] o1,int[] o2) {
                return o1[1]-o2[1];
            }
        });//arr={{1,2},{2,3},{3,4},{1,3}}，排序结果12、23、13、34
        int end=intervals[0][1];
        int count=1;//不重叠区间的个数至少为1

        for(int i=1;i<len;i++) {
            //从第二个元素开始遍历
            if(intervals[i][0] >= end) {
                //与当前已有未区间重合
                //取与当前区间不重合的end最小的区间
                count++;
                end=intervals[i][1];
            }
        }
        return len-count;
    }
}