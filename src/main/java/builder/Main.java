package builder;

public class Main {
    public static void main(String[] args) {
        User user = User
                .builder()
                .name("Catherine")
                .age(22)
                .occupation("GlobalLogic")
                .occupation("Genesis")
                .build();
        System.out.println(user);
    }
}