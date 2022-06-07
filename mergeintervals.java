import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> s=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval p1, Interval p2) {
                return p1.start - p2.start;
            }
        });
        int starts=intervals[0].start;
        int finishes=intervals[0].finish;
        if(intervals.length==1){
            s.add(new Interval(starts,finishes));
        }
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start>=starts&&intervals[i].start<=finishes){
                if(intervals[i].finish>finishes){
                     finishes=intervals[i].finish;
                }
                 if(i==intervals.length-1){
                    s.add(new Interval(starts,finishes));
                }
            }
            else{
                s.add(new Interval(starts,finishes));
                starts=intervals[i].start;
                finishes=intervals[i].finish;
                 if(i==intervals.length-1){
                    s.add(new Interval(starts,finishes));
                }
            }
        }
        return s;
    }
}
