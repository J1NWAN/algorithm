
public class tabToSpace {
	public static void main(String[] args) {
		String text = "Hello\tWorld";
		System.out.println(text);
		System.out.println(change(text));
	}
	
	public static String change(String text) {
		text = text.replaceAll("\t", " ");
		return text;
	}
}
