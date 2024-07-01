package com.revature.DAO;

//import Model.com.revature.Account;
//import Util.ConnectionUtil;
//import com.revature.Util.ConnectionUtil;

// import prepared commands

import com.revature.Model.Account;
import com.revature.Model.Entry;
import com.revature.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAOImpl implements AccountDAO{

    public static Connection connection = ConnectionUtil.getConnection();


    //create account
    @Override
    public Account addUser(Account account) {
            String sql = "INSERT INTO Account (username, password) VALUES (?, ?)";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return buildAccount(rs);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
//
//    //login to account
//    public Account loginValidate(Account account) {
//        Connection connection = ConnectionUtil.getConnection();
//        try {
//            String sql = "SELECT (username, password) FROM Account WHERE username = ? AND password = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setString(1, account.getUsername());
//            preparedStatement.setString(1, account.getPassword());
//
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                return new Account(
//                        rs.getInt("account_id"),
//                        rs.getString("username"),
//                        rs.getString("password")
//                );
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    // Helper method
    private Account buildAccount (ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setUsername(rs.getString("account"));
        account.setPassword(rs.getString("password"));

        return account;
    }

}
