package STRINGS;

public class InsertCharinBlank {
	//output=Hi%20this%20is%20Harish
	public static void main(String[] args) {
		String s = "Hi this is Pramod";
		StringBuilder replaced = new StringBuilder();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(Character.isWhitespace(arr[i])){
				replaced.append("%20");
			}else{
				replaced.append(arr[i]);
			}
		}
		System.out.println(replaced);
	}

}