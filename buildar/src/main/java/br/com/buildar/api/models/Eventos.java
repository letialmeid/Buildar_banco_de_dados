package br.com.buildar.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table
public class Eventos {

    @Id
    @Column(name="id_evento")
    public int idEvento;

    @Column(name="nome_evento")
    public String nomeEvento;

    @Column(name="endereco_evento")
    public String enderecoEvento;

    @Column(name="numero_evento")
    public int numeroEvento;

    @Column(name="data_evento")
    public Date datEvento;

    @Column(name="horario_evento")
    public Time horarioEvento;

}
//id_evento int AI PK
//nome_evento varchar(255)
//endereco_evento varchar(100)
//numero_evento int
//data_evento date
//horario_evento time