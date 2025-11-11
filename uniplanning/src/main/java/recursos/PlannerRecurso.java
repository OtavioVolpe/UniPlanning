package recursos;

import java.util.List;

import entidades.Planner;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("planner")
public class PlannerRecurso {
    @GET
    public List<Planner> listar(){
        return Planner.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Planner planner){
        planner.persist();
    }
}
