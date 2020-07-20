package cypher;

public class Decoder {

	public static void main(String[] args) {
		
	}
	
	public Decoder(){
		String input ="password";
		String code = new String(Encoder.Encode(input));
		input = Decode(code);
		
	}
	
	public static String Decode(String a){
		if(a.matches("word")){
			a="password";
		}
		return a;
	}

}
