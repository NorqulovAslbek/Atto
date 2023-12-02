package service;

import controller.AdminController;
import controller.UserController;
import db.Database;
import dto.Profile;
import enums.GeneralStatus;
import enums.ProfileRole;
import repository.ProfileRepository;
import util.MD5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProfileService {
    ProfileRepository profileRepository = new ProfileRepository();
    AdminController adminController = new AdminController();
    UserController userController = new UserController();

    public void registrationService(Profile profile) {
        // check phone
        //check password
        if (profileRepository.initProfileRepository(profile)) {
            System.out.println("Success");
        } else {
            System.out.println("bunday foydalanuvchi mavjud!");
        }
    }

    public void getByPhoneAndPassword(String phone, String password) {

        try (Connection connection = Database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM profile");
            while (rs.next()) {
                if (rs.getString("phone").equals(phone) || rs.getString("password").equals(MD5.getMD5Password(password))) {
                    Profile profile = new Profile();
                    profile.setId(rs.getInt("id"));
                    profile.setName(rs.getString("name"));
                    profile.setSurname(rs.getString("surname"));
                    profile.setPassword(rs.getString("password"));
                    profile.setPhone(rs.getString("phone"));
                    profile.setCreated_date(LocalDateTime.parse(rs.getString("created_date"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS")));
                    profile.setRole(ProfileRole.valueOf(rs.getString("role")));
                    profile.setStatus(GeneralStatus.valueOf(rs.getString("status")));
                    if (profile.getRole().name().equals("ADMIN")) {
                        adminController.start(profile);
                    } else {
                        userController.start(profile);
                    }
                    return;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
