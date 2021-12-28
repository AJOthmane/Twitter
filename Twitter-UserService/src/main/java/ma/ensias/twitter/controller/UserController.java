package ma.ensias.twitter.controller;

import ma.ensias.twitter.model.LoginForm;
import ma.ensias.twitter.model.SignUpForm;
import ma.ensias.twitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signin")
    public String signin(@RequestBody LoginForm data)
    {
        return userService.SignIn(data);
    }
    @PostMapping("/signup")
    public  Object signup(@RequestBody SignUpForm data)
    {
        return userService.SignUp(data);
    }

}
