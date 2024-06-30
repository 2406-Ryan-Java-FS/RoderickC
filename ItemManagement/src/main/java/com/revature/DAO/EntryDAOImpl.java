package com.revature.DAO;

import com.revature.Model.Entry;
import com.revature.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// import prepared commands

public class EntryDAOImpl implements EntryDAO {

    public static Connection connection = ConnectionUtil.getConnection();

    // create new entry
    @Override
    public Entry addEntry(Entry entry) {

        String sql = "INSERT INTO paint (brand, paint_name, price, size) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, entry.getBrand());
            ps.setString(2, entry.getPaint_name());
            ps.setDouble(3, entry.getPrice());
            ps.setString(4, entry.getSize());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildPaint(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
    }

    @Override
    public List<Entry> getAllEntry() {
        String sql = "SELECT * FROM paint";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Entry> entries = new ArrayList<>();

            while (rs.next()) {
                entries.add(buildPaint(rs));
            }
            return entries;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Entry getEntry(int id) {
        String sql = "SELECT * FROM paint WHERE _id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildPaint(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

        //Helper Method
        private Entry buildPaint (ResultSet rs) throws SQLException {
            Entry entry = new Entry();
//            entry.setEntry_id(rs.getInt("entry_id"));
            entry.setBrand(rs.getString("brand"));
            entry.setPaint_name(rs.getString("paint_name"));
            entry.setPrice(rs.getDouble("price"));
            entry.setSize(rs.getString("size"));

            return entry;
        }
}
