
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class InvestigatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Field[] field = MysteryClass.class.getDeclaredFields();
		Method[] name = MysteryClass.class.getDeclaredMethods();
		for(int i=0;i<2;i++){
			System.out.println(field[i].getName());
			System.out.println(field[i].getGenericType());
		}
		System.out.println();
		for(int i=0;i<3;i++){
			System.out.println(name[i]);
			System.out.println(name[i].getReturnType());
			System.out.println(name[i].getClass().getTypeParameters());
		}
		
		Object obj = new MysteryClass();
		Method method = null;
		try {
			method = obj.getClass().getMethod(name[2].toString());
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			method.invoke(obj);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		java.lang.reflect.Method method;
		method = MysteryClass.class.getClass().getDeclaredMethod(MysteryClass.notEasyToGuessTheNameOfThisMethod(1), Parameter.class);
		method.invoke(name, field);*/
	}

}
