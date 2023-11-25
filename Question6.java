import java.util.Arrays;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string to sort:");
        String user=sc.nextLine();
        char arr[]=user.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
