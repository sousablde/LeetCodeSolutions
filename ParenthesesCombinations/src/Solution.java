import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        //I will attempt to use a backtracking algorithm to approach this solution
        List<String> result = new ArrayList<>();

//        if (n == 0) return result;

        helperF(result, "", n, n, 0);

        return result;
    }

    private void helperF(List<String> result, String str, int lPar, int rPar, int iteration ){
        System.out.println("helperF: " + iteration + ", lPar = " + lPar + ", rPar = " + rPar);
        if(lPar == 0 && rPar == 0){
            result.add(str);
            iteration++;
            System.out.println("str "+ str + ""+ iteration + " if 1 " );
            return;
        }

        if(lPar > rPar){
            iteration++;
            System.out.println("str "+ str + ""+ iteration + " if 2");
            return;
        }

        if(lPar > 0){
            iteration++;
            System.out.println("str "+ str + ""+ iteration+ " if 3");
            helperF(result, str + "(", lPar - 1, rPar, iteration);
        }

        if(rPar > 0){
            iteration++;
            System.out.println("str "+ str + ""+ iteration+ " if 4"
            );
            helperF(result, str + ")", lPar, rPar - 1, iteration);
        }
    }
}