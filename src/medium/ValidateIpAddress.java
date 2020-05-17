package medium;

public class ValidateIpAddress {
	public void demo() {

		System.out.println("\n========= ValidateIpAddress =========");
		String ip = "172.16.254.1";
		System.out.println(validateIpAddress(ip));
		
		ip = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
		System.out.println(validateIpAddress(ip));
	}
	
	String validateIpAddress(String ipAddress) {
		
		if(isValidIpv4(ipAddress)) {
			return "IPv4";
		} else if(isValidIpv6(ipAddress)) {
			return "IPv6";
		}
		
		return "Neither";
	}
	
	
	
	private boolean isValidIpv4(String ip) {
		
		if(ip.length() < 7) return false;
		
		if(ip.charAt(0) == '.' || ip.charAt(ip.length()-1) == '.') return false;
		
		String[] tokens = ip.split("\\.");
		if(tokens.length != 4) {
			return false;
		}
		
		for(String token : tokens) {
			if(!validateIpv4(token)) return false;
		}
		
		return true;
	}
	
	private boolean validateIpv4(String subIp) {
		
		if(subIp.startsWith("0") && subIp.length()>1) {
			return false;
		}
		
		try {
			int parsedInt = Integer.parseInt(subIp);
			if(parsedInt < 0 || parsedInt > 255) return false;
			if(parsedInt == 0 && subIp.charAt(0) != '0') return false;
		} catch(NumberFormatException nfEx) {
			return false;
		}
		
		return true;
	}

	private boolean isValidIpv6(String ip) {
		
		if(ip.length() < 15) return false;
		
		if(ip.charAt(0) == ':' || ip.charAt(ip.length()-1) == ':') return false;
		
		String[] tokens = ip.split(":");
		if(tokens.length != 8) {
			return false;
		}
		
		for(String token : tokens) {
			if(!validateIpv6(token)) return false;
		}
		
		return true;
	}	
	
	private boolean validateIpv6(String token) {
		
		if(token.length() > 4 || token.length() == 0) return false;
		
		char []arr = token.toCharArray();
		
		for(char c : arr) {
			int cc = (int)c;
			boolean isDigit = cc >= 48 && cc <= 57;
			boolean isUpperAlpha = cc >=65 && cc <= 70;
			boolean isLowerAlpha = cc >=97 && cc <= 102;
			if(! (isDigit || isUpperAlpha || isLowerAlpha)) {
				return false;
			}
		}
		
		return true;
		
	}
}
