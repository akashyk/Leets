package medium;

import java.util.HashMap;
import java.util.Map;

public class FractionToString {
	
	public void demo() {
		System.out.println("\n========= FractionToString =========");
		System.out.println(fractionToDecimal(22, 7));
	}
	
	  public String fractionToDecimal(int numerator, int denominator) {
	  
		  StringBuilder sb = new StringBuilder();
		  
		  Long num = Math.abs((long)numerator);
		  Long den = Math.abs((long)denominator);
		  
		  String sign = 
				  (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
		  
		  sb.append(sign);
		  
		  Long remainder = (num % den);
		  sb.append(numerator/denominator);
		  
		  if(remainder == 0) {
			  return sb.toString();
		  }
		  
		  sb.append(".");
		  
		  Map<Long, Integer> map = new HashMap<>();
		  
		  
		  while(!map.containsKey(remainder)) {
			  map.put(remainder, sb.length());
			  sb.append((remainder * 10) / denominator);
			  remainder  = (remainder * 10) % denominator;
		  }
		  
		  int index = map.get(remainder);
		    sb.insert(index, "(");
		    sb.append(")");
		    return sb.toString().replace("(0)", "");
	  }

}
