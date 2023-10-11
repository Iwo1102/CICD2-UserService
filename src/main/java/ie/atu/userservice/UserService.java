package ie.atu.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String registerUser(String Username, String email) {
       return emailService.sendEmail(email, " Welcome to our platform");
    }

    public String registerUserBody(UserDetails user) {
        return emailService.sendEmail(user.getEmail(), " Welcome to our platform");
    }

}
