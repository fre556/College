package reflections;

public class ReflectionClass {

	public static void main(String[] args) {
		ReflectionClass reflection = new ReflectionClass();
		
		@SuppressWarnings("rawtypes")
		Class info = reflection.getClass();
		System.out.println(info);
		
		@SuppressWarnings("rawtypes")
		Class myobj = ReflectionClass.class;
		System.out.println(myobj);
		
		String className = "reflections.ReflectionClass";
		try {
			@SuppressWarnings("unused")
			Object reflection2 = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
