package ma.ensias.twitter.services;

import ma.ensias.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialGraphService {

    @Autowired
    UserRepository userRepository;

    public String follow(int idUser)
    {
      return "Message from Social graph -- Fonction : follow ";
    }
    

}
