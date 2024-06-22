package br.com.buildar.api.controllers;

import br.com.buildar.api.models.Eventos;
import br.com.buildar.api.repositories.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventosControllers {

    @Autowired
    private EventosRepository eventosRepository;

    // GET
    @CrossOrigin
    @GetMapping("/")
    public List<Eventos>findAllRecords(){return eventosRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public Eventos criar (@RequestBody Eventos eventos) {return eventosRepository.save(eventos);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody Eventos eventos){
        if(eventos.getIdEvento()>0){
            eventosRepository.save(eventos);
            return "Evento editado com sucesso";
        }
        return "Evento não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Eventos eventos){
        if(eventos.getIdEvento()>0){
            eventosRepository.delete(eventos);
            return "Evento deletado com sucesso";
        }
        return "Evento não encontrado";
    }

}
