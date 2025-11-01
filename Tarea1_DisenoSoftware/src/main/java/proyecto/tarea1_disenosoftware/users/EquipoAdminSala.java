/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.tarea1_disenosoftware.users;

import java.util.ArrayList;
import java.util.List;
import proyecto.tarea1_disenosoftware.Reporte;
import proyecto.tarea1_disenosoftware.interfaces.GestionSoporte;

/**
 *
 * @author pc
 */
public class EquipoAdminSala implements GestionSoporte {
    
    private List<Reporte> reportesEscalados;

    public EquipoAdminSala() {
        this.reportesEscalados = new ArrayList<>();
    }
     

    @Override
    public void atenderReporte(Reporte reporte) {
        // Lógica para atender reporte escalado
    }

    @Override
    public void escalarReporte(Reporte reporte) {
        // Lógica para re-escalar si es necesario
    }
}