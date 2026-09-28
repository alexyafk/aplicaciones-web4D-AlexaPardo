package mx.edu.utez.proyecto1D.Controller;

import jakarta.validation.Valid;
import mx.edu.utez.proyecto1D.Controller.dto.RequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/my-services")
public class MyController {

    @GetMapping
    public String miprimerservicio() {
        System.out.println("holamundo");
        return "hello world";
    }

    @GetMapping("/segundoservicio")
    public String serviciodos() {
        return "este es mi segundo serv bots";
    }

    @PostMapping
    public String servtres() {
        return "tercer servicio bots";
    }

    @GetMapping("/pathVariable/{id}")
    public String pathvariable(@PathVariable String id) {
        System.out.println("el id es:" + id);
        return "el id es: " + id;
    }

    @PostMapping("/request-body")
    // response entity es una clase q me permite personalizar la respuesta que se manda al cliente
    public ResponseEntity<RequestBodyDTO> requetsbody(@RequestBody @Valid RequestBodyDTO payload) {
        System.out.println(payload.getNombre());
        System.out.println(payload.getEdad());
        System.out.println(payload.getCorreo());

        return ResponseEntity
                .status(201)
                .body(payload);
    }
}
