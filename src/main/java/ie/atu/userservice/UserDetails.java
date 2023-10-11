package ie.atu.userservice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }
}
