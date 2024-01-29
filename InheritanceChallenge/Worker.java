package CoreJava.Class.CodeChallenge.UdemyChallenge.InheritanceChallenge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    protected LocalDate endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public int getAge(){
        // Parse the input string to a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate birthdate = LocalDate.parse(this.birthDate, formatter);

        // Calculate the age and return
        return calculateAge(birthdate);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(LocalDate endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    private static int calculateAge(LocalDate birthDate){

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference between the birthdate and the current date
        Period period = Period.between(birthDate, currentDate);

        return period.getYears();
    }
}
