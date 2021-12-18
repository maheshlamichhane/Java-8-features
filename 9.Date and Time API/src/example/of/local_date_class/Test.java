package example.of.local_date_class;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate anyTime = LocalDate.of(1994, 11, 9);
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		
		System.out.println("Current Date="+now);
		System.out.printf("Customized Date = %d/%d/%d",year,month,day);
		

	}

}
