package level1;
/*
 문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
 */
public class Solution17 {
	public int solution(int n) {
        int answer = 0;
        int [] era= new int[n+1];
 
/*첫번 째 풀이(효율성 테스트 통과 못함)
 *소수 판별하는 과정에서 시간이 오래걸리는 문제 
 * */        
 /*       
    int cnt =1; 
       while(n>0) {
   	   cnt =1;
           for (int i = 1; i < n; i++) {
           	if (n%i == 0) cnt++;
               if (cnt >2) {
					break;
				}
           	}
           if (cnt == 2 ) answer++;
           cnt =1;
           n--;
      }
*/        
        
        
        
/* 에라스토테네스의 체 풀이 참고 
 * 제곱근을 활용(Math.sqrt)하니까 실행속도 훨씬 빨라짐. 
 * */
        
       for (int i = 2; i <= n; i++) {
		    era[i] = i;
	    }
       //제곱근 구하기 
       int root = (int) Math.sqrt(n);
       
       
        for (int i = 2; i <=root; i++) {
			if (era[i]==0) continue;
			else {
				for (int j = 2*i; j <= n; j+=i)  // 배수 지우기 
				era[j] = 0;
			}
		}
        
        for (int i = 0; i < era.length; i++) {
        	if (era[i] != 0) answer++;
        }
		
        return answer;
    }
}
