package com.exemplo.hibernate.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_registro") // NOME DA TABELA
public class RegistroEntity extends BaseEntity {

    @Column(name = "nome", length = 50) // NOME DA COLUNA E SUAS REFERENCIAS
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
