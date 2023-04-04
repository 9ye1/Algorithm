import java.util.Scanner;

public class sjCode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        int[] stk = new int[50];

        Scanner sc = new Scanner(System.in);
        int gh = sc.nextInt();
        String st;

        for (int i = 0; i < gh; i++) {
            st = sc.next();
            int length = st.length();

            for (int j = 0; j < length; j++) {
                char ch = st.charAt(j);

                if (ch == '(') {
                    stk[ptr] = 1;
                    ptr++;
                } else {
                    ptr--;
                }
            }
            if (ptr == 0) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }

            ptr = 0;
        }
        System.out.print(sb);

    }
}
