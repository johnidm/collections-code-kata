package br.com.johnidouglas;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;






public class Capitulo10 {

	public static void main(String[] args) {
		/*
		
		LocalDate mesQueVem = LocalDate.now().plusMonths(1);
		System.out.println(mesQueVem);
		
		LocalDate anoPassado = LocalDate.now().minusYears(1);
		System.out.println(anoPassado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		int data = LocalDate.now().withYear(1998).getYear();
		System.out.println(data);
				
		ZonedDateTime tokio = ZonedDateTime.of(2011,  5, 2, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo"));
		
		ZonedDateTime saoPaulo = ZonedDateTime.of(2011,  5, 2, 10, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(tokio.plusHours(12).isEqual(saoPaulo));
		
		System.out.println("Hoje é dia " + MonthDay.now().getDayOfMonth());
		
		System.out.println(LocalDate.of(2014, 12, 25));
		System.out.println(LocalDate.of(2014, Month.DECEMBER, 25));
		
		Locale pt = new Locale("pt");
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.SHORT, pt));
		
		LocalDateTime agora_ = LocalDateTime.now();
		String resultado = agora_.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(resultado); 
		
		*/
		
		/*
		LocalDate agora = LocalDate.now();
		LocalDate outraData = LocalDate.of(2013, Month.APRIL, 2);
		long dias = ChronoUnit.DAYS.between(agora, outraData);
		long meses = ChronoUnit.MONTHS.between(agora, outraData);
		long anos = ChronoUnit.YEARS.between(agora, outraData);
		System.out.printf("A diferença é meses [%s], dias [%s], anos[%s]", meses, dias, anos);
		
		Period periodo = Period.between(outraData, agora);		
		System.out.printf("A diferença é meses [%s], dias [%s], anos[%s]", periodo.getMonths(), periodo.getDays(), periodo.getYears());
		*/
		
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime depois = LocalDateTime.now().plusHours(5);
		Duration duracao = Duration.between(agora, depois);
		if (duracao.isNegative()) {
			duracao.negated();
		}
				
		System.out.printf("%s horas, %s minutos, %s segundos", duracao.toHours(), duracao.toMinutes(), duracao.getSeconds());
	}
	
}
