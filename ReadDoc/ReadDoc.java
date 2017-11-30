import java.util.*;

public class ReadDoc{
	public static void main(String[] args){
		String[] doc = {"apple","orange","grape","grape","grape","apple"};	
		initDoc(doc);
	}

	public static void initDoc(String[] doc){
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		for(String word:doc){
			if(map.containsKey(word)){
				map.put(word,map.get(word)+1);
			}else{
				map.put(word,1);
			}
		}

		printResult(map);

	}

	public static void printResult(HashMap<String,Integer> map){
		Iterator<String> iterator = map.keySet().iterator();

		while(iterator.hasNext()){
			String key = iterator.next();

			System.out.println("key: " + key + " cnt: " + map.get(key));
		}
	}
}
