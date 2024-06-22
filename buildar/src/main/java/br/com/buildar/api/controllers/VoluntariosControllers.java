package br.com.buildar.api.controllers;
import br.com.buildar.api.models.Voluntarios;
import br.com.buildar.api.repositories.VoluntariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntario")
public class VoluntariosControllers {

    @Autowired
    private VoluntariosRepository voluntariosRepository;

    //GET
    @CrossOrigin
    @GetMapping("/")
    public List<Voluntarios> findAllRecords(){return voluntariosRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public Voluntarios criar (@RequestBody Voluntarios voluntarios) {return voluntariosRepository.save(voluntarios);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody Voluntarios voluntarios){
        if(voluntarios.getIdVoluntario()>0){
            voluntariosRepository.save(voluntarios);
            return "Editado com sucesso";
        }
        return "Voluntario não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Voluntarios voluntarios){
        if(voluntarios.getIdVoluntario()>0){
            voluntariosRepository.delete(voluntarios);
            return "Voluntario deletado com sucesso";
        }
        return "Voluntario não encontrado";
    }
}
