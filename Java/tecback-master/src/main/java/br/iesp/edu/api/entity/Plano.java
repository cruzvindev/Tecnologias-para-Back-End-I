package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Plano {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="Campo plano é obrigatório.")
    private String plano;

    @NotNull(message="Campo valor é obrigatório.")
    private double valor;
}
