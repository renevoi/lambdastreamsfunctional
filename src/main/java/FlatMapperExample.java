import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapperExample {

    public static void main(String[] args) {

        List<User2> users = Arrays.asList(

                new User2("Rene", 35, Arrays.asList("1", "3")),
                new User2("Ailia", 7, Arrays.asList("4", "23")),
                new User2("Grace", 23, Arrays.asList("4", "23"))

        );

        Optional<String> stringOptional = users.stream() // stream of users
                .map(user -> user.getPhoneNumbers().stream()) // stream of phone numbers which then gave it to flatMap
                .flatMap(phoneStream -> phoneStream.filter(phoneNo -> phoneNo.equals("2")))
                .findFirst();

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Not Found"));
       // stringOptional.ifPresent(System.out::println);


    }

    private static boolean isNotRenevoi (String name){
            return !name.equals("Renevoi");
    }
}
    class User2 {
        private String name;
        private Integer age = 34;
        private List<String> phoneNumbers;

        public User2() {
        }

        public User2(String name, Integer age, List<String> phoneNumbers) {
            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }

        public User2(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
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

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

        @Override
        public String toString() {
            return "User2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }