package service;

import dto.Profile;
import repository.ProfileRepository;

public class ProfileService {
    ProfileRepository profileRepository = new ProfileRepository();

    public void registrationService(Profile profile) {
        // check phone
        //check password
        if (profileRepository.initProfileRepository(profile)) {
            System.out.println("Success");
        }
    }


}
