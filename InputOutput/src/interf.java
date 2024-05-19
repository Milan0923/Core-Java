@FunctionalInterface
public interface interf {
		
		public float m1(float a, float b);
		// functional Interface
		public static void m2() {
			// because it is going to use as a common method
			System.out.println("Proper logic to run");
		}
		
		public default void m3() {
			// this method is going to be override
			System.out.println("Some Dummy Code");
		}

	}


	// annotation is a keyword which is denoted by @ and provides some additional functionality
	// eg. @override @FunctionalInterface @ Deprecated: using of method which show strike on 

