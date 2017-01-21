
public class linkdedReverse<T> {

	T element;
	linkdedReverse<T> next;

	public linkdedReverse(T element, linkdedReverse<T> next) {
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public linkdedReverse<T> getNext() {
		return next;
	}

	public static <T> linkdedReverse<T> reverse(final linkdedReverse<T> origin) {

		if (origin == null) {
			throw new NullPointerException("reverse text is null");
		}

		if (origin.getNext() == null) {
			return origin;
		}

		final linkdedReverse<T> next = origin.next;
		System.out.println("next: " + next.getElement());
		origin.next = null;

		final linkdedReverse<T> otherReversed = reverse(next);
		System.out.println("otherReversed: " + otherReversed.getElement());
		next.next = origin;

		return otherReversed;
	}
    
    public static void main(String[] args){
        linkdedReverse<String> three = new linkdedReverse("3",null);
        linkdedReverse<String> two = new linkdedReverse("2",three);
        linkdedReverse<String> one = new linkdedReverse("1",two);
    
        linkdedReverse<String> reversed = linkdedReverse.reverse(one);
        
        System.out.println("3: " + reversed.getElement());
        System.out.println("2: " + reversed.getNext().getElement());
        System.out.println("1: " + reversed.getNext().getNext().getElement());
        
    }
}

