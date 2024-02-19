import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //HashMap
        HashSet<String> hashSet = new HashSet<>();
        for( String value : phone_book ) {
			hashSet.add(value);
		}
        //각 전화번호 확인
        for (int i = 0; i < phone_book.length; i++) {
            //기준 전화번호
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(hashSet.contains(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
            
        
        
        return answer;
    }
}
