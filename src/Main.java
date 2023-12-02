import controller.ProfileController;
import db.Database;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database.initTable();
        ProfileController profileController=new ProfileController();
        profileController.start();
    }
}