package net.javaguides.springboot.controller;

import net.javaguides.springboot.domain.User;
import net.javaguides.springboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// STATELESS -> apirest. a cada nova requisição, eu recebo todas as novas informações para fazer a nova funcionalidade
// que o cliente está pedindo -> token de identificação usado a cada requisição | STATEFULL -> mantém o estado de cada cliente
// Nesse código abaixo, RestController escuta todas as requisições que chegar na rota hello-world


@RestController //Controller e ResponseBody
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head

    @Autowired
    private HelloWorldService helloWorldService;



    // public HelloWorldController(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // } Inves disso, usa o @Autowired

    // se a linha abaixo fosse @GetMapping("/get"), a URL seria acessada por /hello-world/get
    @GetMapping // METODO GET
    public String helloWorld() {
        return helloWorldService.helloWorld("Lívia");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World Post" + body.getName();
    }
}
