import java.util.Scanner;
public class Question1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any string:");
String user=sc.nextLine();
System.out.println("The reverse of the string is:");
for(int i=user.length(); i>0; i--){
    System.out.print(user.charAt(i-1));
}
}

}