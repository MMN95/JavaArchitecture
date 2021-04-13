public class MainApp {
    public static void main(String[] args) {

        User user = new User();
        user.setUserId(1);
        user.setName("Вася");
        user.setPhoneNumber("89578945643");

        UserView userView = new UserView();
        UserController controller = new UserController(user, userView);

        controller.updateView();

        controller.setUserPhoneNumber("89014349055");
        controller.updateView();
    }
}
