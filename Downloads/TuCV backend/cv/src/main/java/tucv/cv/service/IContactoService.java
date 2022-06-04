/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tucv.cv.service;
import tucv.cv.model.Contacto;
import java.util.List;

import java.util.List;


public interface IContactoService {
      public List <Contacto> verContacto();
    public void agregarContacto (Contacto cont);
    public void borrarContacto (Long id);
    public Contacto buscarContacto (Long id); 
    public void editarContacto (Contacto cont);
   //  public void sendMail(String from, String to, String subject, String body);
 }



