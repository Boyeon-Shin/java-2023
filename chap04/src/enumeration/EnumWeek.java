package enumeration;

import java.util.Calendar;

public class EnumWeek {
//	public enum Week { SUNDAY, MONDAY, WEDNESDAY, TUESDAY,THURSDAY, FRIDAY, SATURDAY}
	public static void main(String[] args) {
		// Week today = null;
//		Week today = Week.TUESDAY;
//		System.out.println(today);
//		
//		System.out.println(today.ordinal());
//		
//		String name = today.name();
//		System.out.println(name);
		
		Week today = null; 
		
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1: today = Week.SUNDAY; break; 
		case 2: today = Week.MONDAY; break; 
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; 
		case 5: today = Week.THURSDAY; break; 
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		System.out.println(today);
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 영화를 봅니다");
		} else {
			System.out.println("휴식을 취합니다");
		}
	}

}
