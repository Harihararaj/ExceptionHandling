package com.company;

import java.sql.*;

public class HandlingExceptionUsingTryCatchAndFinally {
    //Using Try catch and finally block
    //And handling Hecked Exceptions
    public static void main(String[] args)  {
        Statement stm = null;
        try {
            Class.forName("org.sqlite.JDBC");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Iam finally and i will execute always");
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:reference9.db");
        } catch (SQLException throwables) {
            System.out.println(throwables);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                System.out.println(throwables);
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
            finally {
                System.out.println("Database is closed");
            }
            System.out.println("I am next finally");
        }

    }
}
