package com.fiap.challenger.food.infraestruture.in;

import com.fiap.challenger.food.application.domain.model.form.ClienteFormDto;
import com.fiap.challenger.food.application.domain.service.RegistreClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class ClienteController {

    private final RegistreClienteService registreClienteService;

    @Autowired
    public ClienteController(RegistreClienteService registreClienteService) {
        this.registreClienteService = registreClienteService;
    }

    @PostMapping(path = "/registre")
    @Transactional
    public ResponseEntity<HttpStatus> create(@RequestBody ClienteFormDto clienteFormDto) {
        return registreClienteService.registre(clienteFormDto);
    }

}
