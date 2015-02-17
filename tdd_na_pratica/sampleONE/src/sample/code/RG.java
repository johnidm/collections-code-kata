package sample.code;

public class RG {

	public boolean isValidRG(String rg) {
		
		if ((rg == null) || (rg.length() != 11) || (rg.isEmpty()) || rg.charAt(8) != '-') {
			return false;
		}
		
		
		return java.util.regex.Pattern.matches("\\d{8}-\\d{2}", rg);		
				
	}
	
	

}
