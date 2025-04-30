package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user = new UserEntity();

        user.setUsername(1);
        user.setPassword(9876);
        user.setEmail("a@test.com");
        user.setName("대웅");

        System.out.println(user);

        UserEntityLombok lombok  = new UserEntityLombok  ();

        lombok.setUsername(1);
        lombok.setPassword(9876);
        lombok.setEmail("a@test.com");
        lombok.setName("대웅");

        System.out.println(user);
    }
}
