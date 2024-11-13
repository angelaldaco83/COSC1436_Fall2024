public class Main2 
{
    public static void main(String[] args) {
        HeroManager heroManager = new HeroManager();

        heroManager.addHero(new Hero("Spider-Man", 75, Affiliation.AVENGERS));
        heroManager.addHero(new Hero("Batman", 85, Affiliation.JUSTICE_LEAGUE));
        heroManager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        heroManager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        heroManager.displayHeroes();
        System.out.println();

        heroManager.bubbleSort();
        heroManager.displayHeroes();
        System.out.println();

        heroManager.insertionSort();
        heroManager.displayHeroes();
        System.out.println();

        heroManager.removeHero("Batman");

        heroManager.displayHeroes();
        System.out.println();

        heroManager.addHero(new Hero("Iron Man", 95, Affiliation.AVENGERS));

        heroManager.displayHeroes();
        System.out.println();

        heroManager.displayHeroesAs2DArray();
    }
}
//This is the main method
//I put it as Main2 because it will not let me do just "Main"