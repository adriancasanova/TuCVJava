/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tucv.cv.service;


import tucv.cv.model.Contacto;
import tucv.cv.repository.ContactoRepository;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    public ContactoRepository contactoRepo; 
    
   //  @Autowired
 //   private JavaMailSender javaMailSender;
    
    @Override
    public List<Contacto> verContacto() {
       return contactoRepo.findAll();
    }

    @Override
    public void agregarContacto(Contacto cont) {
    contactoRepo.save(cont);
    }

    @Override
    public void borrarContacto(Long id) {
     contactoRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
         return contactoRepo.findById(id).orElse(null);
    }

    @Override
  public void editarContacto (Contacto cont){
  contactoRepo.save(cont);
  }
  
  /* public void sendMail(String from, String to, String subject, String body) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setFrom(from);
        mail.setTo(to);
        mail.setSubject(subject);
        mail.setText(body);

        javaMailSender.send(mail);
    } */
  
    
  
}
