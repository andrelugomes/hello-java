package br.com.alura;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by agomes on 03/03/16.
 */
public class APIDatas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);


        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo);

        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());

        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));


        System.out.println(hoje.minusDays(2));

        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));

        //Uma API imutável
        olimpiadasRio.plusYears(4);
        System.out.println(olimpiadasRio);

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);


        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);

        LocalTime intervalo = LocalTime.of(12, 30);
        System.out.println(intervalo);
    }
}
