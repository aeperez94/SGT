/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Daos.HistoriaClinicaDao;
import Daos.PacienteDao;
import Entidades.HistoriaClinica;
import Entidades.Paciente;
import Entidades.Plan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Indra-FRU
 */
public class admPaciente {
    
public PacienteDao pdao = new PacienteDao();
public Paciente paciente1 = new Paciente();
public HistoriaClinica hc = new HistoriaClinica();
public HistoriaClinicaDao hcdao = new HistoriaClinicaDao();

    public List<Paciente> pacientes(){
        List<Paciente> mostrar = new ArrayList<Paciente>();
        mostrar = pdao.getList();
        return mostrar;
    }

    public void insertarPaciente(String nombre, String apellido, Long dni, String telefono, String mail, Plan plan)
    {
        //SETEO LOS DATOS EN LOS OBJETOS            
            //hc.setIdPaciente(paciente1);
            hc.setNombre(" ");
            paciente1.setApellido(apellido);
            paciente1.setNombre(nombre);
            paciente1.setIdPlan(plan.getIdPlan());
            paciente1.setMail(mail);
            paciente1.setTelefono(telefono);
            paciente1.setDni(dni);
        
        //GUARDO LOS DATOS GENERANDO UN REGISTRO EN LA BASE
        pdao.save(paciente1);
        hc.setIdPaciente(paciente1.getIdPaciente());
        hcdao.save(hc);
    }
    
    public void UpdatePaciente(Long id, String nombre, String apellido, Long dni, String telefono, String mail, Plan plan)
    {
        //SETEO LOS DATOS EN LOS OBJETOS            
            paciente1.setIdPaciente(id);
            paciente1.setApellido(apellido);
            paciente1.setNombre(nombre);
            paciente1.setIdPlan(plan.getIdPlan());
            paciente1.setMail(mail);
            paciente1.setTelefono(telefono);
            paciente1.setDni(dni);
        
        //GUARDO LOS DATOS GENERANDO UN REGISTRO EN LA BASE
        pdao.update(paciente1);
    
    }
    
    public void eliminarPaciente(Paciente pac){
    
        pdao.delete(pac);
    }

    public admPaciente() {
    }
    
}
