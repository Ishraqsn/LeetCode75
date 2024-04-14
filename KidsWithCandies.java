package leetcode.LEETCODE75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        for (Boolean res:result) {
            System.out.println(res);
        }
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for (int candy:candies) {
            result.add(candy+extraCandies>=max);
        }
        return result;
    }
}
