package introductoryProblems;
import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
  
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);
    
    long n = sc.nextLong();
    
    while (n != 1) {
      if (n % 2 == 0) {
        pw.print(n + " ");
        n /= 2;
      } else {
        pw.print(n + " ");
        n *= 3;
        n += 1;
      }
    }
    
    pw.print(1);
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
