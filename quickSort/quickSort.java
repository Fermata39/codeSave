import java.util.ArrayList;
import java.util.List;

public class quickSort{
  public static void main(String[] args){
    System.out.println("Enter quickSort enter");

    List<Integer> number = new ArrayList<>();
    number.add(5);
    number.add(3);
    number.add(1);
    number.add(2);
    number.add(4);

    List<Integer> afterNumber = quickSortFun(number);

    for(int data : afterNumber){
      System.out.println("after sort: " + data);
    }
  }

  public static List<Integer> quickSortFun(List<Integer> number){
    if(number.size() < 2){
      return number;
    }

    Integer pivot = number.get(0);
    List<Integer> lower = new ArrayList<>();
    List<Integer> higher = new ArrayList<>();

    for(int i=1; i<number.size(); i++)
    {
      if(number.get(i) < pivot){
        lower.add(number.get(i));
      }else{
        higher.add(number.get(i));
      }
    }

    List<Integer> sort = quickSortFun(lower);
    sort.add(pivot);
    sort.addAll(quickSortFun(higher));

    return sort;
  }
}
