import java.util.Arrays;

public class Test {


    public static void main (String[] args) {

        String[] names = new String[] {"cocula","remi"};

        Arrays.stream(names).filter(name -> name.equals("cocula")).forEach(System.out::println);

    }
}
