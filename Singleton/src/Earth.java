
public class Earth {
	
		private volatile static Earth  object ;

		private Earth(){}

		public static Earth  getInstance(){
		if ( object == null ) { 		
			Synchronized( Earth.class)
			object = new Earth();
				}
			return object ;
		}

		public static void add() {}
		public static void display() {}
}
