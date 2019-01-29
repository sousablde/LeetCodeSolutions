import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        int loopCounter = 0;
        int len = (emails.length);
        String[] comp = new String[len];

        //I will first iterate through each of the strings in the array
        for (String email : emails) {

            //I will split the each string into an array with 2 elements at the @ point
            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];

            //I will now remove from the localName and domainName everything after the + sign and I will remove the "."
            localName = localName.split("\\+")[0];
            localName = localName.replace(".", "");

            //here I concatenate the localName and the domainName back together
            String result = localName + '@' + domainName;

            //save each new concatenated element as a string element of the array comp and update the value of loopCounter
            comp[loopCounter] = result;
            loopCounter++;
        }

        //sets are collections that contain no duplicates I am using it to remove all duplicates
        //leaving me with just my unique emails
        Set<String> set = new HashSet<String>();
        for (String uniArr : comp) {
            set.add(uniArr);
        }

        return set.size();
    }
}