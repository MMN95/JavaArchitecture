import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        UserMapperInt mapper = new UserMapper(connection);

        User user = mapper.find(1);

        mapper.insert(user);

        User findUser = mapper.find(1);

        user = new User(user.getUserId(), "Петя", "89078946734");

        mapper.update(user);

        mapper.delete(user);

//        UserMapper.addUser(user);
//        UserMapper.getUser(1);

    }
}
