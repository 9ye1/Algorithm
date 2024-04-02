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

    static int pathCount;  //경로의 수 :: 출력할 값
    static int[][] miro;   //미로
    static int n, m;       //입력받을 미로의 크기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exe = Integer.parseInt(br.readLine());

        for (int test = 0; test < exe; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            //미로 초기화 및 저장
            miro = new int[n + 1][m + 1]; //0번 줄, 0번 칸 사용 x
            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= m; j++) {
                    miro[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            pathCount = 0;  //경로 수 초기화
            findPaths(1, 1);  //경로 찾기 시작! - (1,1)부터
            if (pathCount > 1000000) {
                System.out.println(1000000);
            } else {
                System.out.println(pathCount);
            }
        }

    }

    //재귀함수 findPaths 구현 - x,y값 각각 1씩 늘려가면서 path 탐색
    static void findPaths(int x, int y){

        if(x==n && y==m) { //목적지 도달하면 count+1
            pathCount++;
            return;
        }
        if(miro[x][y]==1){
            if(x<n) findPaths(x+1,y);
            if(y<m) findPaths(x,y+1);
        }

    }

}
