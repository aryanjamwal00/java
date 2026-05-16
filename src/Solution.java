import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Read number of test cases
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int c0 = 0;
            int c1 = 0;
            int c2 = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int w = Integer.parseInt(st.nextToken());
                if (w == 0) {
                    c0++;
                } else if (w == 1) {
                    c1++;
                } else if (w == 2) {
                    c2++;
                }
            }

            // 1. Every '0' can be removed by itself
            int operations = c0;

            // 2. Pair up as many (1, 2) combinations as possible
            int pairs = Math.min(c1, c2);
            operations += pairs;
            c1 -= pairs;
            c2 -= pairs;

            // 3. Form triplets with any remaining 1s or 2s
            operations += c1 / 3;
            operations += c2 / 3;

            sb.append(operations).append("\n");
        }

        System.out.print(sb);
    }
}