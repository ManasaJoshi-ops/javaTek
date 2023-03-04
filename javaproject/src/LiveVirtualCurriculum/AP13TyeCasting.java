package LiveVirtualCurriculum;

public class AP13TyeCasting {
	public static void main(String[] args) {
		//Implicit type casting : Conversion of smaller size datatypes to larger
		int a=10;
		float b=20.0f;
		b=a;
		System.out.println(b);
		
		//Explicit typecasting: Conversion of larger datatypes to smaller ones
		
		int i=109;
		char ch=(char) i;
		System.out.println(ch);
	}

}
