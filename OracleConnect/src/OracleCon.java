import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleCon {
    public static void main(String[] args) {
        try {
            // Adım 1 sürücü sınıfını yükle
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Adım 2 Bağlantı nsenesini oluştur
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

            // Adım 3 İfade nesnesini yarat
            Statement statement = connection.createStatement();

            // Adım 4 Sorguyu Yürüt
            ResultSet resultSet = statement.executeQuery("select*from emp");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + resultSet.getInt(2) + resultSet.getInt(3));
            }
            // Adım 5 Bağlantı nesnesini kapat
            connection.close();
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
