package Algorithm;

// DATE : 2024.03.30
// WRITER : 구예원
// CONTENT : 자료구조 과제 : 미로 모든 경로 찾기
// 조건 : 재귀함수 이용, 1,000,000 넘으면 1,000,000 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPathinMIRO {

    static int pathCount;
    static int[][] miro;
    static int n, m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exe = Integer.parseInt(br.readLine());

        for(int test=0; test<exe; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            //미로 초기화 및 저장
            miro = new int[n+1][m+1];
            for(int i=1; i<=n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=1; j<=m; j++){
                    miro[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //경로 수 초기화
            pathCount = 0;
            findPaths(1,1);
            if(pathCount>1000000) {
                System.out.println(1000000);
            }else{
                System.out.println(pathCount);
            }


        }




    }
    static void findPaths(int x, int y){

        if(x==n && y==m) {
            pathCount++;
            return;
        }
        if(miro[x][y]==1){
            if(x<n) findPaths(x+1,y);
            if(y<m) findPaths(x,y+1);
        }

    }

}
