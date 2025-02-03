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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages )
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber="";
    }
    
    /**
     * Applies individual reference number for book
     */
    public void setRefNumber(String ref)
    {
        refNumber=ref;
    }
    
    /**
     *  return the reference number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     *  return the number of pages
     */
    public int getPages()
    {
        return pages;
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
    
    /**
     *  print the name, number of pages, and the author of the book.
     */
    public void printDetails()
    {
        System.out.println("Title:"+ title + "\n Author: " + author + "\n Pages: " + pages);
        
        if (refNumber.length()<=0)
        {
            System.out.println("Reference Number: ZZZ");
        }
        else
        {
            System.out.println("Reference Number: "+refNumber);
        }
    }


}
