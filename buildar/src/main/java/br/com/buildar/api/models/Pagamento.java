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
@Table(name="pagamento")
public class Pagamento {

    @Id
    @Column(name="id_pagamento")
    public int idPagamento;

    @Column(name="id_usuario")
    public int idUsuario;

    @Column(name="numero_cartao")
    public String numeroCartao;

    @Column(name="cvv_cartao")
    public int cvvCartao;

    @Column(name="data_validade_cartao")
    public Date dataValidadeCartao;

    @Column(name="nome_cartao")
    public String nomeCartao;

    @Column(name="data_hora_pagamento")
    public Timestamp dataHoraPagamento;

}
//id_pagamento int AI PK
//id_usuario int
//numero_cartao varchar(19)
//cvv_cartao int
//data_validade_cartao date
//nome_cartao varchar(255)
//data_hora_pagamento timestamp
