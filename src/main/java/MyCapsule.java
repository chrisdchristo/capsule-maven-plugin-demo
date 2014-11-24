import java.nio.file.Path;

/**
 * A custom capsule example
 */
public class MyCapsule extends Capsule {

	protected MyCapsule(Path jarFile, Path cacheDir) {
		super(jarFile, cacheDir);
		System.out.println("My Custom Capsule class (normal)");
	}
	protected MyCapsule(Capsule pred) {
		super(pred);
		System.out.println("My Custom Capsule class (pred)");
	}

}
