package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Getter
@Setter
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="Campo titulo é obrigatório.")
    private String titulo;

    @NotEmpty(message="Campo ano é obrigatório.")
    private String ano;

    @ManyToOne
    @NotEmpty(message="Campo categoria é obrigatório.")
    private Categoria categoria;

    @OneToMany
    private List<Idioma> idioma;

    @OneToOne
    @NotEmpty(message="Campo sinopse é obrigatório.")
    private Sinopse sinopse;
}
