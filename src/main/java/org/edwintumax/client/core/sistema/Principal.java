package org.edwintumax.client.core.sistema;
import java.util.Date;
import java.util.List;
import org.edwintumax.client.core.sw.Alumno;
import org.edwintumax.client.core.sw.AlumnoServiceWS;
import org.edwintumax.client.core.sw.AlumnoServiceWSImplService;
public class Principal {
    public static void main(String args[]){
        System.out.println("Ejecutando transacciona a WS");
        AlumnoServiceWS alumnoSW = new AlumnoServiceWSImplService().getAlumnoServiceWSImplPort();
        //Alumno nuevo = alumnoSW.encontrarAlumnoPorId(1L);
        
        for (Alumno alumno : alumnoSW.encontrarAlumnoPorCarne("2018001")) {
            System.out.println("Alumno: " + alumno.getCarne() + " " + alumno.getApellidos() + " " + alumno.getNombres() );
        }
        //System.out.println("Alumno: " + nuevo.getApellidos() + " " + nuevo.getNombres());
        System.out.println("Fin de la ejecucion");
    }
}
