package introductoryProblems;

import java.io.*;
import java.util.*;
import java.util.*;

public class Permutations {
  
  // solution herer
  public static void main(String[] args) throws Exception {
    PrintWriter pw = new PrintWriter(System.out);
    FastScanner sc = new FastScanner();
    int n = sc.nextInt();
    if (n < 4 && n != 1) pw.println("NO SOLUTION");
    else {
      long i = 1;
      long j = 2;
      StringBuilder sb = new StringBuilder();
      while (j <= n) {
        sb.append(j).append(" ");
        j += 2;
      }
      while (i <= n) {
        sb.append(i).append(" ");
        i += 2;
      }
      pw.println(sb);
    }
    
    pw.close();
  }
  
  static class FastScanner {
    private final int BS = 1 << 16;
    private final char NC = (char) 0;
    private final byte[] buf = new byte[BS];
    private int bId = 0, size = 0;
    private char c = NC;
    private double cnt = 1;
    private BufferedInputStream in;
    
    public FastScanner() {
      in = new BufferedInputStream(System.in, BS);
    }
    
    public FastScanner(String s) {
      try {
        in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
      } catch (Exception e) {
        in = new BufferedInputStream(System.in, BS);
      }
    }
    
    private char getChar() {
      while (bId == size) {
        try {
          size = in.read(buf);
        } catch (Exception e) {
          return NC;
        }
        if (size == -1) return NC;
        bId = 0;
      }
      return (char) buf[bId++];
    }
    
    public int nextInt() {
      return (int) nextLong();
    }
    
    public int[] nextInts(int N) {
      int[] res = new int[N];
      for (int i = 0; i < N; i++) {
        res[i] = (int) nextLong();
      }
      return res;
    }
    
    public long[] nextLongs(int N) {
      long[] res = new long[N];
      for (int i = 0; i < N; i++) {
        res[i] = nextLong();
      }
      return res;
    }
    
    public long nextLong() {
      cnt = 1;
      boolean neg = false;
      if (c == NC) c = getChar();
      for (; (c < '0' || c > '9'); c = getChar()) {
        if (c == '-') neg = true;
      }
      long res = 0;
      for (; c >= '0' && c <= '9'; c = getChar()) {
        res = (res << 3) + (res << 1) + c - '0';
        cnt *= 10;
      }
      return neg ? -res : res;
    }
    
    public double nextDouble() {
      double cur = nextLong();
      return c != '.' ? cur : cur + nextLong() / cnt;
    }
    
    public double[] nextDoubles(int N) {
      double[] res = new double[N];
      for (int i = 0; i < N; i++) {
        res[i] = nextDouble();
      }
      return res;
    }
    
    public String next() {
      StringBuilder res = new StringBuilder();
      while (c <= 32) c = getChar();
      while (c > 32) {
        res.append(c);
        c = getChar();
      }
      return res.toString();
    }
    
    public String nextLine() {
      StringBuilder res = new StringBuilder();
      while (c <= 32) c = getChar();
      while (c != '\n') {
        res.append(c);
        c = getChar();
      }
      return res.toString();
    }
    
    public boolean hasNext() {
      if (c > 32) return true;
      while (true) {
        c = getChar();
        if (c == NC) return false;
        else if (c > 32) return true;
      }
    }
  }
  
  public static int[] sort(int[] arr) {
    ArrayList<Integer> ls = new ArrayList<>();
    for (int x : arr)
      ls.add(x);
    Collections.sort(ls);
    for (int i = 0; i < arr.length; i++) arr[i] = ls.get(i);
    
    return arr;
  }
}