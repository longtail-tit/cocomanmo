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
	

/*
문제점) 
for문 3개나 쓸 필요가 없음. 
arraylist에 담아서 지우는것보다 처음부터 배열에서 걸러서 담는게 더 효율적임.


arralyst변수에 첫번째 값을 넣어두고난 뒤에 배열에서 비교하고 값을 넣어준다. 

++ 첫번째 값을 넣어주는것 보다 temp에 10을 할당하고 그걸로 비교하는게 더 효율성 좋음(왜냐면 두자리수는 못들어가니까..!!!)

  
  
 지현))))
public static int[] solution(int []arr) {
        int[] answer = {};
        int len = arr.length;
        ArrayList<Integer> myA = new ArrayList<>();

        myA.add(arr[0]);
        
        for(int i=0; i<len-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		myA.add(arr[i+1]);
        	}
        }
        
        answer = new int[myA.size()];
        int size=0;
        for(Integer temp : myA){
        	answer[size++] = temp;
        }
      
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     
        return answer;
	} 
	
	
	
	
 another 답안 ) 
 public static int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        int temp = 10;
        for(int num : arr){
            if(temp!=num)
                arrList.add(num);
            temp = num;
        }
        
        answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
       	} 
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
