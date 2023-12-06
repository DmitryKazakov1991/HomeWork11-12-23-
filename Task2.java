import static java.lang.System.out;

//Задача 2: Задайте строку, содержащую латинские буквы в обоих регистрах. 
//Сформируйте строку, в которой все заглавные буквы заменены на строчные.

public class Task2 {
	public static void main(String[] args) {
		
		String text = "I Love Java!";
		text = doLowercase(text);
		out.print(text);
	}
	
	public static String doLowercase(String text) {
		
		char[] array = new char[text.length()];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = text.charAt(i);
		}
		
		for(int i = 0; i < array.length; i++) {//идем по char[] array
			for(char big = 'A', small = 'a'; big <= 'Z'; big++, small++) {// идем по алфавиту	
				
				if(array[i] == big) {
					array[i] = small;
				}
			}
		}
		
		String result = CharArrayToString(array);
		
		return result;
	}
	
    public static String CharArrayToString(char[] text) {
    	
    	String result = "";
    	
    	for (int i = 0; i < text.length; i++) {
    		result += text[i];
    	}

    	return result;
    }
}
