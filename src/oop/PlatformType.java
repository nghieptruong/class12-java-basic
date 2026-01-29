package oop;

public enum PlatformType {

    WINDOWS("windows os", "He Dieu Hanh Windows"),
    MAC("mac os", "He Dieu Hanh Mac"),
    ANDROID("android os", "He Dieu Hanh Android"),
    IOS("ios os", "He Dieu Hanh iOS"),
    NOT_SUPPORT("not support", "Khong Ho Tro");

    private String value;
    private String vnText;

    PlatformType(String value, String vnText) {
        this.value = value;
        this.vnText = vnText;
    }

    public String getValue() {
        return this.value;
    }

    public String getVnText() {
        return this.vnText;
    }

    public static PlatformType fromValue(String value) {
        PlatformType[] arrPlatformTypeEnum = PlatformType.values();
        for (int i = 0; i < arrPlatformTypeEnum.length; i++) {
            if(value.equalsIgnoreCase(arrPlatformTypeEnum[i].getValue())) {
                return arrPlatformTypeEnum[i];
            }
        }
        return PlatformType.NOT_SUPPORT;
    }
}
