import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("zaphodess", 52));
        heroes.add(new Hero("fraupapst", 67));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Collections.sort(heroes, Comparator.comparing(Hero::getAge).reversed());

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}

/*Beispiele*/
/*Collections.sort(heroes, Comparator.comparing(Hero::getAge));*/

/* nicht verwenden, ein Beispiel für geschachtelte Sortierungen, bräuchte noch ein Feld Salary dafür
        Collections.sort(heroes, Comparator.comparingDouble(Hero::getSalary).thenComparing(Hero::getName));
        System.out.println("\nHeroes (Sorted by Salary and Name) : " + heroes);*/
