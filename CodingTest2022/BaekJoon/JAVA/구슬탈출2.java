class Coordinate {
    public int x;
    public int y;
    Coordinate(){
        x = 0;
        y = 0;
    }
    public void setPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class MyClass {
    public static void main(String args[]) {
      int N = 5; //세로길이
      int M = 5; //가로길이
      String str = "######..B##.#.##RO.######";

      System.out.println(solution(N,M,str));
    }
    public static int solution(int N,int M,String str){
        char[][] map = new char[N][M];
        int index = 0;
        Coordinate O = new Coordinate();
        Coordinate R = new Coordinate();
        Coordinate B = new Coordinate();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                char element = str.charAt(index++);
                map[i][j] = element;
                if(element == 'O') O.setPoint(i,j);
                if(element == 'R') R.setPoint(i,j);
                if(element == 'B') B.setPoint(i,j);
            }
        }
        checkMap(N,M,map);
        System.out.println(O.x+" "+O.y);
        System.out.println(R.x+" "+R.y);
        System.out.println(B.x+" "+B.y);
        
        
        return 2;
    }
    public static void checkMap(int N,int M,char[][] map){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }
}