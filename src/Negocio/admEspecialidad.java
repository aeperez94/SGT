/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

import Daos.EspecialidadDao;
import Entidades.Especialidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public class admEspecialidad {
    
EspecialidadDao edao = new EspecialidadDao();
    
    public List<Especialidad> especialidades(){
        List<Especialidad> mostrar = new ArrayList<Especialidad>();
        mostrar = edao.getList();
        return mostrar;
    }
}
