package ma.ensias.twitter.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    @OneToMany
    private Set<Tweet> listOfPosts;
    @OneToMany
    private Set<Message> messages;
    @ManyToMany
    private Set<User> followers;
    @ManyToMany
    private Set<User> following;
    @ManyToMany
    private Set<Tweet> liked;
    @ManyToMany
    private Set<Tweet> favored;
    @OneToMany
    private Set<Comment> comments;



}
