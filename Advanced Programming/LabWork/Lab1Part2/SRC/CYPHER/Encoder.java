/**
 * 
 */
package cypher;

/**
 * @author Flash
 *
 */
public class Encoder {

	static String input = "password";
	public static void main(String[] args) {
		new Encoder();

	}
	

	public Encoder(){
		
		Encode(input);
	}
	
	public static String Encode(String a){
		if(a.matches("password")){
			a="word";
			
		}
		return a;
	}

}
