package br.com.buildar.api.controllers;
import br.com.buildar.api.models.Pagamento;
import br.com.buildar.api.models.Usuarios;
import br.com.buildar.api.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoControllers {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    //GET
    @CrossOrigin
    @GetMapping("/")
    public List<Pagamento> findAllRecords(){return pagamentoRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public Pagamento criar (@RequestBody Pagamento pagamento) {return pagamentoRepository.save(pagamento);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody Pagamento pagamento){
        if(pagamento.getIdPagamento()>0){
            pagamentoRepository.save(pagamento);
            return "Editado com sucesso";
        }
        return "Usuário não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Pagamento pagamento){
        if(pagamento.getIdPagamento()>0){
            pagamentoRepository.delete(pagamento);
            return "Usuário deletado com sucesso";
        }
        return "Usuário não encontrado";
    }
}
