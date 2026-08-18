import java.util.Scanner;

public class Library {
    int BookId, avlBook,TotalBook;
    String BookName="",BookAuthor, BookCategory="";
    Scanner sc= new Scanner(System.in);
    public void addBook(){
        System.out.println("Add your book");
        System.out.println("Enter book ID: ");
        BookId=sc.nextInt();
        System.out.println("Enter book Name: ");
        sc.nextLine();
        BookName=sc.nextLine();
        System.out.println("Enter book Author: ");
        
        BookAuthor=sc.nextLine();
        System.out.println("Enter book Category: ");
        
        BookCategory=sc.nextLine();
        System.out.println("Enter Total Books:");
        TotalBook=sc.nextInt();
        avlBook=TotalBook;
    }
    public void view(){
        System.out.println("Book Details");
        System.out.println("Book ID: "+BookId);
        System.out.println("Book Name: "+BookName);
        System.out.println("Book Author: "+BookAuthor);
        System.out.println("Book Category: "+BookCategory);
        System.out.println("Total Books: "+TotalBook);
        System.out.println("Available Books: "+avlBook);
        System.out.println("Issued Books: "+(TotalBook-avlBook));
    }
void mainMenu(){
    System.out.println("Library Management System");
    System.out.println("1. Add Book");
    System.out.println("2. View Book");
    System.out.println("3. Search Book");
    System.out.println("4. Issue Book");
    System.out.println("5. Return Book");
    System.out.println("6. Delete Book");
    System.out.println("7. Library Report");
    System.out.println("8. Exit");
}    
void SearchBook(){
    System.out.println("Enterbook id to search: ");
    int c=sc.nextInt();
    if (c==BookId) {
        System.out.println("Book Found");
        System.out.println("Book ID: "+BookId);
        System.out.println("Book Name: "+BookName);
        System.out.println("Book Author: "+BookAuthor);
        System.out.println("Book Category: "+BookCategory);
        System.out.println("Total Books: "+TotalBook);
        System.out.println("Available Books: "+avlBook);
        System.out.println("Issued Books: "+(TotalBook-avlBook));
    }
    else{
        System.out.println("Book not found!");
    }
}
void issueBook(){
    // System.out.println("Enter book ID to be issued: ");
    if (avlBook>0) {
        System.out.println("Book Issued");
        avlBook-=1;
    }
    else{
        System.out.println("Book cannot be issued");
    }
}
void returnBook(){
    if (avlBook<TotalBook) {
        System.out.println("Book Returned");
        avlBook+=1;
    }
    else{
        System.out.println("Book cannot be returned");
    }
}
void deleteBook(){
    if (BookId!=0) {
        BookId=0;
    BookAuthor="";
    BookCategory="";
    BookName="";
    avlBook=0;
    TotalBook=0;
    System.out.println("Book deleted");
    }
    else{
        System.out.println("Book not added");
    }
}
void libraryReport(){
    System.out.println("Book ID: "+BookId);
        System.out.println("Book Name: "+BookName);
        System.out.println("Book Author: "+BookAuthor);
        System.out.println("Book Category: "+BookCategory);
        System.out.println("Total Books: "+TotalBook);
        System.out.println("Available Books: "+avlBook);
        System.out.println("Issued Books: "+(TotalBook-avlBook));
}
public static void main(String[] args) {
    Library obj=new Library();
    Scanner sc=new Scanner(System.in);
    int choice;
    do { 
        obj.mainMenu();
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        
        switch (choice) {
            case 1:
                obj.addBook();  
                System.out.println("Book Added");
                break;
            case 2:
                obj.view();
                break;
            case 3:
                obj.SearchBook();
                break;
            case 4:
                obj.issueBook();
                break;
            case 5:
                obj.returnBook();
                break;
            case 6:
                obj.deleteBook();
                break;
            case 7:
                obj.libraryReport();
                break;
            default:
                System.out.println("Invalid Input");
        }
    } while (choice!=8);
}
}