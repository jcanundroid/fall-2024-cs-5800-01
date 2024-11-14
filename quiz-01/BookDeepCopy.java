import java.lang.Cloneable;
import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy implements Cloneable
{
	private String title;
	private String author;
	private List<String> chapters;

	public BookDeepCopy(String title, String author, List<String> chapters) {
		this.title = title;
		this.author = author;
		this.chapters = chapters;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public List<String> getChapters() {
		return this.chapters;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setChapters(List<String> chapters) {
		this.chapters = chapters;
	}

	@Override
	public BookDeepCopy clone() {
		ArrayList<String> chapters = new ArrayList<>();

		for (String chapter : this.chapters) {
			chapters.add(chapter);
		}

		return new BookDeepCopy(this.title, this.author, chapters);
	}

	@Override
	public String toString() {
		String result = "\"" + this.title + "\" by " + this.author + "\nChapters:\n";

		for (String chapter : this.chapters) {
			result += chapter + "\n";
		}

		return result;
	}
}
