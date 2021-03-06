import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class mergeSortTest {
    static int cnt = 0;
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(8);
		list.add(9);

		System.out.println("after: " + mergeSort(list).toString());
	}

	private static List<Integer> mergeSort(List<Integer> list) {
		// TODO Auto-generated method stub
		if (list.size() < 2)
			return list;

        System.out.println("list: " + list.toString());
		int middle = list.size() / 2;

		List<Integer> leftList = list.subList(0, middle);
		List<Integer> rightList = list.subList(middle, list.size());


		List<Integer> lSort = mergeSort(leftList);
		List<Integer> rSort = mergeSort(rightList);
        
        System.out.println("lSort res: " + lSort.toString());
        System.out.println("rSort res: " + rSort.toString());
        //return merge(mergeSort(leftList), mergeSort(rightList));
        return merge(lSort,rSort);
	}

	private static List<Integer> merge(List<Integer> lSort, List<Integer> rSort) {
		// TODO Auto-generated method stub

		int left = 0;
		int right = 0;

        //System.out.println("lSort: " + lSort.toString());
        //System.out.println("rSort: " + rSort.toString());
        System.out.println("call cnt:  " + cnt);
        cnt++;

		List<Integer> returnList = new ArrayList<>();

		while (left < lSort.size() && right < rSort.size()) {
			if (lSort.get(left) < rSort.get(right)) {
				returnList.add(lSort.get(left));
				left++;
			} else {
				returnList.add(rSort.get(right));
				right++;
			}
		}

		while (left < lSort.size()) {
			returnList.add(lSort.get(left));
			left++;
		}

		while (right < rSort.size()) {
			returnList.add(rSort.get(right));
			right++;
		}

		return returnList;
	}
}

