import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int counter;
        System.out.println("Enter any string");
        String user=sc.nextLine();
        char string1[]=user.toCharArray();
        System.out.println("The duplicate characters in the array is:");
        for(int i=0; i<string1.length; i++){
            counter=1;
            for(int j=i+1; j<string1.length; j++){
                if(string1[i]==string1[j] && string1[i]!=' '){
                    counter++;
                    string1[j]='0';
                }
            }
            if(counter>1 && string1[i]!='0'){
                System.out.println(string1[i]);
            }
        }
    }
    
}
