package dto;

import enums.GeneralStatus;
import enums.ProfileRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Profile {
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private String password;
    private LocalDateTime created_date;
    private GeneralStatus status;
    private ProfileRole role;

}
