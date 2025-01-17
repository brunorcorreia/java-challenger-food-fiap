package com.fiap.challenger.food.application.domain.model;

import com.fiap.challenger.food.application.domain.model.form.ClienteFormDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int age;
    private String mail;

    private String document;

    public Cliente() {}

    public Cliente(Long id, String name, int age, String mail, String document) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.document = document;
    }

    public Cliente(ClienteFormDto clienteFormDto) {
        this.name = clienteFormDto.getName();
        this.age = clienteFormDto.getAge();
        this.mail = clienteFormDto.getMail();
        this.document = clienteFormDto.getDocument();
    }
    public String getMail() {
        return mail;
    }

}
