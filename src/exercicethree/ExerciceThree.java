package exercicethree;

import database.DbConnection;
import entities.Company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExerciceThree {

    public static List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        final String SQL = "SELECT * FROM company";

        try {
            Connection connection = new DbConnection().connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Company company = new Company(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDouble("salary")
                );
                companies.add(company);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return companies;
    }
}


