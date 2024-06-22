package br.com.buildar.api.controllers;

import br.com.buildar.api.models.Usuarios;
import br.com.buildar.api.models.VoluntarioStatus;
import br.com.buildar.api.repositories.VoluntarioStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status-voluntario")
public class VonlutarioStatusControllers {

    @Autowired
    private VoluntarioStatusRepository voluntarioStatusRepository;

    //GET
    @CrossOrigin
    @GetMapping("/")
    public List<VoluntarioStatus> findAllRecords(){return voluntarioStatusRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public VoluntarioStatus criar (@RequestBody VoluntarioStatus voluntarioStatus) {return voluntarioStatusRepository.save(voluntarioStatus);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody VoluntarioStatus voluntarioStatus){
        if(voluntarioStatus.getIdStatusVoluntario()>0){
            voluntarioStatusRepository.save(voluntarioStatus);
            return "Status do voluntario Editado com sucesso";
        }
        return "Voluntario não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody VoluntarioStatus voluntarioStatus){
        if(voluntarioStatus.getIdStatusVoluntario()>0){
            voluntarioStatusRepository.delete(voluntarioStatus);
            return "Status do voluntario deletado com sucesso";
        }
        return "Voluntario não encontrado";
    }
}
