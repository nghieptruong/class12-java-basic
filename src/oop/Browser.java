package oop;

public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox"),
    SAFARI("safari"),
    EDGE("edge"),
    INVALID("invalid");

    private String value;

    Browser(String browserName) {
        this.value = browserName;
    }

    public String getValue() {
        return this.value;
    }

    public static Browser fromValue(String value) {
        Browser[] arrBrowserEnum = Browser.values();
        for (int i = 0; i < arrBrowserEnum.length; i++) {
            if(value.equalsIgnoreCase(arrBrowserEnum[i].getValue())) {
                return arrBrowserEnum[i];
            }
        }
        return Browser.INVALID;
    }
}
