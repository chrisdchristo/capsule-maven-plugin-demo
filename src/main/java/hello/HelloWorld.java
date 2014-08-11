package hello;
import com.google.common.collect.ImmutableList;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		System.out.println("System-Properties:");
		System.out.println("\t\\--propertyName1=" + System.getProperty("propertyName1"));

		// guava library class
		final ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

	}
}
