package br.com.johnidouglas.sampleenum;

public enum Company {

	EBAY(12) {
		private String format() {
			return " e.b.a.y"; 
		}
				
		@Override
		public String show() {			
			return getCode() + " ebay " + format();
		}
	}, 
	
	PAYPAL(34) {
		
		private int count() {
			return 9;
		}
		
		@Override
		public String show() {
			
			return getCode() + " PayPal " + count();
		}
	} , 
	
	GOOGLE(78) {
		@Override
		public String show() {
			return getCode() + " Google ";
		}
	}, 
	
	YAHOO(98) {
		@Override
		public String show() {
			return getCode() + " yahoo ";
		}
	};

	
	private int code;
	
	Company(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	
	public abstract String show();

}
