
public class Main {
	
public static void main(String[] args) {
		
		System.out.println(validateCard("1234567890123452"));
		System.out.println(validateCard("123456789012345"));
	}
	
	public static boolean validateCard(String number) {
		if (number.length() < 14 || number.length() > 19) {
			return false;
		}
		
		Integer checkNumber = Integer.parseInt(number.substring(number.length() - 1, number.length()));
		
		StringBuilder sb = new StringBuilder(number.substring(0, number.length() -1 ));
		sb.reverse();
		
		int sum = 0;
		
		for(int i=0; i < sb.length(); i++) {
			Character tempC = sb.charAt(i);
			Integer temp = Integer.parseInt(tempC.toString());
			
			if (i%2 == 0) {
				temp *= 2;
				if(temp/10>0) {
					temp = (temp % 10) + 1;
				}
			}
			sum += temp;
		}
		if((10 - sum % 10) == checkNumber) {
			return true;
		}
		else {
			return false;
		}
	}

	

}
