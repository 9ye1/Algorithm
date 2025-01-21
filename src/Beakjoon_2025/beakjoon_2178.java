package Beakjoon_2025;

// DATE : 2025.01.21
// WRITER : 구예원
// CONTENT : 미로 찾기 - bfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_2178 {

    static int[][] miro;
    static int[][] distance;
    static int min;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        miro = new int[n][m];
        distance = new int[n][m];
        min = n*m;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                miro[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        distance[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0}); //**큐안에 배열(좌표값)

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();

            int i = cur[0];
            int j = cur[1];

            if (i - 1 >= 0) {  //상
                if (miro[i - 1][j] == 1 && distance[i - 1][j] == 0) {
                    distance[i - 1][j] = distance[i][j] + 1;
                    queue.add(new int[]{i - 1, j});
                }
            }

            if (i + 1 < n) {  //하
                if (miro[i + 1][j] == 1 && distance[i + 1][j] == 0) {
                    distance[i + 1][j] = distance[i][j] + 1;
                    queue.add(new int[]{i + 1, j});
                }

            }

            if (j - 1 >= 0) {  //좌
                if (miro[i][j - 1] == 1 && distance[i][j - 1] == 0) {
                    distance[i][j - 1] = distance[i][j] + 1;
                    queue.add(new int[]{i, j - 1});
                }
            }

            if (j + 1 < m) {  //우
                if (miro[i][j + 1] == 1 && distance[i][j + 1] == 0) {
                    distance[i][j + 1] = distance[i][j] + 1;
                    queue.add(new int[]{i, j + 1});
                }
            }


        }


        System.out.println(distance[n-1][m-1]);

    }

}
