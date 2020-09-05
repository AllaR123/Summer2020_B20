package day51_Exceptions.Browsers;

public class ChromeBrowser extends WebDriver {

    @Override
    public void get(String url) {
        System.out.println("URL opened url "  + url + "chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome browser");
    }


}
