package br.com.buildar.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name="voluntarios")
public class Voluntarios {

    @Id
    @Column(name="id_voluntario")
    public int idVoluntario;

    @Column(name="nome_completo_voluntario")
    public String nomeCompletoVoluntario;

    @Column(name="email_voluntario")
    public String emailVoluntario;

    @Column(name="descricao_atividade_voluntariada")
    public String descricaoAtividadeVoluntariada;

    @Column(name="data_disponibilidade_voluntario")
    public Date dataDisponibilidadeVoluntario;

    @Column(name="linkedin_voluntario")
    public String linkedinVoluntario;

    @Column(name="data_hora_cadastro_voluntario")
    public Timestamp dataHoraCadastroVoluntario;

}
//id_voluntario int AI PK
//nome_completo_voluntario varchar(255)
//email_voluntario varchar(255)
//descricao_atividade_voluntariada varchar(500)
//data_disponibilidade_voluntario date
//linkedin_voluntario text
//data_hora_cadastro_voluntario timestamp