package mx.edu.utez.proyecto1D.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class FibonacciController {

    @GetMapping("/fibonacci/{n}")
    public String fibonacci(@PathVariable int n) {
        int anterior = 0;
        int actual = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(anterior);
            } else if (i == 2) {
                System.out.println(actual);
            } else {
                int siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
                System.out.println(actual);
            }
        }
        return "Alexa Pardo Diaz";
    }
}
