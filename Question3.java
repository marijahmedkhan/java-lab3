import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any string to remove white spaces:");
     String user=sc.nextLine();
    String update=user.replaceAll(" ","");
    System.out.println(update);
    }
}
