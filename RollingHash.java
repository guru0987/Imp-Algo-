import java.io.*;
import java.util.*;
import inheritance.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
    }

	private static long hash31(String s) {
		long mod = (long) 1e9 + 7;
		long p = 1;
		long hash = 0;
		for(int i=0;i<s.length();i++) {
			hash = ((hash+(s.charAt(i)-'a' + 1)*p)%mod)%mod;
			p = (p*31)%mod;
		}
		return hash;
	}
	
	private static long hash41(String s) {
		long mod = (long) 1e9 + 7;
		long p = 1;
		long hash = 0;
		for(int i=0;i<s.length();i++) {
			hash = ((hash+(s.charAt(i)-'a' + 1)*p)%mod)%mod;
			p = (p*41)%mod;
		}
		return hash;
	}
}
