import java.util.Arrays;

class Solution {
    public String addBinary(String a, String b) {

        //find which one is the longest string
        int longest = Math.max(a.length(), b.length());

        String result = "";

        //create 2 variables to be the pivots for the array index
        int indA = a.length();
        int indB = b.length();

        //create 2 arrays of ints
        int[] aa = new int[longest];
        int[] bb = new int[longest];

        //the sum of these 2 numbers can have at most one extra order of magnitude, so:
        int[] sum = new int[longest + 1];

        //I will convert the character to an int, 48 is the ascii code for 0
        int[] as = intConverter(a, longest, indA, aa);
        int[] bs = intConverter(b, longest, indB, bb);


        //this for loop will start iterating through the last element
//        //to cover test cases with only zeros I will keep a zero counter
//        int zerCounter = 0;
        for (int i = longest; i > 0; i--) {

            if (sum[i] == 0 && as[i - 1] == 0 && bs[i - 1] == 0) {
                sum[i] = 0;
            } else {
                sum[i] = sum[i] + as[i - 1] + bs[i - 1];
            }
            if (sum[i] == 2) {
                sum[i] = 0;
                sum[i - 1] = 1;
            } else if (sum[i] == 3) {
                sum[i] = 1;
                sum[i - 1] = 1;
            }

//            if(sum[i] == 0){
//                zerCounter++;
//            }
        }
//        result = Arrays.toString(sum).replaceAll("\\[|\\]|,|\\s", "");
//        if(zerCounter == longest+1){
//            result = "0";
//        }

        return Arrays.toString(sum).replaceAll("\\[|\\]|,|\\s", "");
    }

    private int[] intConverter(String s, int longest, int indS, int[] ss) {
        for (int j = ss.length - 1; j >= longest - s.length(); j--) {

            ss[j] = s.charAt(indS - 1) - 48;
            indS--;
        }
        return ss;
    }
}
