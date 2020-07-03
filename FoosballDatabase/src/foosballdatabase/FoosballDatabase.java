package foosballdatabase;

import java.sql.*;

/**
 *
 * @author Enzo
 */
public class FoosballDatabase {

private static final String CREATE_TABLE_SQL="CREATE TABLE Player ("
                    + "PlayerID INT NOT NULL,"
                    + "Name VARCHAR(45) NOT NULL,"
                    + "Age INT NOT NULL,"
                    + "Matches INT NOT NULL,"
                    + "PRIMARY KEY (PlayerID))";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/foosball","root", "Faders!41");  
             
            
            //Create table
//            stmt.executeUpdate(CREATE_TABLE_SQL);
//            System.out.println("Table Created");
            
            String strSelect ="INSERT INTO player (playerID, Name, Age, Matches) "
                            + "VALUES ('6', 'Michael Munnik', '20', '50')";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(strSelect);
            conn.close();
            
//            ResultSet rset = stmt.executeUpdate(strSelect);  
             
        }catch(SQLException e){
        }
    }
}
