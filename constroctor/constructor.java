public class constructor {
    public static void main(String[] args) {
	childC c = new childC();
		    
    }
}

class superC {
	superC(){}
	superC(int a){}
}

class childC extends superC{
	childC() { }
	childC(int a) { }
}
