import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme","root","14036895714");


            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT * FROM ogrenci");
            while (resultSet.next()){
                System.out.println(resultSet.getString("ogrenci_no" ) + " , " +  resultSet.getString("ogrenci_ad") + " " +resultSet.getString("ogrenci_soyad"));

            }

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
