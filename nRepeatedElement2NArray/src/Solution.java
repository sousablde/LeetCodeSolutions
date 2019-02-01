import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] A) {
//        Arrays.sort(A);
//        for (int i = 0; i < A.length; i++){
//            if(A[i] == A[i+1]) return A[i];
//        }
//        return 0;
        HashSet<Integer> uniq = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (uniq.contains(A[i])) {

                return A[i];
            } else uniq.add(A[i]);
        }
        return 0;
    }
}