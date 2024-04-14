package leetcode.LEETCODE75;

import maths.GCD;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
public class StringGCD {
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
       // String str1 = "ABABAB", str2 = "ABAB";
        // String str1 = "ABCABC", str2 = "ABC";

        System.out.println(stringGCD(str1,str2));

    }

    private static String stringGCD(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcd = recursiveGcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }

    private static int recursiveGcd(int n1, int n2) {
        if(n2==0)
            return n1;
        return recursiveGcd(n2,Math.abs(n1-n2));
    }
}
