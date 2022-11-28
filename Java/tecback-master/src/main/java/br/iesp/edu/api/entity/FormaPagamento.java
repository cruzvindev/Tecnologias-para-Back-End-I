package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
public class FormaPagamento {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="Campo forma de pagamento é obrigatório.")
    private String formaPagamento;
}
