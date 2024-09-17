public class Author
{
        private String name;
        private String email;
        private String nationality;
public Author()
{
        this.name = "Angel Aldaco";
        this.email = "angelaldaco83@gmail.com";
        this.nationality = "Hispanic";
}    

public Author(String name)
{
        this.name = name;
}
public Author(String email, String nationality)
{
        this.email = email;
        this.nationality = nationality;
}
public Author(String name, String email, String nationality)
{
        this.name = name;
        this.email = email;
        this.nationality = nationality;
}

public String toString() 
{
        return (name + ", Email: " + email + ", Nationality: " + nationality);
}

}

