import java.util.Date; //need to import to use Date
import java.text.SimpleDateFormat; 

public class AlfredQuotes{
    //this is one of the methods 
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name){
        
        return String.format("Hello, %s. Lovely to see you. How are you?", name);
    }

    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s. Lovely to see you.", "evening","Beth Kane");
    }

    public String dateAnnouncement(){
        Date date = new Date();
        return "Today's date is " + date;
    }

    // public class SimpleDateFormat{
    //     public static void main(String[] args){
    //         Date date = new Date();

    //     }
    // }


    public String respondBeforeAlexis(String conversation){
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";
        } return "Right. And with that I shall retire.";
        
    }

    //NINJA BONUS
    //See the specs to overload the guessGreeting method
    //Sensei bonus
    //Write your own AlfredQuote method using any of the String methods you have learned!
}