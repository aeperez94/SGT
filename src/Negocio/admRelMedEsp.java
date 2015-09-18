/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

import Daos.RelMedEspDao;
import Entidades.RelMedEsp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public class admRelMedEsp {

    private RelMedEspDao relDao = new RelMedEspDao();
    
    public List<RelMedEsp> mostrarRelacion(){
        List<RelMedEsp> mostrar = new ArrayList<RelMedEsp>();
        mostrar = relDao.getList();
        return mostrar;
    }
    
    
    public admRelMedEsp() {
    }
    
}
