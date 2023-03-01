package exerciceone;

import database.DbConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExerciceOne {
    public static void createTable() {
        final String SQL = """
                    CREATE TABLE company(
                        id SERIAL PRIMARY KEY NOT NULL,
                        name TEXT NOT NULL,
                        age INT NOT NULL,
                        address CHAR(50),
                        salary REAL
                    )
                """;

        try {
            Connection connection = new DbConnection().connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("Table created successfull");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
