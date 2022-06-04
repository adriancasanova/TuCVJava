
package tucv.cv.model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class Users  {     
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "password")
    private String password;
    
     @Getter @Setter @Column(name = "nombre")
    private String nombre;
     
      @Getter @Setter @Column(name = "apellido")
    private String apellido;
}

