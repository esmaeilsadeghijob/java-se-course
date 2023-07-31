import java.util.Scanner;

public class CharExp {
	
	public static void main(String[] args){
		
		char ch = 'H'; // 1byte -128 to 127
		//System.out.print(ch);
		
		char[] chs = {'H','E', 'L', 'L','O'};
		// \
		
		//String chsS = "HLL\\";
		String chsS = new String(chs);
		//System.out.print(chsS);
		//System.out.print(ch.isLetter());
		//System.out.print(ch.isDigit();
		//System.out.print(ch.isWhiteSpace();
		//System.out.print(ch.isUpperCase();
		//System.out.print(ch.isLowerCase();

			String password = "1qazXSW@";

			Scanner input = new Scanner(System.in);
			System.out.print("Enter your Password: ");
			String inPass = input.next();
			
			System.out.print(inPass.charAt(0));
			
			if(inPass.length() == 8){
				if(inPass.equals(password)){
					System.out.print("WellCome");
				} else {
					System.out.print("Password Error ... ");
				}
			}
			
			System.out.print(" ... ");

			
		
	}
	
	
}