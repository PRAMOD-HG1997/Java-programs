package STRINGS;

public class StringObject {
	public static void main(String[] args) {
		String s1="Pramod";
		String s2=new String("Pramod");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
	}
}
