package introductoryProblems;

import java.io.*;
import java.util.StringTokenizer;

public class IncreasingArray {
  
  public static void main(String[] args) {
    
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);
    
    int t = sc.nextInt();
    long[] a = new long[t];
    long result = 0;
  
    for (int i = 0; i < t; i++) a[i] = sc.nextLong();
  
    for (int i = 1; i < t; i++) {
      if (a[i] < a[i - 1]) {
        result += a[i - 1] - a[i];
        a[i] = a[i - 1];
      }
    }
    
    pw.print(result);
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
    }
}
