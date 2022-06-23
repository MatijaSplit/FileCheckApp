import java.util.*;
import java.io.*;

public class Filecheck {
	
	
	
	//checks the file for duplicates
	public static void main(String args[]) throws IOException{
		
		Map<String, String> pricesMap = new HashMap<String, String>();
		
		Scanner input=new Scanner(new File("gardenaprices_AT_DE.csv"));
		while(input.hasNextLine()) {
					
			String line=input.nextLine();
			//System.out.println(line);
			
			Scanner token=new Scanner(line);
			token.useDelimiter(";");
			String price=token.next();
			
			String pnc=token.next();
			//double price=token.nextDouble();
			
			if(pricesMap.containsKey(pnc)) {
				System.out.println("Duplicate found for "+pnc);
			} else {
				pricesMap.put(pnc,price);
			}
		}
		System.out.println("The size is "+pricesMap.size());
		
	}
	

}
