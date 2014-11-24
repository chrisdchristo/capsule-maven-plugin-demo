import java.nio.file.Path;

/**
 * A custom capsule example
 */
public class MyCapsule2 extends Capsule {

	protected MyCapsule2(Path jarFile, Path cacheDir) {
		super(jarFile, cacheDir);
		System.out.println("My Custom Capsule2 class (normal)");
	}
	protected MyCapsule2(Capsule pred) {
		super(pred);
		System.out.println("My Custom Capsule2 class (pred)");
	}

}
