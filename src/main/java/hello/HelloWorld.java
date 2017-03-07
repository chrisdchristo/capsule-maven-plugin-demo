package hello;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		System.out.println("System-Properties:");
		System.out.println("\t\\--propertyName1=" + System.getProperty("propertyName1"));
		System.out.println("\t\\--propertyName2=" + System.getProperty("propertyName2"));
//		final ImmutableCollection col = ImmutableList.of("hello","hello1"); // using guava lib
	}


}
