package hms.mchoice.user.Repository;

import hms.mchoice.user.Domain.User;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 * Created by kapila on 9/4/15.
 */
public class UserRepositoryImpl implements UserRepository {
    private Statement statement=null;
    private Connection connection =null;
    private ResultSet resultSet = null;

    public UserRepositoryImpl() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String password = "admin";
            String user = "root";
            String url = "jdbc:mysql://localhost/";
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            System.out.println("Couldn't make the connection with the database");
        }
    }

    public List viewAll(){
        List<User> userList = new ArrayList<User>();
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from registration.users");

            while(resultSet.next()){
                User user =  new User();
                user.setFirstName(resultSet.getString("first_name"));
                user.setMiddleName(resultSet.getString("secand_name"));
                user.setAge(resultSet.getInt("age"));
                user.setUserId(resultSet.getInt("user_id"));

                userList.add(user);
            }
        }catch (Exception e) {
            System.out.println(e +" Cannot retrieve data");
        }
        return  userList;
    }
    public void addUser(User user){
        String firstName = user.getFirstName();
        String middleName = user.getMiddleName();
        int age = user.getAge();
        System.out.println( firstName+ " " +middleName  + " " +age );
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO registration.users(first_name,secand_name,age) VALUES ('" +
                    firstName + "','" + middleName + "'," + age + ")");
            //book.setBookId(findByName(bookName).getBookId());
        }catch (Exception e) {
            System.out.println(e+" Cannot insert data");
        }
    }
    public void removeUser(User user){}
    public void updateUser(User user){}
}
