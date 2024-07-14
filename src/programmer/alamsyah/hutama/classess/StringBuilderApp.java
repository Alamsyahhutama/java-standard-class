package programmer.alamsyah.hutama.classess;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Alamsyah");
        builder.append(" ");
        builder.append("Hutama");
        builder.append(" ");
        builder.append("Khannedy");

        String name = builder.toString();
        System.out.println(name);

    }
}
