
public class PrintingPrimeNum {
	public static void main(String[] args) {
		int fistNum;
		int checkingLastNum = 100;
		boolean primeNum = true;
		String thisIsAPrimeNum = "";

		for (fistNum = 2; fistNum <= checkingLastNum; fistNum++) {
			primeNum = CheckPrime(fistNum);
			if (primeNum) {
				thisIsAPrimeNum = thisIsAPrimeNum + fistNum + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + checkingLastNum + " are:");
		System.out.println(thisIsAPrimeNum);
	}

	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int secondNum = 2; secondNum <= numberToCheck / 2; secondNum++) {
			remainder = numberToCheck % secondNum;
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}

}
