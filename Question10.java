import java.util.Scanner;
public class Question10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email="duet@123";
        System.out.println("Enter email");
        String user=sc.nextLine();
        if(email.equals(user)){
            System.out.println("Your email is same as declared email.");
        }
        else{
            System.out.println("Invalid email");
        }

    }
}
