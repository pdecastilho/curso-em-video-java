package cursoemvideo.app03;

import java.util.Locale;

public class SystemLang {
    public static void main(String[] args) {
        String language = Locale.getDefault().getDisplayLanguage();
        String country = Locale.getDefault().getDisplayCountry();
        System.out.println("You are in: " + country);
        System.out.println("The system language is: " + language);
    }
}
