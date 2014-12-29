package br.com.johnidouglas.pratica;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		Customer johni = new Customer("Johni");
		Customer douglas = new Customer("Douglas");
		Customer marangon = new Customer("Marangon");
		Customer dani = new Customer("Dani");
		
		Product bach = new Product("Bach Completo", Paths.get(""), new BigDecimal(100)); 
		Product poderosas = new Product("Poderosas Anita", Paths.get(""), new BigDecimal(500)); 
		Product bandeira = new Product("Bandeira do Brasil", Paths.get(""), new BigDecimal(50)); 
		Product beauty = new Product("Beleza Americana", Paths.get(""), new BigDecimal(90)); 
		Product vingadores = new Product("Os Vingadores", Paths.get(""), new BigDecimal(150)); 
		Product amelie = new Product("Amele", Paths.get("Amelie Poulain"), new BigDecimal(200)); 
		
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime yesterday = today.minusDays(1);
		LocalDateTime lastMonth = today.minusMonths(1);
		
		Payment payment1 = new Payment(Arrays.asList(bach, poderosas), today, johni);
		Payment payment2 = new Payment(Arrays.asList(bach, bandeira, amelie), yesterday, douglas);
		Payment payment3 = new Payment(Arrays.asList(beauty, vingadores, bach), today, dani);
		Payment payment4 = new Payment(Arrays.asList(bach, poderosas, amelie),  lastMonth, marangon);
		Payment payment5 = new Payment(Arrays.asList(beauty, amelie), yesterday, johni);
		
		List<Payment> payments = Arrays.asList(payment1, payment2, payment3, payment4, payment5);
		
		System.out.println("Lista de pagamentos ==========================");
		payments.forEach(System.out::println);
		/*
		System.out.println("Ordenação por datas");
		payments.stream()
			.sorted(Comparator.comparing(Payment::getDate))
			.forEach(System.out::println);
		
		System.out.println("Total pagamento 1");
		*/
		/*
		payment1.getProducts().stream()
			.map(Product::getPrice)
			.reduce(BigDecimal::add)
			.ifPresent(System.out::println);
		*/
		/*
		BigDecimal total = 
				payment1.getProducts().stream()
					.map(Product::getPrice)
					.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(total);
		
		
		BigDecimal _total = 
				payments.stream()
					.map(p -> p.getProducts().stream()
							.map(Product::getPrice)
							.reduce(BigDecimal.ZERO, BigDecimal::add))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println("Total dos pagamentos");
		System.out.println(_total);
		*/
		/*
		BigDecimal total = 
				payments.stream()
					.flatMap(p -> p.getProducts().stream().map(Product::getPrice))
					.reduce(BigDecimal.ZERO, BigDecimal::add);		
		System.out.println(total);
		*/
		/*
		Stream<Product> products = payments.stream()
				.map(Payment::getProducts)
				.flatMap(List::stream);
		*/
		
		/*
		Map<Product, Long> topProducts = 
				payments.stream()
					.map(Payment::getProducts)
					.flatMap(List::stream)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
				
		//topProducts.entrySet().stream().forEach(System.out::println);
		topProducts.entrySet()
			.stream()
			.max( Comparator.comparing(Map.Entry::getValue))
			.ifPresent(System.out::println);
		*/
		
		/*
		Map<Product, BigDecimal> totalValuePerProducts =
				payments.stream()
					.flatMap(p -> p.getProducts().stream())
					.collect(Collectors.groupingBy(Function.identity(),
							Collectors.reducing(BigDecimal.ZERO, Product::getPrice, BigDecimal::add )));
					
		totalValuePerProducts.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
		*/
		
		/*
		Map<Customer, List<Payment>> customerToPayments = 
				payments.stream()
					.collect(Collectors.groupingBy(Payment::getCustomer));
		
		customerToPayments.entrySet().stream().forEach(System.out::println);
		*/
		
		/*
		Map<YearMonth, List<Payment>> paymentsPerMonth = 
				payments.stream()
					.collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate())));					
		paymentsPerMonth.entrySet().stream().forEach(System.out::println);
		*/
		/*
		Map<YearMonth, List<Payment>> paymentsPerMonth = 
				payments.stream()
					.collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate()), 
							p -> p.getProducts().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add), BigDecimal::add )));		
		
		paymentsPerMonth.entrySet().stream().forEach(System.out::println);
		*/
		
		BigDecimal monthlyFee = new BigDecimal("99.90");
		Subcription s1 = new Subcription(monthlyFee, yesterday.minusMonths(5), johni);
		Subcription s2 = new Subcription(monthlyFee, yesterday.minusMonths(8), douglas, yesterday.minusMonths(1));
		Subcription s3 = new Subcription(monthlyFee, yesterday.minusMonths(5), dani, yesterday.minusMonths(2));
		
		List<Subcription> subcriptions = Arrays.asList(s1, s2, s3);
		
		BigDecimal totalPaid = subcriptions.stream()
				.map(Subcription::getTotalPaid)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(totalPaid);
				
		
	}
	
}
