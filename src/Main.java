import entities.Company;
import exerciceone.ExerciceOne;
import exercicethree.ExerciceThree;
import exercicetwo.ExerciceTwo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("======== EXERCICE 1 ==========\n");
        ExerciceOne.createTable();

        System.out.println("\n======== EXERCICE 2 ==========\n");
        List<Company> companies = Arrays.asList(
                new Company(1, "Paul", 32, "California", 20000.00),
                new Company(2, "Allen", 25, "Texas", 15000.00),
                new Company(3, "Teddy", 23, "Norway", 20000.00),
                new Company(4, "Mark", 25, "Rich-Mond ", 65000.00)
        );
        ExerciceTwo.insertTable(companies);

        System.out.println("======== EXERCICE 3 ==========");

        List<Company> allCompanies = ExerciceThree.getAllCompanies();
        System.out.println("======== LISTE DES ENTREPRISES ==========");
        allCompanies.forEach(System.out::println);

    }
}