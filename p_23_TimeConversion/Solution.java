package p_23_TimeConversion;
/*
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * */
class Result {
	public static String timeConversion(String s) {
		String time = "";
		if((s.contains("AM") && !s.substring(0,2).contains("12") )||
				(s.contains("PM") && s.substring(0,2).contains("12"))) 
			return s.substring(0,s.length()-2);
		
		else {
			int num=Integer.parseInt(s.substring(0,2));
			//System.out.println(num);
			num=num+12; 
			if(num==24) return "00"+s.substring(2,s.length()-2);
			time=num+""+s.substring(2,s.length()-2);
		}
		return time;
	}

}

public class Solution {
	public static void main(String[] args) {
		String s="12:05:45PM";
		String time=Result.timeConversion(s);
		System.out.println(time);

	}
}
