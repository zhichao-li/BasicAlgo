// "I love you" to "you love I"
public class Reverse {
	public static void reverseString(char[] chars, int start, int end){
		if(start > end){
			throw new IllegalArgumentException("start should less then end");
		}
		while(start < end){
			char tmp = chars[start];
			chars[start] = chars[end];
			chars[end] = tmp;
			start++;
			end--;
		}
	}
	public static void reverseStrPerWord(char[] chars, int len){
		int i=0;
		int j=0;
		boolean preIsBlank = true;
		for(;j<len;j++){
			if(!preIsBlank && chars[j] == ' '){
					reverseString(chars, i, j-1);
				}
			} 
		    if(preIsBlank && chars[j] != ' '){
					i = j;
			}
			
			if(j+1 == len){
				reverseString(chars, i, j);
			}
			if(chars[j] == ' ')  preIsBlank=true; else preIsBlank=false;
   }

	public static void main(String[] args) {
		char[] chars = "I I am hiehie love student.".toCharArray();
		reverseString(chars, 0, chars.length - 1);
		reverseStrPerWord(chars, chars.length);
		System.out.print(chars);
	}
}
