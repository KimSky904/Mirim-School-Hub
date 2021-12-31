import java.util.ArrayList;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        ArrayList<String> route = new ArrayList<>();
        //출발좌표, 이동좌표
        int sX = 0, sY = 0, aX = 0, aY = 0;
        for(int i=0;i<dirs.length();i++){
            //도착좌표 초기화
            aX = sX;
            aY = sY;
            //경로
            String path = "";
            
            if(dirs.charAt(i)=='U'){ //출발좌표 먼저
                aY++;
                path = sX+""+sY+""+aX+""+aY; 
            } else if(dirs.charAt(i)=='D'){ //도착좌표 먼저
                aY--;
                path = aX+""+aY+""+sX+""+sY;         
            } else if(dirs.charAt(i)=='L'){ //출발좌표 먼저
                aX++;
                path = sX+""+sY+""+aX+""+aY;           
            } else { //도착좌표 먼저
                aX--;
                path = aX+""+aY+""+sX+""+sY;    
            }
            //좌표 체크
            if(aX<-5||aX>5||aY<-5||aY>5) continue;
            //경로가 존재하는지 체크 후 저장
            if(!route.contains(path)){
                route.add(path);
            }
            //좌표 이동
            sX = aX;
            sY = aY;
        }
        answer = route.size();
        
        return answer;
    }
}
