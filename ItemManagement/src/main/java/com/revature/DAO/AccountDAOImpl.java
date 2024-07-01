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
            String sql = "INSERT INTO Account (username, password) VALUES (?, ?) RETURNING *";

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

    //login to account
    public Account loginValidate(Account account) {
            String sql = "SELECT * FROM account WHERE username = ? AND password = ?";

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

    // Helper method
    private Account buildAccount (ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setAccount_id(rs.getInt("a_id"));
        account.setUsername(rs.getString("username"));
        account.setPassword(rs.getString("password"));
        account.setRole(rs.getString("role"));

        return account;
    }

}
