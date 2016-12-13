
public class enumTest {
    public enum State {
        CONNECTING, CONNECTED, SUSPENDED, DISCONNECTING, DISCONNECTED, UNKNOWN
    }

    public static void main(String[] args) {
        int[] arry = { 1, 2, 3, 4, 5 };
        String test = null;

        State state = State.valueOf("CONNECTING");
        String s = state.name();
        System.out.println("test1 : " + s);

        s = null;

        boolean flag = false;
        for (int a : arry) {
            if (a == 3) {
                flag = true;
            }
            if (a == 3) {
                System.out.println("test");
                break;
            }
        }
        System.out.println("end: " + flag);

        state = null;

        TestFunc(state != null ? state.name() : state.UNKNOWN.toString());
        TestFunc(state != null ? state.name() : "UNKNOWN".toString());
    }

    public static void TestFunc(String test) {
        System.out.println("enter testFunc: " + test);
    }
}

