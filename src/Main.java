import edu.smu.tspell.wordnet.SynsetType;
import edu.smu.tspell.wordnet.WordNetDatabase;
import edu.smu.tspell.wordnet.impl.file.Morphology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    static WordNetDatabase database;

    public static void main(String[] args) {
        System.setProperty("wordnet.database.dir", "/Users/ekaterina/IdeaProjects/IT/TestJAWS/dict");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(("Why is it Essential to Include Free Messaging in Your App?" +
                "Free messaging apps use the internet instead of mobile networks. This way they’re able to provide the service without any charge or a minimal cost. A user can even make unlimited international calls via a mobile network. The high count of smartphone users has forced many companies like Facebook to accept the new market trend of the mobile market. Facebook bought Whatsapp, a messaging app that is working on building a better SMS alternative." +
                "Along with free calls and texts, it is possible to add other great features in apps. For instance, Skype offers personal as well as group video chat and video conferencing. On the other hand, Samsung’s ChatON app has an inbuilt translator and it is able to “recall” a message for you. It also allows the users to cancel sent messages." +
                "With free messaging apps, there is only one cautionary point: unreliable Wi-Fi. If you lose your connection to Wi-Fi, some additional charges may incur from your mobile carrier as per their conditions of your mobile data plan." +
                "With the smartphone usability increasing day by day, it makes sense for the companies to consider the potential of game-changing apps, loaded with features that offer maximum convenience to the users. If you real estate app has a free messaging feature, both you and your customer can save time, money and effort." +
                "So, when are you planning to get on the free messaging app bandwagon and include AppBuilderOnline.com Live Chat function in your app?" +
                "Sign Up for 30-Day Free Trial" +
                "Get Your OWN Branded App for iPhone,iPad, and Android!" +
                "Just enter the promo code when you sign up.Hurry this deal ends soon!").toLowerCase().replace(",", "").replace("?", " ").replace("!", " ").replace(".", "").split(" ")));




        list = normalize(list);
        for(String word : list){
            System.out.print(word + " ");
        }

    }


    private static ArrayList<String> normalize(ArrayList<String> words){
        ArrayList<String> resultWords = new ArrayList<>();
        for(String word : words){
            resultWords.add(normalizeWord(word));
        }

        return resultWords;
    }

    private static String normalizeWord(String word){
        database = WordNetDatabase.getFileInstance();

        Morphology id = Morphology.getInstance();

        String[] arr = id.getBaseFormCandidates(word, SynsetType.VERB);

        for(String a: arr)
            System.out.println(a);

        if(arr.length == 0)
            return word;

        return arr[0];//return first form
    }

}
