import java.io.*;
import java.util.*;

public class Solution {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() { // reads in the next string
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());

        }

        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }

        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int in = r.nextInt();
        int temps = 2;
        int smallertemps = 1;
        if (in == 1) {
            pw.print(1);
        } else if (in < 4) {
            pw.print("NO SOLUTION");
        } else {
            while (temps <= in) {
                pw.print(temps + " ");
                temps += 2;
            }
            while (smallertemps <= in) {
                pw.print(smallertemps + " ");
                smallertemps += 2;
            }
        }
        pw.close(); // flushes the output once printing is done
    }
}
