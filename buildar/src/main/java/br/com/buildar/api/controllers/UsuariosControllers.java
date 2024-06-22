package br.com.buildar.api.controllers;


import br.com.buildar.api.models.Usuarios;
import br.com.buildar.api.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // api do tipo rest
@RequestMapping("/usuario")
public class UsuariosControllers {

    @Autowired
    private UsuariosRepository usuariosRepository;

    // GET(pegar), POST(criar), PUT(editar), DELETE(deletar) - vão gerar ações no banco de dados

    //GET
    @CrossOrigin
    @GetMapping("/")
    public List<Usuarios> findAllRecords(){return usuariosRepository.findAll();}

    //POST
    @CrossOrigin
    @PostMapping("/criar")
    public Usuarios criar (@RequestBody Usuarios usuarios) {return usuariosRepository.save(usuarios);}

    //PUT
    @CrossOrigin
    @PutMapping ("/editar")
    public String editar (@RequestBody Usuarios usuarios){
        if(usuarios.getIdUsuario()>0){
            usuariosRepository.save(usuarios);
            return "Editado com sucesso";
        }
        return "Usuário não encontrado";
    }

    //DELETE
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Usuarios usuarios){
        if(usuarios.getIdUsuario()>0){
            usuariosRepository.delete(usuarios);
            return "Usuário deletado com sucesso";
        }
        return "Usuário não encontrado";
    }
}
