import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any string to remove special characters:");
     String user=sc.nextLine();
    String update=user.replaceAll("[^A-Za-z0-9]","");
    System.out.println(update);
    }
}
