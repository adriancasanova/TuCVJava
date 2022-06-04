/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tucv.cv.controller;
import tucv.cv.model.Contacto;
import tucv.cv.service.IContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tucv.cv.service.ContactoService;
//import tucv.cv.service.MailService;

  @RestController  
// @CrossOrigin (origins = "http://localhost:4200")
  @CrossOrigin (origins = "https://tucv-a4ab0.web.app/")

public class ContactoController {
       @Autowired
private IContactoService educacionServ;  
  //     private IContactoService mailService;
  @PostMapping ("/home/contacto")
  public void agregarContacto (@RequestBody Contacto cont) {
  educacionServ.agregarContacto(cont);
  } 
  @GetMapping ("/home/contacto") 
  @ResponseBody
  public List<Contacto> verContacto() {
 return educacionServ.verContacto();
  }

  @DeleteMapping ("/home/contacto/{id}") 
  public void borrarEducacion (@PathVariable Long id){
  educacionServ.borrarContacto(id);
  }  
  
  @PutMapping ("/home/contacto/{id}")   
   public void editarContacto (@RequestBody Contacto cont) {
  educacionServ.editarContacto(cont);
  } 
  
 
   
}
