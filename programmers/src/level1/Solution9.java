package level1;


/*
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수 
 */
public class Solution9 {
	/*
	 2점 
	 */
	  public int solution(int n) {
		  
	        int answer = 0;
	        String sn = String.valueOf(n);
	        
	        for (int i = 0; i < sn.length(); i++) {
				answer += Character.getNumericValue(sn.charAt(i));
			}
	        System.out.println(answer);

	        return answer;
	  }
	       
		  /*
		  형변환 없이 단 세줄로 SSAP ABLE 
		  자괴감 SSAP 오짐 
		  효율성은 위의 코드랑 비슷하거나 좀 더 느림 
		  
	       while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
	        return answer;
	  }
	  */
}
