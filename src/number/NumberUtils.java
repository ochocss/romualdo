package number;

public final class NumberUtils {
	private NumberUtils() {}
	
	public static int countDigits(long num) {
		int digits = 0;
		
		while(num > 0) {
			num /= 10;
			digits++;
		}
		
		return digits;
	}
	
	public static long reverse(long num) {
		long reversed = 0L;
		
		while(num > 0L) {
			long rest = num % 10L;
			reversed = reversed*10L + rest;
			num /= 10L;
		}
		
		return reversed;
	}
	
	public static long sumDigits(long num) {
		long sum = 0;
		
		while(num > 0L) {
			sum += num % 10L;
			num /= 10L;
		}
		
		return sum;
	}
	
	public static boolean divBy2(long num) {
		return num % 2L == 0L;
	}
	
	public static boolean divBy3(long num) {
		while(num >= 10L) {
			num = sumDigits(num);
		}
			
		return num % 3L == 0L;
	}
	
	public static boolean divBy4(long num) {
		return num % 10L + (2L * (num % 100)/10) % 4 == 0;
	}
	
	public static boolean divBy5(long num) {		
		return (num % 10L) % 5L == 0;
	}
	
	public static boolean divBy6(long num) {
		return divBy2(num) && divBy3(num);
	}
	
	public static boolean divBy7(long num) {
		while(num >= 100L) {
			byte n = (byte) ((num % 10L) * 2L);
			num /= 10L;
			
			num -= n;
		}
		return num % 7L == 0L;
	}
	
	public static boolean divBy8(long num) {
		int n = (int) (num % 10L);
		num /= 10L;
		
		n += (num % 10L) * 2L;
		num /= 10L;
		
		n += (num % 10L) * 4L; 
		return n % 8L == 0L || n == 0L;
	}
	
	public static boolean divBy9(long num) {
		while(num >= 10L) {
			num = sumDigits(num);
		}
			
		return num % 9L == 0L;
	}
	
	public static boolean divBy10(long num) {
		return num % 10L == 0L;
	}
	
	public static byte countDiv(long num) {
		byte count = 0;
		
		count++; // by1
		
		if(divBy2(num)) count++;
		if(divBy3(num)) count++;
		if(divBy4(num)) count++;
		if(divBy5(num)) count++;
		if(divBy6(num)) count++;
		if(divBy7(num)) count++;
		if(divBy8(num)) count++;
		if(divBy9(num)) count++;
		if(divBy10(num)) count++;
		
		return count;
	}
	
	public static byte[] getDivList(long num) {
		byte[] divArray = new byte[countDiv(num)];
		byte i = 1;
		
		divArray[0] = 1;
		if(NumberUtils.divBy2(num)) { divArray[i] = (byte) 2; i++; }
		if(NumberUtils.divBy3(num)) { divArray[i] = (byte) 3; i++; }
		if(NumberUtils.divBy4(num)) { divArray[i] = (byte) 4; i++; }
		if(NumberUtils.divBy5(num)) { divArray[i] = (byte) 5; i++; }
		if(NumberUtils.divBy6(num)) { divArray[i] = (byte) 6; i++; }
		if(NumberUtils.divBy7(num)) { divArray[i] = (byte) 7; i++; }
		if(NumberUtils.divBy8(num)) { divArray[i] = (byte) 8; i++; }
		if(NumberUtils.divBy9(num)) { divArray[i] = (byte) 9; i++; }
		if(NumberUtils.divBy10(num)) { divArray[i] = (byte) 10; i++; }
		
		return divArray;
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

	// proximor...
}
