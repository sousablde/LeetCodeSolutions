import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return "[ " + start + ", " + end + " ]";
    }
}

class Solution {
    public List<Interval> merge(List<Interval> intervals) {

        //first I will sort the intervals by their start value
        intervals.sort(Comparator.comparingInt(obj1 -> obj1.start));

        //I need to declare the resulting merged list
        LinkedList<Interval> merged = new LinkedList<>();

        //I need to iterate through the list and merge the intervals
        for (Interval interval : intervals)

            //if the list is empty or the last interval in the merged list is smaller than the start
            // of the interval we are trying to insert add the interval to the merged list
            if (merged.isEmpty() || merged.getLast().end < interval.start)
                merged.add(interval);

                //else assign the biggest: the last interval in the linked list or the interval to be merged
                //to getLast()
            else merged.getLast().end = Math.max(merged.getLast().end, interval.end);

        System.out.println("Input array: ");
        printIntervals(intervals);


        System.out.println("Merged array: ");
        printIntervals(merged);
        //return the merged linked list
        return merged;
    }

    private void printIntervals(List<Interval> intervals) {
        System.out.print("[ ");
        for (Interval interval : intervals) {
            System.out.print(interval.toString() + ", ");
        }
        System.out.println(" ]");
    }
}

public class Main {

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(1, 3), new Interval(2, 6),
                new Interval(8, 10), new Interval(15, 18));

        Solution solution = new Solution();
        solution.merge(intervals);

    }
}
