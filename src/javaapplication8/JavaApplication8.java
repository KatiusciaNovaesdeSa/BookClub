
package javaapplication8;
import java.util.Scanner;


class BookClub {
       

    public static void main(String[] args)
    {
        System.out.println("Welcome to the CASUAL WRITERS BOOK CLUB");
        System.out.println("----------------------------------------");
        System.out.println("Please select an option from the list below.");
        System.out.println("1.Add Book");
        System.out.println("2.Delete Book");
        System.out.println("3.View All Books");
        System.out.println("4.View book Details");
        System.out.println("5.Exit");
    	System.out.println("");
        
        Scanner input = new Scanner(System.in);
        
        BookManager bookManager = new BookManager(10,10);
        String s1,s2,s3;
        int s4,s5;
        
         //book b= new book("abc","ccc","f",1979, 1);
        boolean continue1=true;
         do{
            switch(input.nextInt()){
                case 1:
                    System.out.println("Enter book name: ");
                    s1= input.nextLine();
                    System.out.println("Enter author: ");
                    s2=input.nextLine();
                    System.out.println("Enter gender: ");
                    s3=input.nextLine();
                    System.out.println("Enter book year: ");
                    s4=input.nextInt();
                    System.out.println("Enter book number: ");
                    s5=input.nextInt();
                    bookManager.addBook(s1,s2,s3,s4,s5);
                    break;
                    
                 case 2:
                    System.out.println("Enter the book number to be removed: ");
                    int bookNumber = input.nextInt();
                    bookManager.deleteBook(bookNumber);
                    break;
                    
                 case 3:
                     System.out.println("View all books: ");
                     System.out.println(bookManager.getBookList());
                     break;
                     
                 case 4:
                     System.out.println("Enter the book number to view details: ");
                     Book b =bookManager.viewBook(input.nextInt());
                     if (b!=null){
                         System.out.println(b);
                     }
                     else{
                         System.out.println("Book not found!");
                     }
                 break;
                     
                 case 5:
                     continue1=false;
                     break;
                     
                 default:
                     System.out.println("Invalid option. ");
                     break;
            }
        }
         while(continue1);
    }
}
         
    
        
        
       
     	
    
    
