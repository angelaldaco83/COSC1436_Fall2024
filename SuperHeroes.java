public class SuperheroRoster 
{

    public static void main(String[] args) {
        String[] heroNames = {"Superman", "Beyonder", "Flash"};
        String[] abilities = {"Super-Strength", "Reality Warping", "Speed"};
        int[] powerLevels = {85, 90, 80};

        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }

        searchHero(heroNames, abilities, powerLevels, "Superman");

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
        
        Superhero[] superheroes = {
            new Superhero("Superman", "Super-Strength", 85),
            new Superhero("Beyonder", "Reality Warping", 100),
            new Superhero("Flash", "Speed", 50)
        };
        
        for (Superhero superhero : superheroes) {
            superhero.displayHero();
        }
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero found: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                return;
            }
        }
        System.out.println("Hero not found: " + target);
    }

    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}

class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public void displayHero() {
        System.out.println("Hero: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println();
    }
}