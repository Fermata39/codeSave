public class recursiveTest{

    static int value=0;
    static int value2=10;

    static int i=0;
    public static void main(String[] args){
        recursiveFnc();
        System.out.println("-----------------------------");
        recursiveFnc2();
    }

    public static void recursiveFnc(){
        if(value < 10){
            value++;
            recursiveFnc();
            i++;
            System.out.println("value["+i+"]" + value);
        }
    }
    public static void recursiveFnc2(){
        if(value >0){
            value--;
            recursiveFnc2();
            i++;
            System.out.println("value2["+i+"]" + value);
        }
    }
}
