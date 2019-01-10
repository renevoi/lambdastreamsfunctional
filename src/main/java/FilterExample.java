import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Renevoi", "Ailia Cerene", "Grace");


        for (String name : names) {
            if (!name.equals("Renevoi")){
                System.out.println(name);
            }
        }

        names.stream()
                .filter(name -> isNotRenevoi(name))
                .forEach(System.out::println);

    }

    private static boolean isNotRenevoi(String name) {
        return !name.equals("Renevoi");
    }

}
