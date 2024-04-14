package leetcode.LEETCODE75;

//https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternatively {
    public static void main(String[] args) {
//        String word1 = "abc", word2 = "pqr";

        String word1 = "ab", word2 = "pqrs";

//        String word1 = "abcd", word2 = "pq";

        System.out.println(mergedStringsAlternatively(word1,word2));
    }

    private static String mergedStringsAlternatively(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length())
                result.append(word1.charAt(i));
            if(i<word2.length())
                result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    }
}
