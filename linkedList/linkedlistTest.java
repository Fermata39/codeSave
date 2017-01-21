
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

        System.out.println("test: " + test.getElement());
        System.out.println("test: " + test.getNext().getElement());
        System.out.println("test: " + test.getNext().getNext().getElement());
    }
}
