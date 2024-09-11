public class Book
{
    private String title;
    private double price;
    private Author author;
    

public Book(String title, double price, Author author)
{
    this.title = "Gym Rat and the Dismorphia";
    this.price = "29.99";
    this.author = "Angel Aldaco";
}
    
public String getTitle()
{
    return title;
}

public double getPrice()
{
    return price;
}

public String getAuthor()
{
    return author;
}

public String toString() 
{
    return ("Book: " + title + ", Price: " + price + "Author: " + author);

}
}