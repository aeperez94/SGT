/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.TurnoDao;
import Entidades.Turno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fede
 */
public class admTurno {
    
    private TurnoDao tDao = new TurnoDao();
    
    public List<Turno> mostrarTurnos(){
        List<Turno> mostrar = new ArrayList<Turno>();
        mostrar = tDao.getList();
        return mostrar;
    }

    public admTurno() {
    }
    
    
    public void actualizarEstado(Long idTurno, String estado){
    
    
        
    }  
}
