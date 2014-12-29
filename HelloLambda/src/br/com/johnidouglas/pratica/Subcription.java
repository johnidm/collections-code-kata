package br.com.johnidouglas.pratica;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Subcription {
	
	private BigDecimal monthlyFee;
	private LocalDateTime begin;
	private Optional<LocalDateTime> end;
	private Customer customer;
	
	public Subcription(BigDecimal monthlyFee, LocalDateTime begin, Customer customer) {
		this.begin = begin;
		this.customer = customer;
		this.monthlyFee = monthlyFee;
		this.end = Optional.empty();	
	}
	
	public Subcription(BigDecimal monthlyFee, LocalDateTime begin, Customer customer, LocalDateTime end) {
		this.begin = begin;
		this.customer = customer;
		this.monthlyFee = monthlyFee;
		this.end = Optional.of(end);	
	}
	
	public BigDecimal getTotalPaid() {
			
		BigDecimal meses = new BigDecimal( ChronoUnit.MONTHS.between(getBegin(), getEnd().orElse(LocalDateTime.now())) );
		
		return getMonthlyFee().multiply(meses);
		
	}
	
	public BigDecimal getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(BigDecimal monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	public LocalDateTime getBegin() {
		return begin;
	}
	public void setBegin(LocalDateTime begin) {
		this.begin = begin;
	}
	public Optional<LocalDateTime> getEnd() {
		return end;
	}
	public void setEnd(Optional<LocalDateTime> end) {
		this.end = end;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
