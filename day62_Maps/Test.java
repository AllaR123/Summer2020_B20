package day62_Maps;

public class Test {

    public static void main(String[] args) {

       // String favoriteColor = "Pink";

        Color favoriteColor = Color.Blue;   // from Enum Color class
        System.out.println(favoriteColor);

        Browser myBrowser = Browser.chrome;
        System.out.println(myBrowser);


        switch (myBrowser) {
            case chrome:
                System.out.println("This is chrome");
                break;
            case firefox:
                System.out.println("This is firefox");
                break;
            case safari:
                System.out.println("This is safari");
                break;
        }
    }
}
