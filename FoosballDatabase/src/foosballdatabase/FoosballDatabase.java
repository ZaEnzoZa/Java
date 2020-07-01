package foosballdatabase;

import java.sql.*;

/**
 *
 * @author Enzo
 */
public class FoosballDatabase {

private static final String CREATE_TABLE_SQL="CREATE TABLE Test ("
                    + "PlayerID INT NOT NULL,"
                    + "Name VARCHAR(45) NOT NULL,"
                    + "Age INT NOT NULL,"
                    + "Matches INT NOT NULL,"
                    + "PRIMARY KEY (PlayerID))";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/foosball?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
               "root", "Faders!41");  
            
            Statement stmt = conn.createStatement(); 
            
            stmt.executeUpdate(CREATE_TABLE_SQL);
            System.out.println("Table Created");
            
//            String strSelect = "CREATE TABLE Player";
//            System.out.println("The SQL statement is: " + strSelect + "\n");
            
//            ResultSet rset = stmt.executeUpdate(strSelect);  
             
        }catch(SQLException e){
        }
    }
}
