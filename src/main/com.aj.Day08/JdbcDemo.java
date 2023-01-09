import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String sql = "select * from table where id = ?";
        Jdbcutil(sql);
    }
    public static void Jdbcutil(String sql){
        String url = "";
        String username = "";
        String password = "";
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setObject(1,1001);
            resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
            resultSet.getObject("id");
            resultSet.getObject("name");
        }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

    }
}
