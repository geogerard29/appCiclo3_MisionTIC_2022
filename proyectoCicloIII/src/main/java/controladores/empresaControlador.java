package controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empresaControlador {
    @GetMapping("/pruebita")
    public String hola() {
        return "HOLAAA";
    }
}
