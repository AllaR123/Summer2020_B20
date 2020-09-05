package day51_Exceptions.Browsers;

public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.get("https://www.Google.com");
        chromeBrowser.close();

        FairFax fairFax = new FairFax();
        fairFax.get("https://www.Facebook.com");
        fairFax.close();
    }
}
