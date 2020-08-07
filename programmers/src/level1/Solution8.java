package level1;

import java.util.ArrayList;

/*
 문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요. 
 */
public class Solution8 {
/*
 점수 : 8
 
 답안과 비교할 수 = 문제 답안의 인덱스를 각 배열 사이즈로 나누어 떨어지는 수 
 Arraylist 안쓰고싶었으나 딱히 오름차순으로 정렬할 뚜렷한 아이디어가 떠오르지 않아서 만능키 써버림 ..ㅋ 
 */	
	  public int[] solution(int[] answers) {
		  

		  int[] answer = {};
	        int [] sp1 = {1, 2, 3, 4, 5};//
	        int [] sp2 = {2, 1, 2, 3, 2, 4, 2, 5};//
	        int [] sp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};//
	 
	       int	cnt1=0, 
	        	cnt2=0, 
	        	cnt3=0; 
	      

	        for (int i = 0; i < answers.length; i++) {
	        	//
	        	if (sp1[i%sp1.length]==answers[i]) {
	        		cnt1++;
				}
	        	//
	        	if (sp2[i%sp2.length]==answers[i]) {
	        		cnt2++;
	        	}
	        	//
	        	if (sp3[i%sp3.length]==answers[i]) {
	        		cnt3++;
	        	}
			}
	     
		
	        // 오름차순 정렬...
	     int num = Math.max( Math.max(cnt1, cnt2), cnt3);
	     ArrayList<Integer> arr = new ArrayList<>();
	     
	     
	     	if (num == cnt1) {
				arr.add(1);
			}
	     	if(num == cnt2) {
				arr.add(2);
			}
	     	if (num == cnt3) {
				arr.add(3);
			}
	     
	     	answer = new int [arr.size()];
	     	for (int i = 0; i < arr.size(); i++) {
				answer[i]=arr.get(i);
			}
	        return answer;
	    }

}
