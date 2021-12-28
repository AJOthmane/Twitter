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
public class Tweet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Content;
    @ManyToMany
    private Set<HashTag> hashTags;
    @ManyToOne
    private User author;
    @OneToMany
    private Set<Comment> comments;
    private Date dateOfCreation;

}
