
package javaapplication8;


class BookManager{
    private static int currentUnusedBookNo;
    private int maxBooks;
    private int numBooks;
    private Book[]book;

 public BookManager(int bookNoSeed,int maxBooks) {
    numBooks=0;
    this.maxBooks = maxBooks;
   currentUnusedBookNo= bookNoSeed;
   book=new Book[maxBooks];
 }
    
    public boolean addBook(String title, String mainAuthor, String genre, int year, int bookNumber){
      if(numBooks >=maxBooks){
        return false;
    }
      else{
         Book a= new Book(title, mainAuthor, genre ,year, bookNumber); 
         numBooks++;
        return true;
    }

    }
    public int findBook(int bld){
        for(int i=0; i<maxBooks;i++){
            if(book[i] !=null && book[i].equals(bld)){
           return i; 
        }
    }
    return -1;
}
  public Book viewBook(int bld){
      for(int i=0; i<maxBooks; i++){
          if(book[i]!=null && book[i].getBookNum()==bld){
              return book[i];
          }
      }
       return null; 
    } 
    
    public boolean deleteBook(int bld){
        if(numBooks>=maxBooks){
            return false;
        }
        for(int i=0; i<maxBooks;i++){
           if(book[i] !=null && book[i].equals(bld)){
           bld--;  
           return true;
        }
        return false;
    }
        return true;
    }
    
    public String getBookList(){
       String bld="";
       for(int i=0; i<maxBooks;i++){
           bld += book[i].getBookNum()+ "-" +book[i].getTitle() + "-" +book[i].getAuthor() + "-" +book[i].getGenre();
       }
       return bld;
    }


}