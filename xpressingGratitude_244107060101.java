import java.util.Scanner;
public class xpressingGratitude_244107060101 {
    public static String getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything");
    }
    public static void sayAdditionalGreetings(String sentence){
        System.out.println(sentence);
    } 
    public static void main(String[] args) {
        String sentence = "Happy Teacher's Day Mrs.Lovie!!";
        System.out.println("");
        sayThankyou();
        sayAdditionalGreetings(sentence);    
    }
}