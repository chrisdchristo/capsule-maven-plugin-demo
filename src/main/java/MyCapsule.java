import java.nio.file.Path;

/**
 * A custom capsule example
 */
public class MyCapsule extends Capsule {

	public MyCapsule(Path jarFile, Path cacheDir) {
		super(jarFile, cacheDir);
		System.out.println("My Custom Capsule class");
	}

}
