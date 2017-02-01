
public class innerTest {

    public static void main(String[] args) {

        ParentTest pt = new ParentTest();
        ChildTest ct = new ChildTest();

        System.out.println("result: " + pt.inner.varTest);
    }
}

class ParentTest {
    static int temp = 0;
    innerClass inner;

    public int var = 0;

    public ParentTest() {
        // TODO Auto-generated constructor stub
        inner = new innerClass();
        inner.varTest = 2;
    }

    public static synchronized int sample() {
        System.out.println("test");

        return temp;
    }

    public void sample2() {
        System.out.println("sample test");
    }

    public static class innerClass {
        public int varTest;
    }
}

class ChildTest extends ParentTest {

    public int var2 = 2;

    public void sample2() {
        System.out.println("sample test2");
    }
}
