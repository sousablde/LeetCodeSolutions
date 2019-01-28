class Solution {
    public char findTheDifference(String s, String t) {

        //knowing the 2 Strings are identical with the exception of one element
        //I will sort the 2 character arrays
        char[] ss = sorter(s);
        char[] tt = sorter(t);

        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != tt[i]) {
                return tt[i];
            }
        }
        return tt[tt.length - 1];
    }


    //I am creating a helper function to sort my arrays of chars

    public char[] sorter(String str) {

        //s == t with the exception of the length, the order and one char
        //first I will convert the strings to char arrays
        char[] ss = str.toCharArray();


        //sorting the array of characters
        for (int i = 0; i < ss.length; i++) {
            for (int j = i + 1; j < ss.length; j++) {
                if (ss[j] < ss[i]) {
                    //based on ascii code, if the character at index j
                    //has a higher value than the character at index i
                    //I will swap them

                    char temp = ss[i];//we assign highest value char to temp
                    ss[i] = ss[j];//assign j to the index i position
                    ss[j] = temp;//and then assign what used to be j to i
                }
            }
        }

        return ss;
    }


}
    