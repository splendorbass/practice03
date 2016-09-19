package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		char[] c = str.toCharArray();
		char temp = 0;
		int index = c.length - 1;
		
		for(int i = 0; i <= index ; i++){
			temp = c[i];
			c[i] = c[index];
			c[index] = temp;
			index--;
		}
	
		
		return c;
	}
	
	public static void printCharArray(char[] array){
		
//		for(char i : array){
//			System.out.print(array[i]);
//		}
		
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println("");
	}
}
