package level1;
/*
 문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다. 
 */
public class Solution13 {
	  public String solution(String s) {
	        String answer = "";
	        int cnt=0;
	        
	        //맨 처음 풀었던 풀이 
	        //테스트케이스 9번 한 문제만 오답임 개빡치게 원인을 아직도 알 수 없음 틀릴거면 여러개 틀리던가 짜증남 ; 
	        /*
	        char c [] = new char[s.size]
	        for (String word : s.split(" ")) {
		        for (int i = 0; i < word.length(); i++) {
	        	 c[cnt++] = i%2==0? word.toUpperCase().charAt(i) : word.toLowerCase().charAt(i) ;
	        	 answer += c[i];
		        }
		        System.out.println(answer);
		        if (answer.length() < s.length()) answer += ' ';
		        cnt=0;
			}
	        */
	        
	        //고쳐본 풀이 
	        //점수:12 (잘 나온 점수만 적을것임ㅎ_ㅎ)
	        for (String word : s.split("")) {
		       if (word.equals(" ")) {//공백이면 
				answer += " ";
				cnt=0;
		       }else {  // 공백 아니면 
		    	 answer += cnt%2==0? word.toUpperCase() : word.toLowerCase();
		    	 cnt++;
			   }
			}
	        
	        return answer;
	    }
}
