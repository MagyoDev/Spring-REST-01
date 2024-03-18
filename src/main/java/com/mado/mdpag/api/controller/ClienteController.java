package com.mado.mdpag.api.controller;

import com.mado.mdpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setTelefone("34 99999-1111");
        cliente1.setEmail("joãodascouves@mado.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("11 97777-1111");
        cliente2.setEmail("mariadasilva@mado.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
