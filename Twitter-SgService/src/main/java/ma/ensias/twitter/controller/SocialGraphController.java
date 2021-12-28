package ma.ensias.twitter.controller;


import ma.ensias.twitter.services.SocialGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SocialGraphController {

    @Autowired
    SocialGraphService socialGraphService;

    @GetMapping("/follow/{idUser}")
    public String signin(@PathVariable int idUser)
    {
        return socialGraphService.follow(idUser);
    }
    

}
