/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tucv.cv.controller;
import tucv.cv.service.IUsersService;
import tucv.cv.model.Users;
import tucv.cv.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
  //@CrossOrigin (origins = "http://localhost:4200")
  @CrossOrigin (origins = "https://tucv-a4ab0.web.app") 
public class AuthController {
    @Autowired
    private IUsersService usuarioDao;  
    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Users usuario) {
        Users usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales (usuario);
        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return tokenJwt;
        }
        return /*"FAIL"*/ null;
    }
}