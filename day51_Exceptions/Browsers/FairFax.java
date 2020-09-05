package day51_Exceptions.Browsers;

public class FairFax extends WebDriver {

    @Override

    public void get(String url) {
        System.out.println("URL opened url "  + url + "fairfox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing fairfox browser");
    }
}
