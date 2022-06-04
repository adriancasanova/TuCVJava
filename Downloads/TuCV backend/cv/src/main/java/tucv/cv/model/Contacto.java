/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tucv.cv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String name;    
     private String mail; 
      private String subject; 
     private String body;     
     
    
     
   

    public Contacto(long id, String name, String mail, String subject, String body) {
        this.id = id;
        this.name = name;        
        this.mail = mail;
        this.subject = subject;
        this.body = body;  
    }
     
    public Contacto() {
    }     
}
