import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    //        public int uniqueMorseRepresentations(String[] words) {
//            String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//
//            HashSet<String> uniq = new HashSet<>();
//            for(String word: words){
//                StringBuilder sb = new StringBuilder();
//                for (int i = 0; i < word.length(); i++){
//                    sb.append(morse[Character.getNumericValue(word.charAt(i)) - 10]);
//                    System.out.println("test 1" + word + sb + "morse" + (Character.getNumericValue(word.charAt(i))- 10 )+ " i "+ i);
//
//                }
//                System.out.println("test 2" + sb);
//                uniq.add(sb.toString());
//            }
//            return uniq.size();
//
//    }
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set hash = new HashSet();

        for (int i = 0; i < words.length; i++) {

            String temp = words[i];
            StringBuffer sb = new StringBuffer();

            for (int j = 0; j < temp.length(); j++) {
                sb.append(morse[(temp.charAt(j)) - 97]);//97 is where lower case alphabet starts
            }

            hash.add(sb.toString());
        }
        return hash.size();
    }
}
