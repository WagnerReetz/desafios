package euler.problems.here;

import java.math.BigInteger;
import java.util.List;
import euler.problems.Problem;

public class P001 implements Problem {
	public BigInteger total = null;
	
	public static String addBigValue(String num1, String num2) {			
		return new BigInteger(num1).add(new BigInteger(num2)).toString();
	}
	
	@Override
	public String solve(List<String> input) {
		BigInteger bigTres = new BigInteger("3");
		BigInteger bigCinco = new BigInteger("5");
		BigInteger bigZero = new BigInteger("0");
		total = new BigInteger("0");
		
		input.stream().filter(value -> (new BigInteger(value).mod(bigTres)).equals(bigZero) || (new BigInteger(value).mod(bigCinco)).equals(bigZero))				                        																			  
										  .reduce(P001::addBigValue)										 
										  .ifPresent(i -> {
											  total = total.add(new BigInteger(i));
										  });
										    				
		return String.valueOf(total);
	}
}
