package br.com.buildar.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pagamento_status")
public class PagamentoStatus {

    @Id
    @Column(name="id_status_pagamento")
    public int idStatusPagamento;

    @Column(name="id_pagamento")
    public int id_pagamento;

    @Column(name="status_pagamento")
    public boolean statusPagamento;
}
//id_status_pagamento int AI PK
//id_pagamento int
//status_pagamento
