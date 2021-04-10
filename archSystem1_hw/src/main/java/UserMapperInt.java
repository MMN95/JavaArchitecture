import java.sql.SQLException;

public interface UserMapperInt {
    User find(int userId) throws SQLException;
    void insert(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(User user) throws Exception;
}
