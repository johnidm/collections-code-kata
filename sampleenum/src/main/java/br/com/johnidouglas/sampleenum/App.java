package br.com.johnidouglas.sampleenum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	// basic sample
    	Colors cor = Colors.BLUE;
    	if (cor.equals( Colors.BLUE )) {
    		// print a name of enum
    		System.out.println(cor.name());
    	}
    	
    	
    	// using parameter
    	SO so = SO.LINUX;
    	System.out.println(so.description);
    	
    	
    	// usingin parameter and function get value 
    	Menu option = Menu.DELETE;
    	System.out.println( "Option menu = " + option.getOption());
    	
    	
    	// using more parameters 
     	Fruit fruit = Fruit.MELON;
     	System.out.println( "Fruit : code " + fruit.code + "  decription " + fruit.description + " update " + fruit.update );
    	
    	
     	// loop iteractor
     	for (SO soloop : SO.values()) {
     		System.out.println("My SO ----> " + soloop.description);
     	}
     	
     	// using function in option enum
     	Company google = Company.GOOGLE;
     	System.out.println(google.show());
     	
     	Company ebay = Company.EBAY;
     	System.out.println(ebay.show());
     	
     	Company paypal = Company.PAYPAL;
     	System.out.println(paypal.show());
     	
     	
     	// http://examples.javacodegeeks.com/java-basics/java-enumeration-example/
     	
    }
}
