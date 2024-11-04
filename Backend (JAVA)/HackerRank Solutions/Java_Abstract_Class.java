import java.util.*;
abstract class Book {
    String title;
    
    abstract void setTitle(String s);
    
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        MyBook new_novel = new MyBook();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        new_novel.setTitle(s);
        System.out.println("The title is: " + new_novel.getTitle());
    }
}
