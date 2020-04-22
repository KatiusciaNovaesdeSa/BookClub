
package javaapplication8;

/**
 *
 * @author owner
 */
class Book {
    
    private String title;
    
    private String mainAuthor;
    
    private int bookNumber;
    
    private String genre;
    
    private int year;
    

    /* create a constructors that allows a user to input instance variables **/
    
    public Book(String title,String mainAuthor,String genre,int year,int bookNumber)
    {   this.title=title;
        this.mainAuthor= mainAuthor;
        this.year=year;
        this.genre=genre;
        this.bookNumber= bookNumber;
    }
    
   
      
    public String getTitle()
    {
        return title;
    }
    
     public String getAuthor()
    {
        return mainAuthor;
    }
    public int getYear()
    {
        return year;
    }
    public int getBookNum()
    {
        return bookNumber;
    } 
    public String getGenre()
    {
        return genre;
    }
    
/* create a toString method that returns all of the details of the book that has been inputted. **/
    
    public String toString(){
      return  "The details of the book are: " + title + ", " + mainAuthor + ", " + bookNumber + ", " + year + ", " +genre;

}
      
    
}

