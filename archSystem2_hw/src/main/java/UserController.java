public class UserController {
    private User user;
    private UserView userView;

    public UserController(User user, UserView userView){
        this.user = user;
        this.userView = userView;
    }

    public int getUserId(){
        return user.getUserId();
    }

    public void setUserId(int userId){
        user.setUserId(userId);
    }

    public String getUserName(){
        return user.getName();
    }

    public void setUserName(String name){
        user.setName(name);
    }

    public String getUserPhoneNumber(){
        return user.getPhoneNumber();
    }

    public void setUserPhoneNumber(String phoneNumber){
        user.setPhoneNumber(phoneNumber);
    }

    public void updateView(){
        userView.printUserInfo(user.getUserId(), user.getName(),user.getPhoneNumber());
    }
}
