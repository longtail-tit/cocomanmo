package level1;

import java.util.Calendar;

public class solution6 {
	/*
	 문제 설명
2016년 1월 1일은 금요일입니다. 
2016년 a월 b일은 무슨 요일일까요?
 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	 * */
	 public String solution(int a, int b) {
		 /*
		  * 효율성 그지같음 
		  * 
		  * 
	        String answer = "";
	        int year = 2016;
	        
	        String [] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	       
	       Calendar cal = Calendar.getInstance();
	       
	       cal.set(year, a-1, b);
	       int yoil = cal.get(Calendar.DAY_OF_WEEK);
	       answer = days[yoil-1];
	       System.out.println(answer);
	       return answer;
	       */
		 
		 // 효율성 훨배 좋음 ㅋ 
		 String answer = "";
	      
	      String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
	                  //31   29  31  30  31 30  31   31 30  31  30  31
	      //             1   2    3    4  5  6   7   
	      int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      // 해당 월 전달까지 다 더하고 + 일수 
	       int daySum=0;
	       int resultD=0;
	       for(int i=0; i<a-1; i++) 
	       { 
	      //     System.out.println(i);
	           daySum += date[i];
	         
	          }
	       System.out.println("1~6월까지 더한 수 : "+daySum);
	       daySum += b-1;
	       resultD = daySum % 7;
	     //  System.out.println("요일은? "+ resultD);
	     //  System.out.println(day[resultD-1]);
	       answer = day[resultD];
	       System.out.println(answer);
	       return answer;
	    }
}
