package level1;
/*
 * 
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

	int [] arr = {5, 9, 7, 10};
		int divisor = 5;
				
*
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
	  public int[] solution(int[] arr, int divisor) {
		  
		  ArrayList<Integer> list = new ArrayList<>();
		  
		  
		  int cnt =0;
		  
	        for (int i = 0; i < arr.length; i++) {
				if (arr[i]%divisor == 0) {
					list.add(cnt,arr[i]);
					cnt++;
				}else {
					continue;
				}
			}
	        Collections.sort(list);
	      //  System.out.println(list.toString());
	        int size = list.size();
	        if (size == 0) {
				int answer [] = new int[1];
				answer[0] = -1;
				return answer;
			}else {
				int answer[] = new int[size];
				for (int i = 0; i < size; i++) {
					answer[i] = list.get(i);
				}
				return answer;
			}
	        
	      //  System.out.println(list.toString());
	       // return answer;
	    }
}
