package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="Campo nome é obrigatório.")
    private String nome;

    @NotNull(message="Campo restrição de idade é obrigatório.")
    private boolean restricaoIdade;

    @OneToMany
    private List<Serie> seriesFavoritas;

    @OneToMany
    private List<Filme> filmesFavoritos;
}
