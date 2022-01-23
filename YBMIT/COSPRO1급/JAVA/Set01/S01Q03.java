package Set01;

class Q3 {
    public int solution(String pos) {
        //이동할 수 있는 칸 count
        int answer = 0;

        // 나이트의 좌표를 x,y라고 할때 이동가능한 좌표를 표시하면
        // (x-1,y+2), (x-2,y+1), (x-2,y-1), (x-1,y-2),
        // (x+1,y-2), (x+2,y-1), (x+2,y+1), (x+1,y+2)

        //나이트 위치 변환
        int x = pos.charAt(0)-'A';
        int y = pos.charAt(1)-'1';

        //x좌표와 y좌표의 이동값을 담아놓은 배열
        int[][] moved = {{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2}};

        for(int i=0;i<moved.length;i++){
            if(x+moved[i][0]>-1 && x+moved[i][0]<8 && y+moved[i][1]>-1 && y+moved[i][1]<8)
                answer++;
        }
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Q3 sol = new Q3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
