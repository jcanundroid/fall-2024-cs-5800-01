import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		ArrayList<String> shallowBookChapters = new ArrayList<>();
		ArrayList<String> deepBookChapters = new ArrayList<>();

		shallowBookChapters.add("Shallow Introduction");
		shallowBookChapters.add("Shallow Middle");
		shallowBookChapters.add("Shallow Ending");

		deepBookChapters.add("Deep Prologue");
		deepBookChapters.add("Deep Core");
		deepBookChapters.add("Deep Epilogue");

		BookShallowCopy shallowBook = new BookShallowCopy("Shallow Title", "Alice", shallowBookChapters);
		BookDeepCopy deepBook = new BookDeepCopy("Deep Name", "Bob", deepBookChapters);

		BookShallowCopy shallowBookClone = shallowBook.clone();
		BookDeepCopy deepBookClone = deepBook.clone();

		shallowBookClone.getChapters().add("Shallow Appendix");
		deepBookClone.getChapters().add("Deep Appendix");

		System.out.println("Original shallow book:\n");
		System.out.println(shallowBook);

		System.out.println("Cloned shallow book:\n");
		System.out.println(shallowBookClone);

		System.out.println("Original deep book:\n");
		System.out.println(deepBook);

		System.out.println("Cloned deep book:\n");
		System.out.println(deepBookClone);
	}
}
