package com.revature.DAO;

//import Model.com.revature.Account;
//import Util.ConnectionUtil;
//import com.revature.Util.ConnectionUtil;

// import prepared commands

public class AccountDAO {

    //create account
//    public Account addUser(String username, String password) {
//        Connection connection = ConnectionUtil.getConnection();
//        try {
//            String sql = "INSERT INTO Account (username, password) VALUES (?, ?)";
//
//            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1, account.getUsername());
//            preparedStatement.setString(2, account.getPassword());
//
//            preparedStatement.executeUpdate();
//
//            ResultSet rs = preparedStatement.getGeneratedKeys();
//            while (rs.next()) {
//                int generated_account_id = (int) rs.getLong(1);
//                return new Account(generated_account_id, account.getUsername(), account.getPassword());
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
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

}
