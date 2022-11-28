package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@Entity
public class Conta {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="Campo nome é obrigatório.")
    private String nomeCompleto;

    @NotEmpty(message="Campo data de nascimento é obrigatório.")
    private String dataNascimento;

    @Email
    @NotEmpty(message="Campo e-mail é obrigatório.")
    private String email;

    @NotEmpty(message="Campo senha é obrigatório.")
    private String senha;

    @CPF
    @NotEmpty(message="Campo cpf é obrigatório.")
    private String cpf;

    @OneToMany
    private List<Perfil> perfil;

    @OneToOne
    private FormaPagamento formaPagamento;

    @OneToOne
    private Plano plano;

    @OneToOne
    private Cep cep;
}
