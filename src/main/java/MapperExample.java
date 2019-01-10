
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Renevoi", "Ailia Cerene", "Grace");
        List<Integer> ages = Arrays.asList(35,23,7);

        /*for (String name : names) {
            if (!name.equals("Renevoi")) {
                System.out.println(name);
            }
        }*/

        names.stream()
                .filter(MapperExample::isNotRenevoi)
                .map((name) -> new User(name))
                //.map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream()
                //.filter(MapperExample::isNotRenevoi)
                .map((name) -> new User(name))
                .collect(Collectors.toList()); // terminal operator

        System.out.println();
        userList.stream()
                .forEach(System.out::println); // terminal operator

        System.out.println("Sum all of the ages");
        int sumAge = userList.stream()
                .mapToInt(User::getAge)
                .sum(); // terminal operator

        System.out.println("Sum: " + sumAge);
    }

    private static boolean isNotRenevoi(String name) {
        return !name.equals("Renevoi");
    }

}

    class User {
        private String name;
        private Integer age = 34;

        public User() {
        }

        public User(String name) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
