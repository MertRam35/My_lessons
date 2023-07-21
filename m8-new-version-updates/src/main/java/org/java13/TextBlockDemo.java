package org.java13;



public class TextBlockDemo {

    public static void main(String[] args) {
        var adress = " 7925 Jones Branch Drive \n " + " McLean,va 22102";
        var adress2 = """
                7925 Jones Branch Drive
                McLean,va 22102                 """;
        System.out.println("adress2 = " + adress2);
    }

}
