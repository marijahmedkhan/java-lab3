
public class Question8 {
public static void main(String[] args){
    String input="marijahmedkhan";
    for(int i=0; i<input.length(); i++){
       boolean random=true;
       for(int j=0; j<input.length(); j++){
        if(i != j && input.charAt(i)==input.charAt(j)){
            random=false;
            break;
        }
       }
       if(random){
          System.out.println("The first non-repeated character is "+input.charAt(i));
          break;
       }
    }
}    
}
