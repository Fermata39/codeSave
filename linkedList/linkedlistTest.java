
public class linkedlistTest {

    int element;
    linkedlistTest next;

    public linkedlistTest() {

    }

    public linkedlistTest(int element, linkedlistTest next) {
        // TODO Auto-generated constructor stub
        this.element = element;
        this.next = next;
    }

    public int getElement() {
        return element;
    }

    public linkedlistTest getNext() {
        return next;
    }

    public static void main(String[] args) {

        linkedlistTest three = new linkedlistTest(3, null);
        linkedlistTest two = new linkedlistTest(2, three);
        linkedlistTest one = new linkedlistTest(1, two);

        linkedlistTest test = new linkedlistTest();

        test = one;
		// 같은 객체 type 이면 해당 주소 내용이 그대로 복사됨

        System.out.println("test: " + test.getElement());
        System.out.println("test: " + test.getNext().getElement());
        System.out.println("test: " + test.getNext().getNext().getElement());
    }
}
