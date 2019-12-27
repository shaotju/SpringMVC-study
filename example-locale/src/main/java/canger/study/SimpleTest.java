package canger.study;

import java.util.ResourceBundle;

public class SimpleTest {
    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("message").getString("name"));
    }
}
