import java.sql.*;
import java.util.Scanner;

public class Connect {
    public static void main(String[] args) throws SQLException {

       // Bağlantı oluştur
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3325/car?user=root&password=14036895714");
       // Ifade oluştur
        Statement statement = connection.createStatement();

        Scanner input = new Scanner(System.in);
        System.out.print("Araba adı :");
        String name = input.nextLine();
        System.out.print("Araba Hızı:");
        int speed = input.nextInt();

      /*
       String query = "INSERT INTO cars (cars_name,cars_sped) VALUES ('" + name + "'," + speed + ")";
       int sonuc = statement.executeUpdate(query);
       System.out.println(sonuc);
       statement.close();
      */


      /*
        String query = "INSERT INTO cars (cars_name,cars_speed) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,speed);
        preparedStatement.executeUpdate();
        statement.close();
      */
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cars");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("cars_id") + "-" + resultSet.getString("cars_name")
                    + "-" + resultSet.getInt("cars_speed"));
        }
        statement.close();
    }
}
