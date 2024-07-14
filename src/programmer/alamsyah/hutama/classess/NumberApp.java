package programmer.alamsyah.hutama.classess;

public class NumberApp {

    public static void main(String[] args) {
        Integer  intValue = 10;

        Long longvalue = intValue.longValue();
        Double doubleValue = longvalue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh  = "100.100";

        Double ContohDouble = Double.valueOf(contoh);
        System.out.println(ContohDouble);
    }
}
