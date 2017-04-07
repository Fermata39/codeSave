import java.util.*;

public class test{
	public static void main(String[] args){
		int checker = 0;
		//String str = "app";
		int val = 'b' -'a';
		System.out.println("step1: " + val);

		if((checker &(1<<val)) > 0){
			System.out.println("step2: " + checker);
		}else{
			checker |= (1 << val);
			System.out.println("step3: " + checker);
		}

		val = 'b' -'a';

		if((checker &(1<<val)) > 0){
			System.out.println("step4: " + checker);

		}else{
			System.out.println("step5: " + checker);
		}

	}
}
