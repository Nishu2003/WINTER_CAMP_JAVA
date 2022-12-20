package Assignment2;
import java.util.Scanner;

interface book{
    String name="JYOTI";
    String Gender="FEMALE";
    String Department="CSE";
    String book_name="INTRODUCTION TO JAVA";
}
interface magazine{
    String name="Khushi";
    String Gender="FEMALE";
    String Department="CSE";
    String magazine_name="DEMO";
}
interface novel{
    String name="ARNAV";
    String Gender="MALE";
    String Department="CSE";
    String novel_name="DEMO";
}

abstract class details{
    abstract void book_rent();
}

class student extends details implements novel,book,magazine{
    void book_rent(){
        System.out.println("FOR STUDENT ----------");
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("MENU---------");
        System.out.println(" 1- Rent a book ");
        System.out.println(" 2 - Rent a Magazine");
        System.out.println(" 3 - Rent a novel ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("NAME: "+book.name);
            System.out.println("Gender : "+book.Gender);
            System.out.println("Department : "+book.Department);
            System.out.println("Book Name: "+book_name);
            break;
            case 2:
            System.out.println("NAME: "+magazine.name);
            System.out.println("Gender : "+magazine.Gender);
            System.out.println("Department : "+magazine.Department);
            System.out.println("Magazine Name: "+magazine.magazine_name);
            break;
            case 3:
            System.out.println("NAME: "+novel.name);
            System.out.println("Gender : "+novel.Gender);
            System.out.println("Department : "+novel.Department);
            System.out.println("Novel Name: "+novel.novel_name);
            break;
            default:
            System.out.println("INVALID CHOICE !!!");
            break;
        }
        }
    }
}
class teacher extends details implements novel,book,magazine{
    void  book_rent(){
        System.out.println("FOR TEACHER ----------");
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("MENU---------");
        System.out.println(" 1- Rent a book ");
        System.out.println(" 2 - Rent a Magazine");
        System.out.println(" 3 - Rent a novel ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("NAME: "+book.name);
            System.out.println("Gender : "+book.Gender);
            System.out.println("Department : "+book.Department);
            System.out.println("Book Name: "+book_name);
            break;
            case 2:
            System.out.println("NAME: "+magazine.name);
            System.out.println("Gender : "+magazine.Gender);
            System.out.println("Department : "+magazine.Department);
            System.out.println("Magazine Name: "+magazine.magazine_name);
            break;
            case 3:
            System.out.println("NAME: "+novel.name);
            System.out.println("Gender : "+novel.Gender);
            System.out.println("Department : "+novel.Department);
            System.out.println("Novel Name: "+novel.novel_name);
            break;
            default:
            System.out.println("INVALID CHOICE !!!");
            break;
        }
        }
    }
}
public class library_management_system {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter your category : ");
            System.out.println("1 - Tecaher");
            System.out.println("2- Student");
            int choice=sc.nextInt();
            if(choice==1){
                teacher obj=new teacher();
                obj.book_rent();
            }
            if(choice==2){
                student obj2=new student();
                obj2.book_rent();
            }
        }
    }
}
