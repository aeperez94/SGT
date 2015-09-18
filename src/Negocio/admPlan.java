/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.PlanDao;
import Entidades.Plan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Indra-FRU
 */
public class admPlan {
    
    private PlanDao tDao = new PlanDao();
    
    public List<Plan> plan(){
        List<Plan> mostrar = new ArrayList<Plan>();
        mostrar = tDao.getList();
        return mostrar;
    }
    
    public long numeroPlan (String nombrep)
    {
        long numero = 1;
        for(int i=0; i<plan().size(); i++){
            
            if (plan().get(i).getNombre().equals(nombrep))
            {
                numero = plan().get(i).getIdPlan();
            }
        }
        
        return numero;
    }

    public admPlan() {
    }
    
}
