package level1;

import java.util.Arrays;

public class Solution2 {
	  public int[] solution(int[] arr, int divisor) {
		 /*
		 Stream 을 사용해서 푼 문제 
		 코드가 더욱 간결해졌지만 성능이 조금 떨어짐.  
		  */
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
 
	    }
}
