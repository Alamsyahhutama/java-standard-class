package programmer.alamsyah.hutama.classess;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner  = new StringJoiner(", ", "[","]");

        joiner.add("Alamsyah");
        joiner.add("Hutama");
        joiner.add("Khannedy");

        String value = joiner.toString();
        System.out.println(value);
    }
}
