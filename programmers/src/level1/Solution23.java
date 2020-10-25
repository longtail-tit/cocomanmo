package level1;
/*
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.

입출력 예
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8] 


 */
public class Solution23 {
    public long[] solution(int x, int n) {
        long[] answer  = new long[n];
        long a = Long.valueOf(x);
        for (int i = 0; i < n; i++) 
        	answer[i] = a*(i+1);
/*
 
문제에서 -10,000,000 <= x <= 10,000,000 이고,

int형 변수의 범위는 -2,147,483,648 ~ 2,147,483,647 이다.

따라서 가령,

x = 10,000,000, n = 1,000 이라면

x * (i + 1) = 10,000,000 * 1,000 = 10,000,000,000 와 같이 int형 범위를 초과하게 된다.

아래와 같이 long 타입으로 변환시켜 주어야 한다.

출처 : https://thiago6.tistory.com/111
 */      
        return answer;
    }
}
