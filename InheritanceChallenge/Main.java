package CoreJava.Class.CodeChallenge.UdemyChallenge.InheritanceChallenge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Employee bibek = new Employee("Bibek", "03-11-1993", "01-01-2020");

        System.out.println(bibek);
        System.out.println("Age "+ bibek.getAge());
        System.out.println("Pay "+ bibek.collectPay());

        Employee tim = new Employee("Tim", "11-11-1985", "01-01-2020");
        System.out.println(tim);
        System.out.println("Age "+ tim.getAge());
        System.out.println("Pay "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11-11-1990", "03-03-2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $ "+ joe.collectPay());

        System.out.println("--------------");

        joe.retire();
        System.out.println(joe);
        System.out.println("Joe's Pension check = $ "+ joe.collectPay());


    }
}
