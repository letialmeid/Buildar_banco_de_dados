package br.com.buildar.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;
@Data // novo getter and setter virtualmente
@Entity
@Table(name="usuarios")
public class Usuarios {

    @Id
    @Column(name = "id_usuario")
    public int idUsuario;

    @Column(name = "nome_usuario")
    public String nomeUsuario;

    @Column(name = "username_usuario")
    public String usernameUsuario;

    @Column(name = "email_usuario")
    public String emailUsuario;

    @Column(name = "senha_usuario")
    public String senhaUsuario;

    @Column(name = "data_hora_cadastro_usuario")
    public Timestamp dataHoraCadastroUsuario;


}
//id_usuario int AI PK
//nome_usuario varchar(100)
//username_usuario varchar(20)
//email_usuario varchar(255)
//senha_usuario varchar(20)
//data_hora_cadastro_usuario timestamp