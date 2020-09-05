package day51_Exceptions.Browsers;

public class WebDriver {

    /*
    Browsers task:
    1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
    2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
    3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
    4. create a class called OperaBrowser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the get & close actions
            ChromeDriver driver = new ChromeDriver();
                    driver.get(URL)
                    driver.close()
            FireFoxDriver driver = new FireFoxDriver();
                    driver.get(URL)
                    driver.close()

     */

    public void get(String url) {
        System.out.println("URL opened url "  + url + "default browser");
    }

    public void close() {
        System.out.println("Closing default browser");
    }
}
