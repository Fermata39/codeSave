public class recursiveTest{
	static int value=0;
	public static void main(String[] args){
		
		recursive();
			
	}

	public static void recursive(){
		int i=0;
		if(value < 10){
			value++;
			recursive();
			System.out.println("res["+i+"]:" + value);
			i++;
		}else{
			System.out.println("exception");
		}
	}
}
