import java.util.Arrays;

public class ShareCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);     // 对 g 数组排序
        Arrays.sort(s);     // 对 s 数组排序
        int count = 0;      // 统计孩子满足的个数
        int k = 0;          // 记录分到第几块饼干了
        for (int i = 0; i < g.length; i++) {    // 遍历每个孩子
            if (k == s.length)  return count;   // 如果饼干已经考虑完了则返回结果
            for (int j = k; j < s.length; j++) {    // 从第k块饼干开始考虑
                if (s[j] >= g[i]) {     // 当前饼干能满足当前孩子
                    count++;            // 饼干分给这个孩子
                    k = j + 1;          // 开始分下一块饼干
                    break;              // 挑出饼干层，为下一个孩子分饼干
                }
            }
        }
        return count;       // 孩子遍历完了，返回结果
    }

}
