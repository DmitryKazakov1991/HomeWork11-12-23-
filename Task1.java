import static java.lang.System.out;
//Задача 1: Задайте двумерный массив символов (тип char 
//[,]). Создать строку из символов этого массива
public class Task1 {
	public static void main(String[] args) {
		
		char[][] matrix = {{'H','e','l','l','o'}, {'W','o','r','l','d'}};
		
		out.print(CharMatrixToString(matrix));
	}
	
    public static String CharMatrixToString(char[][] text) {
    	
    	String result = "";
    	
    	for (int i = 0; i < text.length; i++) {
    		for(int j = 0; j < text[0].length; j++) {
    			result += text[i][j];
    		}
    		result += " "; //никто не говорил, что в строке не должно быть пробелов =)
    	}

    	return result;
    }
}
