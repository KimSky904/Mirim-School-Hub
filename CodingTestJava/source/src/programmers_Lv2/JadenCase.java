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
        
        //��� ���� �ҹ��ڷ� ���� �� �и�
        String[] spaced = s.toLowerCase().split(" ");
 
        for (int i = 0; i < spaced.length; i++) {
            //�⺻ ���� ����
            if(i!=0) answer += " ";
            //���⺰ �� �ܾ� temp
            String temp = spaced[i];
            //���ӵ� �����ϰ��
            if ("".equals(temp)) { 
                answer += temp;
            } 
            //ù���ڰ� ����ҹ����� ��� ��Ģ����
            else if(spaced[i].charAt(0)>='A'&&spaced[i].charAt(0)<='z'){
                answer += Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
            } 
            //ù���ڰ� ����ҹ��ڰ� �ƴ� ���(����)
            else {
                answer += temp;
            }
        }
        //������ ���ڰ� �����ϰ��
        if (" ".equals(s.substring(s.length()-1))) 
            answer += " ";
 
        return answer;
    }

}
