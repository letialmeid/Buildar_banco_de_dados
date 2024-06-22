package br.com.buildar.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="voluntario_status")
public class VoluntarioStatus {

    @Id
    @Column(name="id_status_voluntario")
    public int idStatusVoluntario;

    @Column(name="id_voluntario")
    public int idVoluntario;

    @Column(name="status_voluntario")
    public boolean statusVoluntario;

}
//id_status_voluntario int AI PK
//id_voluntario int
//status_voluntario tinyint(1)