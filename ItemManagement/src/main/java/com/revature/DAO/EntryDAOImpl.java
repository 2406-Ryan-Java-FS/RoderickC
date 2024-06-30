package com.revature.DAO;

//import Model.com.revature.Account;
import Util.ConnectionUtil;
import com.revature.Model.Entry;

import java.sql.*;
// import prepared commands

public class EntryDAOImpl {

//    // create new entry
//    public Entry addEntry(Entry entry) {
//        Connection connection = ConnectionUtil.getConnection();
//        try {
//            String sql = "INSET INTO Entry (posted_by, brand, paint_name, price, time_posted_epoch";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//
//            preparedStatement.setInt(1, entry.getPosted_by());
//            preparedStatement.setString(2, entry.getBrand());
//            preparedStatement.setString(3, entry.getPaint_name());
//            preparedStatement.setDouble(4, entry.getPrice());
//
//            int rowsAffected = preparedStatement.executeUpdate();
//
//            if (rowsAffected == 1) {
//                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
//                if (generatedKeys.next()) {
//                    int entry_id = generatedKeys.getInt(1);
//                    entry.setEntry_id(entry_id);
//                    return entry;
//                }
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
//
//    // view all entries
//
//    // view item by ID
//
//    // update item
//
//    // delete item
//
//    // view items by account_id ??? here or account dao
//
//    //Helper Method
//    private Entry buildEntry(ResultSet rs) throws SQLException {
//        Entry e = new Entry();
////        m.setEntryId(rs.getInt("entryId"));
////        m.setTitle(rs.getString("title"));
////        m.setGenreId(rs.getInt("genre_id"));
////        m.setPrice(rs.getDouble("price"));
////        m.setAvailable(rs.getBoolean("available"));
////        m.setReturnDate(rs.getLong("return_date"));
//
//        return e;
//    }

}
