package sample.code;

import java.time.LocalDate;
import java.time.Period;

public class Fatura {

	public boolean emAtraso(LocalDate vencimento, LocalDate pagamento) {		
		return pagamento.isAfter(vencimento);						
	}

	public Integer diasEmAtraso(LocalDate vencimento, LocalDate pagamento) {
			
		if (this.emAtraso(vencimento, pagamento)) {								
			return (int) Period.between(vencimento, pagamento).getDays();    		    	    		    
		    //return (int) ChronoUnit.DAYS.between(vencimento, pagamento);
		}	
		return 0;	
		
	}

}
