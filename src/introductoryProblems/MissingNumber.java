package introductoryProblems;

import java.io.*;
import java.util.StringTokenizer;

public class MissingNumber {
  
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);
    
    long n = sc.nextLong();
    long a = 0, b = 0;
  
  
    for (int i = 0; i < n; i++) a += (i + 1);
    for (int i = 0; i < n - 1; i++) b += sc.nextLong();
    
    pw.println(a - b);
    pw.close();
  }
  
  static class FastReader {
      BufferedReader br;
      StringTokenizer st;
  
      public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
      }
  
      String next() {
        while (st == null || !st.hasMoreElements()) {
          try {
            st = new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        return st.nextToken();
      }
  
      int nextInt() {
        return Integer.parseInt(next());
      }
  
      Long nextLong() {
        return Long.parseLong(next());
      }
  
      double nextDouble() {
        return Double.parseDouble(next());
      }
  
      String nextLine() {
        String str = "";
        try {
          str = br.readLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return str;
      }
    }
}
