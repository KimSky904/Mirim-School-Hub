class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int changedCount = 0;
        String number = s;
        
        while(!number.equals("1")){
            //변한 횟수
            changedCount++;
            String str = number.replaceAll("0","");
            zeroCount+=number.length() - str.length();
            number = Integer.toBinaryString(str.length()).toString();
        }
        
        answer[0] = changedCount;
        answer[1] = zeroCount;
        return answer;
    }
}
