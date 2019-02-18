package lt.v;
//Sukurti programą, kuri paskaičiuotų Jūsų tikslų amžių metais, mėnesiais ir dienomis.
//        Raskite visų Jūsų gmtadienių savaitės dienas. Sugrupuokite ir atspausdinkite kurią savaitės dieną kiek kartų šventėte gimtadienį.

import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.temporal.ChronoUnit.*;

public class Main {
    public static void main(String[] args) {
        LocalDate bornDate = LocalDate.of(1974,03,17);
        LocalDate dateNow= LocalDate.now();
        long age = YEARS.between(bornDate, dateNow);
        long months=MONTHS.between(bornDate, dateNow);
        long days =DAYS.between(bornDate, dateNow);




        System.out.println(age);
        System.out.println(months);
        System.out.println(days);

        getAllbirthWeekDays(bornDate,dateNow);
    }
    public static void getAllbirthWeekDays(LocalDate bornDate,LocalDate d2){
        ArrayList<DayOfWeek> wd = new ArrayList<>();
        for (int i=bornDate.getYear();i<d2.getYear();i++){
            LocalDate localDate=LocalDate.of(i,03,17);
            DayOfWeek weekBirthDays=  localDate.getDayOfWeek();
            wd.add(weekBirthDays);
        }
        System.out.println(wd);
//        final Map<Integer, List<Integer>> wds =

        Map<DayOfWeek, Long> wds = wd.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(wds);
//        final Map<Integer,Integer> wdso=wds.keySet().stream()
//                .collect(Collectors.summingInt());









    }



}
