import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_3230 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //1차 경기 - 총 n명의 선수
        //배열의 인덱스는 등수를 의미
        //등수랑 인덱스랑 같게 하기 위해 0번째 인덱스는 안쓰고 배열의 크기 1+
        int[] rank1 = new int[n+1];

        //현재 선수의 등수를 담을 변수
        int per_rank = 0;

        for(int i =1; i<=n; i++){ //여기서 i는 선수 번호
            per_rank = Integer.parseInt(br.readLine());
            if(rank1[per_rank]!=0){ //배열의 기본값은 0
                for(int j = i; j>per_rank; j--){
                    rank1[j] = rank1[j-1]; // i선수 등수부터 n등까지 뒤로 미루기
                }
            }
            rank1[per_rank] = i;
        }


        //2차 경기 : 총 m명 선수 (1~m등까지)

        //rank1과 동일 : 인덱스는 등수, 담길 값은 선수번호
        int[] rank2 = new int[m+1];
        int m2 = m;  //for문에서 m을 써야해서 저장
        for(int i=1; i<=m2; i++,m--) {  //rank1[m]은 i번째 경기의 선수번호
            per_rank = Integer.parseInt(br.readLine());
            if (rank2[per_rank] != 0) {
                for (int j = i; j > per_rank; j--) {
                    rank2[j] = rank2[j - 1];
                }
            }
            rank2[per_rank] = rank1[m];
        }

        System.out.println(rank2[1]+"\n"+rank2[2]+"\n"+rank2[3]);

    }
}
