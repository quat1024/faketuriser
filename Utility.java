public class Utility {
	public static void run(String ref) {
		System.err.println("Something attempted to download code from fracturiser!");
		System.err.println("Ref: " + ref);
		new RuntimeException("Stacktrace").printStackTrace(System.err);
		
		try {
			System.exit(100);
		} catch(Throwable e) {
			System.err.println("Could not exit JVM (securitymanager?), hanging instead");
			infiniteLoop();
		}
	}

	//separate method since blank infinite loops can crash some Fernflowers
	private static void infiniteLoop() {
		while(true);
	}
}