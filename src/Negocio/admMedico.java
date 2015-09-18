/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.MedicoDao;
import Entidades.Medico;
import Presentacion.PanelMedico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Indra-FRU
 */
public class admMedico {
    
    private MedicoDao mDao = new MedicoDao();
    public PanelMedico panelMedicoGral = new PanelMedico();
    public static Long matriculaStatic;

    
    public List<Medico> listarMedicos(){
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = mDao.getList();
        return medicos;
    }
    
    
    public void loginMedico(Long dni, Long mat){
        
        Boolean valUser = false;
        Boolean valPass = false;
        
        matriculaStatic=mat;
        
        for(int i=0; i<listarMedicos().size(); i++){
            if(listarMedicos().get(i).getDni() == dni && listarMedicos().get(i).getIdMedMatr() == mat ){
                valUser = true;
                valPass = true;
            }
            }
        
        if(valUser.equals(true) && valPass.equals(true)){
            panelMedicoGral.setVisible(true);
            
        }
        }
    
        
    
    

    public admMedico() {
    }
    
}
