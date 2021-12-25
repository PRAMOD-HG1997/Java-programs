package STRINGS;

public class ReveseSentence {
	public static void main(String[] args) {
		//Input="Hi this is Pramod
		//Output=domarP si siht iH 
		String s= "Hi this is Pramod";
		String[] strarray = s.split(" ");
		for(int i=strarray.length-1;i>=0;i--){
			String revstr = strarray[i];
			for(int j=revstr.length()-1;j>=0;j--){
				System.out.print(revstr.charAt(j));
			}
			System.out.print(" ");
		}
				
	}

}