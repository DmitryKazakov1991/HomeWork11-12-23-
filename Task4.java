//Задача 4*(не обязательная): Задайте строку, состоящую из слов, разделенных пробелами. 
//Сформировать строку, в которой слова расположены в обратном порядке. 
//В полученной строке слова должны быть также разделены пробелами.

public class Task4 {
	public static void main(String[] args) {
		
		String text = "It was an interesting challenge, but this is a bad decision.";
		
		int countOfSpace = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				countOfSpace++;
			}
		}
		int size = countOfSpace + 1;
		int[] array = new int[size];
		
		for(int i = 0, j = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				array[j] = i;
				j++;
			}
		}
		array[countOfSpace] = text.length() - 1;
		
		String newText = "";
		
		for(int i = text.length() - 1, k = size - 1; i >= 0; i--) { 
			if(text.charAt(i) == ' ' || i == 0) {
				for(int j = i; j <= array[k]; j++) { 
					newText += text.charAt(j);
				}
				k--;
			}
		}
		System.out.println(newText);
		
		String result = "";
		
		for(int i = 1; i < newText.length()-1; i++) { // похоже на костыль?
			if(newText.charAt(i) == newText.charAt(i+1) && newText.charAt(i) == ' ') {
				i++;
			}
			result += newText.charAt(i);
		}
		System.out.print(result);

	}
	
}
