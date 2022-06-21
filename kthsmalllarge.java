import java.util.*;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
        ArrayList<Integer> a=new ArrayList<>(2);
        a.add(arr.get(k-1));
        a.add(arr.get(arr.size()-1-(k-1)));
        return a;
	}
}
