package ie.atu.userservice;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String to, String message) {
        return to + message + "\n";
    }
}
