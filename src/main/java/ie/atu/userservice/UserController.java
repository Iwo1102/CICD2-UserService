package ie.atu.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name,@PathVariable String email) {
        return userService.registerUser(name, email);
    }

    @PostMapping("/registerUserBody")
   // @ResponseStatus(HttpStatus.CREATED)
    public String setUser(@RequestBody UserDetails userDetails) {
        return userService.registerUserBody(userDetails);
    }

}
