package programmer.alamsyah.hutama.classess;

public class StringApp {
    public static void main(String[] args) {
        String name = "Alamsyah Hutama";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name) ;
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());

        System.out.println(name.startsWith("Alamsyah"));
        System.out.println(name.endsWith("Hutama"));

        String[] names = name.split(" ");
        System.out.println(names);

        for(var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(1));

        char[] chars = name.toCharArray();
        System.out.println(chars);

    }
}
