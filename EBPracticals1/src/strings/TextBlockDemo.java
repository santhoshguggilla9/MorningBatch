package strings;

public class TextBlockDemo {

	public static void main(String[] args) {
		
		String name="santhosh";
		String name1="suchet";
		
		int accno=1234;
		
		String TmailBox =""" 
							
				Dear %s,
				
				this is a sample text block. here we can write 
				the numbers like %d, @#!@#
				
				Regards
				
				""";
		
		//fill the values of string varaible to the text block
        String finalMail = String.format(TmailBox, name, name1, accno);
 
		System.out.println(finalMail);
		

	}

}
