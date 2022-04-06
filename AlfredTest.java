public class AlfredTest{
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing...");

        String guestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");

        // String newDate = alfredBot.SimpleDateFormat();

        // String testGreeting= String.format("Hello, %s, lovely to see you. How are you?", "Beth Kane");
        // System.out.println(testGreeting);
        // System.out.println(testGreeting);
        // System.out.println(testGuestGreeting);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        // System.out.println(guestGreeting);
        // System.out.println(newDate);
    }
}
