package recursos;

import java.util.List;

import entidades.Disciplina;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("disciplina")
public class DisciplinaRecurso {
    @GET
    public List<Disciplina> listar () {
        return Disciplina.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Disciplina disciplina){
        disciplina.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        Disciplina.deleteById(id);
    }
}
