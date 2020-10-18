package level1;

import java.util.Arrays;

/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class Solution22 {
	public String solution(String s) {
		String answer = "";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for (int i = c.length - 1; i >= 0; i--) answer += c[i];
		return answer;
	}
}
