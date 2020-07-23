package level1;

import java.util.ArrayList;

public class Solution {
// 문제) 같은 숫자는 싫어 
	
/*
정확성 테스트 통과 
효율성 테스트 불통과 

채점 결과
정확성: 71.9
효율성: 0.0
합계: 71.9 / 100.0
ㅋㅋㅋ..얼탱이가없네; 
*/
	
public  int[] solution(int []arr) {
	    int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();
		 
	for (int i = 0; i < arr.length; i++) {
		list.add(arr[i]);
	}
	for (int i = 1; i < arr.length; i++) {
		if (arr[i-1]== arr[i]) {
			list.remove(cnt);
		}else {
			cnt++;
			continue;
		}
	}
		int[] answer = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }

}
