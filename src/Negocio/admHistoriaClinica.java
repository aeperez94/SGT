/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.HistoriaClinicaDao;
import Entidades.HistoriaClinica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Indra-FRU
 */
public class admHistoriaClinica {
    
    private HistoriaClinicaDao hcDao = new HistoriaClinicaDao();
    HistoriaClinica hcGral = new HistoriaClinica();
    
    public List<HistoriaClinica> listarHC(){
        List<HistoriaClinica> historias = new ArrayList<HistoriaClinica>();
        historias = hcDao.getList();
        return historias;
    }
    
    public void atcHc(String texto, Long indexHC, Long indexPa){

        hcGral.setIdHistoriaClinica(indexHC);
        hcGral.setIdPaciente(indexPa);
        hcGral.setNombre(texto);
        System.out.println(indexHC+"---"+indexPa+"----"+texto);
        hcDao.update(hcGral);
        JOptionPane.showMessageDialog(null, "Ha actualizado la historia clinica", "HISTORIA CLINICA ACTUALIZADA", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public admHistoriaClinica() {

    }
    
}
