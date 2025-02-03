/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Stephen M. Burns
 * @version 02/03/2025
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    /**
     *  return the name of the author.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * return the name of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * print the title of the book.
     */
    public void printTitle()
    {
        System.out.println("Title:"+ title);
    }
    
    /**
     * print name of the author.
     */
    public void printAuthor()
    {
        System.out.println("Author:"+ author);
    }


}
