package introductoryProblems;

import java.io.*;

public class Repetitions {
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);
    
    String dna = sc.nextLine();
    int c = 0;
    int r = 1;
    char last = ' ';
    
    char[] d = dna.toCharArray();
  
    for (char current : d) {
      if (last == current) {
        c++;
        r = Math.max(r, c);
      } else {
        last = current;
        c = 1;
      }
    }
    
    pw.print(r);
    pw.close();
  }
  
  static class FastReader {
      BufferedReader br;
  
    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
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
