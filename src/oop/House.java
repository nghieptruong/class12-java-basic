package oop;

public class House {

    private String address;

    public House(String address) {
        this.address = address;
    }

    protected void printAddress() {
        System.out.println(this.address);
    }
}
