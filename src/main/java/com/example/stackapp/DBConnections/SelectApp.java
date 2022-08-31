package com.example.stackapp.DBConnections;

import java.sql.*;

public class SelectApp {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/qwer/eclipse-workspace/stackApp/src/main/resources/com/example/stackapp/DB/stackAppdbv1.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * select all rows in the albums table
     */
    public void selectAll(){
        String sql = "SELECT Albumid, Title, Artistid FROM albums";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("Albumid") +  "\t" +
                        rs.getString("Title") + "\t" +
                        rs.getDouble("Artistid"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Get the Total whose Total greater than a specified Total
     * @param capacity
     */
    public void getCapacityGreaterThan(double capacity){
        String sql = "SELECT Invoiceid, BillingCity, BillingCountry, Total "
                + "FROM invoices WHERE Total > ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){

            // set the value
            pstmt.setDouble(1,capacity);
            //
            ResultSet rs  = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("Invoiceid") +  "\t||" +
                        rs.getString("BillingCity") + "\t          ||" +
                        rs.getString("BillingCountry") + "\t          ||" +
                        rs.getDouble("Total"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllFromDestination(String destination) {
        String sql = "SELECT * FROM "+destination;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql))

        {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) { //Print one row
                for(int i = 1 ; i <= columnsNumber; i++){
                    System.out.print(rs.getString(i) + " "); //Print one element of a row
                }
                System.out.println();//Move to the next line to print the next row.
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

    }

}
