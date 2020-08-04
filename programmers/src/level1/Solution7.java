package level1;

import java.util.Arrays;

public class Solution7 {
/*
  문제)
 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.


*/
/*
 * 채점결과 : 7점 	
 */
	   public String[] solution(String[] strings, int n) {
		   
	       String[] answer = new String[strings.length];
	        
	       for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].substring(n,n+1)+strings[i];
			//System.out.println(strings[i]);
		   }
	       
	       Arrays.sort(strings);
	       
	       for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].substring(1);
			answer[i] = strings[i];
	     	}
	       
	      // System.out.println(Arrays.toString(answer));
	      
	        return answer;
	    }
}

/*
 * 
 * 접근방식은 비슷하지만 아래는 charAt[n]으로 문자앞에 붙여서 collections.sort를 사용하여 정렬. 
 * Collection.sort 는 Arrays.sort를 사용하니 상관은 없을듯 
 * 
  public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
 */







