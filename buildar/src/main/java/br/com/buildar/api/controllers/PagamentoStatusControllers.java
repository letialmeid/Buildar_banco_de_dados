package br.com.buildar.api.controllers;

import br.com.buildar.api.models.PagamentoStatus;
import br.com.buildar.api.repositories.PagamentoStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status-pagamento")
public class PagamentoStatusControllers {

    @Autowired
    private PagamentoStatusRepository pagamentoStatusRepository;

    //GET
    @CrossOrigin
    @GetMapping("/")
    public List<PagamentoStatus> findAllRecords(){return pagamentoStatusRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public PagamentoStatus criar (@RequestBody PagamentoStatus pagamentoStatus) {return pagamentoStatusRepository.save(pagamentoStatus);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody PagamentoStatus pagamentoStatus){
        if(pagamentoStatus.getIdStatusPagamento()>0){
            pagamentoStatusRepository.save(pagamentoStatus);
            return "Status do pagamento Editado com sucesso";
        }
        return "Pagamento não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody PagamentoStatus pagamentoStatus){
        if(pagamentoStatus.getIdStatusPagamento()>0){
            pagamentoStatusRepository.delete(pagamentoStatus);
            return "Status do pagamento deletado com sucesso";
        }
        return "Pagamento não encontrado";
    }
}
