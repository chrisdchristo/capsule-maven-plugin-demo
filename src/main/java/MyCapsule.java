import java.nio.file.Path;

/**
 * A custom capsule example
 */
public class MyCapsule extends Capsule {

	protected MyCapsule(Capsule pred) {
		super(pred);
		System.out.println("My Custom Capsule class (pred)");
	}

}
