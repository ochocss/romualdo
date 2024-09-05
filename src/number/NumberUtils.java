package number;

import java.util.ArrayList;

public final class NumberUtils {
	private NumberUtils() {}
	
	public static long countDigits(long num) {
		int digits = 0;
		
		while(num > 0) {
			num /= 10;
			digits++;
		}
		
		return digits;
	}
	
	public static long reverse(long num) {
		long reversed = 0;
		
		while(num > 0) {
			long rest = num % 10;
			reversed = reversed*10 + rest;
			num /= 10;
		}
		
		return reversed;
	}
	
	public static long sumDigits(long num) {
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
	
	public static boolean divBy2(long num) {
		return (num % 10) % 2 == 0;
	}
	
	public static boolean divBy3(long num) {
		while(num >= 10) {
			num = sumDigits(num);
		}
			
		return num % 3 == 0;
	}
	
	public static boolean divBy4(long num) {
		long n = num % 10;
		num /= 10;
		n += (num % 10) * 2;
		
		if(n == 0 || n % 4 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean divBy5(long num) {
		byte n = (byte) (num % 10);
		
		return n == 5 || n == 0;
	}
	
	public static boolean divBy6(long num) {
		return divBy2(num) && divBy3(num);
	}
	
	public static boolean divBy7(long num) {
		while(num >= 100) {
			byte n = (byte) ((num % 10) * 2);
			num /= 10;
			
			num -= n;
		}
		return num % 7 == 0;
	}
	
	public static boolean divBy8(long num) {
		int n = (int) (num % 10);
		num /= 10;
		
		n += (num % 10) * 2;
		num /= 10;
		
		n += (num % 10) * 4; 
		return n % 8 == 0 || n == 0;
	}
	
	public static boolean divBy9(long num) {
		while(num >= 10) {
			num = sumDigits(num);
		}
			
		return num % 9 == 0;
	}
	
	public static boolean divBy10(long num) {
		return num % 10 == 0;
	}
	
	public static boolean checkCapicua(long num) {
		return num == reverse(num);
	}

	public static boolean checkPrime(long num) {
		for(int i = 2; i < (num/2); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
