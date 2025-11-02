/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.tarea1_disenosoftware.users;

import java.util.List;
import proyecto.tarea1_disenosoftware.Boleto;
import proyecto.tarea1_disenosoftware.Reporte;

/**
 *
 * @author pc
 */
public class Usuario {
    
    private List<Boleto> boletos;
    private List<Reporte> reportes;
    private String correo;


    public Usuario() {
    }

    
    public Usuario(List boletos, List reportesGenerados) {
        this.boletos = boletos;
        this.reportes = reportesGenerados;
    }
    

    public List getBoletos() {
        return boletos;
    }

    public void setBoletos(List boletos) {
        this.boletos = boletos;
    }

    public List getReportesGenerados() {
        return reportes;
    }

    public void setReportesGenerados(List reportesGenerados) {
        this.reportes = reportesGenerados;
    }
    public String getCorreo() {
    return this.correo;
    }

    
}