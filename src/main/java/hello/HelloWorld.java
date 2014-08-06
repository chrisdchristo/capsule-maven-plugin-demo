package hello;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		System.out.println("System-Properties:");
		System.out.println("\t\\--propertyName1=" + System.getProperty("propertyName1"));
	}
}
