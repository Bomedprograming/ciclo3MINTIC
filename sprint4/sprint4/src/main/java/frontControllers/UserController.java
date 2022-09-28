package frontControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/crear-usuario")
    public String createUser() {
        return "crear-usuario";
    }

    @GetMapping("/usuarios")
    public String getUsers(){
        return "usuarios";
    }
}
