package programmers_Lv2;

public class JadenCase {

	public static void main(String[] args) {
		//case 1
		System.out.println(solution("3people unFollowed me"));
		//case 2
		System.out.println(solution("for the last week"));
	}
	public static String solution(String s) {
        String answer = "";
        
        //모든 문자 소문자로 변경 후 분리
        String[] spaced = s.toLowerCase().split(" ");
 
        for (int i = 0; i < spaced.length; i++) {
            //기본 띄어쓰기 적용
            if(i!=0) answer += " ";
            //띄어쓰기별 각 단어 temp
            String temp = spaced[i];
            //연속된 공백일경우
            if ("".equals(temp)) { 
                answer += temp;
            } 
            //첫문자가 영대소문자일 경우 규칙적용
            else if(spaced[i].charAt(0)>='A'&&spaced[i].charAt(0)<='z'){
                answer += Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
            } 
            //첫문자가 영대소문자가 아닌 경우(숫자)
            else {
                answer += temp;
            }
        }
        //마지막 문자가 공백일경우
        if (" ".equals(s.substring(s.length()-1))) 
            answer += " ";
 
        return answer;
    }

}
