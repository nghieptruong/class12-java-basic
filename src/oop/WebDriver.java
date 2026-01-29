package oop;

public class WebDriver {

    public void openBrowser(String browserName, String platform) {
        System.out.println("Open " + browserName + " browser");

        if(platform.equalsIgnoreCase(Constants.WINDOWS_PLATFORM)) {
            System.out.println("Ignore test case 3");
        }

        if(browserName.equals("Chrome")) {
            System.out.println("Run test case 1");
        } else if(browserName.equals("Firefox")) {
            System.out.println("Run test case 2");
        } else {
            System.out.println("Run all test cases");
        }
    }

    public void openBrowserWithEnum(Browser browserName) {
        System.out.println("Open " + browserName + " browser");
        if(browserName == Browser.CHROME) {
            System.out.println("Run test case 1");
        } else if(browserName == Browser.FIREFOX) {
            System.out.println("Run test case 2");
        } else {
            System.out.println("Run all test cases");
        }
    }

    public void openBrowserWithEnum(String browserName) {
        System.out.println("Open " + browserName + " browser");
        Browser browserEnum = Browser.fromValue(browserName);
//        if(browserEnum == Browser.CHROME) {
//            System.out.println("Run test case 1");
//        } else if(browserEnum == Browser.FIREFOX) {
//            System.out.println("Run test case 2");
//        } else {
//            System.out.println("Run all test cases");
//        }
        switch (browserEnum) {
            case CHROME:
                System.out.println("Run test case 1");
                break;
            case FIREFOX:
                System.out.println("Run test case 2");
                break;
            default:
                System.out.println("Run all test cases");
        }
    }
}
