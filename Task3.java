//Задача 3: Задайте произвольную строку. Выясните, является ли она палиндромом.

public class Task3 {
	public static void main(String[] args) {
		
		String text = "A1b!c!b1A";

		System.out.print("This text are palindrome: " + palindrome(text));
	}
	
	public static boolean palindrome(String text) {
			
		String inverseText = "";
		
		for(int i = text.length() - 1; i >= 0; i--) {
			inverseText += text.charAt(i);
		}
			
		if(text.equals(inverseText)) {
			return true;
		}else {
			return false;
		}
			
	}
}
