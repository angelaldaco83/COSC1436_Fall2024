import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager 
{
    private ArrayList<Hero> heroes;

    public HeroManager() //This is also a contructer
    {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) //the method to add the hero
    {
        heroes.add(hero);
    }

    public void removeHero(String name) //this is to remove the hero as requested 
    {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    public void bubbleSort() //This will just put it in acsending order 
    {
        int n = heroes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) 
                {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    public void insertionSort() //just to display the heroes
    {
        for (int i = 1; i < heroes.size(); i++) 
        {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) 
            {
                heroes.set(j + 1, heroes.get(j));
                j = j - 1;
            }
            heroes.set(j + 1, key);
        }
    }

    public void displayHeroesAs2DArray() //to display the array 
    {
        Object[][] heroArray = new Object[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) 
        {
            Hero hero = heroes.get(i);
            heroArray[i][0] = hero.getName();
            heroArray[i][1] = hero.getPowerLevel();
            heroArray[i][2] = hero.getAffiliation();
        }
        System.out.println(Arrays.deepToString(heroArray));
    }

    public void displayHeroes() 
    {
        heroes.forEach(System.out::println);
    }
}