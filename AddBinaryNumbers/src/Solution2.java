class Solution2 {
    public String addBinary(String a, String b) {

        if(a == null || b == null){
            return a==null ? b : a;
        }

        char carry = '0';

        StringBuilder result = new StringBuilder();

        int lenA = a.length()-1, lenB = b.length()-1;

        char[] sum = new char[Math.max(a.length(), b.length())];

        for (; lenA >= 0 || lenB >= 0 || carry == '1'; lenA--, lenB--){
            if( lenA >= 0){

                sum[lenA] = a.charAt(lenA);
            }
        }
    }

}