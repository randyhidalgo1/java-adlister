public class BeanTest {

    public static void main(String[] args) {
        Album album = new Album(1, "Taylor Swift", "Taylor Swift", 2006, 5000000, "Country");
        System.out.println(album);
        Album album1 = new Album(2, "Ed Sheeran", "Fearless", 2008, 10000000, "Pop");
        System.out.println(album1);
        Album album2 = new Album(3, "Rihanna", "Speak Now", 2010, 7500000, "Rap");
        System.out.println(album2);

        Quotes quote = new Quotes(1, "I'm intimidated by the fear of being average.", 1);
        System.out.println(quote);
        Quotes quote1 = new Quotes(2, "If you're lucky enough to be different, don't ever change.", 1);
        System.out.println(quote1);
        Quotes quote2 = new Quotes(3, "I've found time can heal most anything and you just might find who you're supposed to be.", 1);
        System.out.println(quote2);

        Author author = new Author(1, "Malcolm X");
        System.out.println(author);
        Author author1 = new Author(2, "Marcus Aurelius");
        System.out.println(author1);
        Author author2 = new Author(3, "Socrates");
    }
}
