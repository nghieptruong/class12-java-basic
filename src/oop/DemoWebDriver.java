package oop;

public class DemoWebDriver {
    public static void main(String[] args) {
        WebDriver driver = new WebDriver();
//        driver.openBrowser("chrome");
//        driver.openBrowserWithEnum(Browser.CHROME);
        driver.openBrowserWithEnum("chrome");

        System.out.println("-----------");
        for(Browser c : Browser.values())
            System.out.println(c);

        System.out.println("-----------");
        Browser a = Browser.valueOf("CHROME");
        System.out.println(a);

        System.out.println("-----------");
        int index = Browser.EDGE.ordinal();
        System.out.println(index);

        System.out.println("-----------");
        Browser chromeEnum = Browser.CHROME;
        String value = chromeEnum.getValue();
        System.out.println(value);
    }
}
