
public class init {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Child ch = new Child();
    }

}

class Super {
    static {
        System.out.println("Super static block");
    }
    {
        System.out.println("Super instance block");
    }
    Super() {
        System.out.println("Super generator");
    }
}
class Child extends Super {
    static {
        System.out.println("Child static block");
    }
    {
        System.out.println("Child instance block");
    }
    Child() {
        this(500);
        System.out.println("Child generator");
    }
    Child(int i) {
        System.out.println("Child generator with parameter");
    }
}
