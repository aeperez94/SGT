/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.AdministradorDao;
import Entidades.Administrador;
import Presentacion.LoginMedico;
import Presentacion.PanelAdmin;
import Presentacion.RootLogin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Indra-FRU
 */
public class admAdministrador {
    
    String nivel;
    
    private AdministradorDao admDao = new AdministradorDao();
    public PanelAdmin pa = new PanelAdmin();
    public LoginMedico loginMed = new LoginMedico();
    
    public List<Administrador> listarAdmins(){  
    List<Administrador> listar = new ArrayList<Administrador>();
    listar = admDao.getList();
    return listar;
    }
    
    Iterator<Administrador> it = listarAdmins().iterator();
    
    public void validarLogueo (String user, String pass){

        Boolean valUser = false;
        Boolean valPass = false;
        
        for(int i=0; i < listarAdmins().size(); i++){
            if(listarAdmins().get(i).getUsuario().equals(user) && listarAdmins().get(i).getClave().equals(pass) ){
                valUser = true;
                valPass = true;
                nivel = listarAdmins().get(i).getNivel();             
            }
        }
        
        if(valUser.equals(true) && valPass.equals(true)){
            
            switch(nivel.toUpperCase()){
                
                case "ADMIN":
                    
                    pa.setVisible(true);
                    //System.out.println("INSTANCIO PANTALLA DE ADMIN(RECEPCION)- (PUEDE HACER TODAS LAS FUNC DE PAC, TODAS LAS DE TURNOS, GEN RECOR DE TURNO X MAIL y MANDAR LISTADOR DE TURNOS POR MAIL A LOS MEDICOS)");
                    break;
                case "USER":
                    System.out.println("INSTANCION PANTALLA DE USER PARA REG TURNO CAN TURNO ACT TURNO MOS TUR. SERIA MENU DISPENSER");
                    break;
                case "SADMIN":
                    System.out.println("INSTANCION PANTALLA DE SUPER ADMIN PUEDE HACER TODOS LOS C.U.");
                default:
                    loginMed.setVisible(true);
                    break;     
            }
                         
        }else{
        
          JOptionPane.showMessageDialog(null, "Datos de ingreso erroneos", "Error #001", JOptionPane.ERROR_MESSAGE);
          RootLogin rl = new RootLogin();
          rl.setVisible(true);
          
        
        }
        
    }

    public admAdministrador() {
    }
    
 
}
    

