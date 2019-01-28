class Solution {
    public int numJewelsInStones(String J, String S) {
        //we want to know how many of our S's are Jewels, so
        //how many of our S's == J's
        int jewelCounter = 0;

        //I will save each character in the string to a character array
        //for that I will create 2 char arrays
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();

        //next I need to compare the contents of each string
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < s.length; k++) {
                if (j[i] == s[k]) {
                    jewelCounter++;
                }
            }
        }

        return jewelCounter;
    }
}