import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapper implements UserMapperInt {
    private final Connection connection;
    private List<User> users = new ArrayList<>();
    private static Map<Integer, User> userMap = new HashMap<>();

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public  List<User> getUsers(){
        return this.users;
    }

    @Override
    public User find(int userId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("Select ID, name, phonenumber");
        statement.setInt(1, userId);
        try(ResultSet resultSet = statement.executeQuery()) {
            for (User user : this.getUsers()) {
                user.setUserId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setPhoneNumber(resultSet.getString(3));
                return user;
            }
        }
        return null;
    }

    @Override
    public void insert(User userToInsert) throws Exception {
        if(!this.getUsers().contains(userToInsert)){
            this.getUsers().add(userToInsert);
        } else throw new Exception("User already exists");
    }

    @Override
    public void update(User userToUpdate) throws Exception {
        if(this.getUsers().contains(userToUpdate)){
            int index = this.getUsers().indexOf(userToUpdate);
            this.getUsers().set(index, userToUpdate);
        } else throw new Exception("User is not found");
    }

    @Override
    public void delete(User userToDelete) throws Exception {
        if(this.getUsers().contains(userToDelete))
            this.getUsers().remove(userToDelete);
        else throw new Exception("User is not found");
    }

    public static void addUser(User user){
        userMap.put(user.getUserId(),user);
    }

    public static User getUser(Integer key){
        return userMap.get(key);
    }

    public static User getUser(int key) {
        return getUser(new Integer(key));
    }

    public User finder(int key){
        User user = getUser(key);
        if(user == null){
            addUser(user);
        }
        return user;
    }
}
