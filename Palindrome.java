public class Palindrome
{
    public static void main(String [] args){
    String Reverse = "", Original = "mam"; 
    
    for(int i = Original.length() - 1; i>= 0; i--){
        Reverse += Original.charAt(i);
        System.out.println(Reverse);
    }
    
    boolean palindrome = true;
    for(int i = 0; i<Original.length();i++){
        if(Original.charAt(i)!=Reverse.charAt(i)){
            palindrome = false;
        }
    }
    
    if(palindrome){
        System.out.println("Palindrome exists");}
            else
            System.out.println("Is a lie!!!! Get a life");
}
}
