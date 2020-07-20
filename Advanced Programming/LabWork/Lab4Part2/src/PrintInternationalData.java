import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;


public class PrintInternationalData {

	public static void main(String[] args) {
		Locale locale;
		double milk = 1.02;
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			if(i==0){
				locale = new Locale("en","EN");
			}//end if
			else if(i==1){
				locale = new Locale("fr","FR");
			}//end else if
			else{
				locale = new Locale("de","DE");
			}//end else
			
			//days of week
			DateFormatSymbols dfs = new DateFormatSymbols(locale);
			String dayNames[] = dfs.getWeekdays();
			for (int j=0; j<7; j++){
				System.out.println(dayNames[j+1]);
			}//end for loop
			
			//date
			DateFormat dateF = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
			Date today = new Date();
			String DateO = dateF.format(today);
			System.out.println("\n" + DateO + "\n");
			
			//currency
			NumberFormat curForm = NumberFormat.getCurrencyInstance(locale);
			System.out.println(curForm.format(milk) + "\n");
		}//end for
	}//end main method

}//end class
