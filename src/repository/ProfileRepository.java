package repository;

import db.Database;
import dto.Profile;
import util.MD5;

import java.sql.*;

public class ProfileRepository {


    public boolean initProfileRepository(Profile profile) {
        try (Connection con = Database.getConnection()) {
            String sql = "Insert into profile (name,surname,phone,password,created_date,status,role) values (?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, profile.getName());
            preparedStatement.setString(2, profile.getSurname());
            preparedStatement.setString(3, profile.getPhone());
            preparedStatement.setString(4, MD5.getMD5Password(profile.getPassword()));
            preparedStatement.setTimestamp(5, Timestamp.valueOf(profile.getCreated_date()));
            preparedStatement.setString(6, String.valueOf(profile.getStatus()));
            preparedStatement.setString(7, String.valueOf(profile.getRole()));
            return preparedStatement.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
