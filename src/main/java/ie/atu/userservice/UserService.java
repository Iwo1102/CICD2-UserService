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

    public void registerUser(String Username, String email) {
        emailService.sendEmail(email, "Welcome to our platform");
    }
}
