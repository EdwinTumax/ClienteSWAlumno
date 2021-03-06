
package org.edwintumax.client.core.sw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlumnoServiceWS", targetNamespace = "http://service.core.edwintumax.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlumnoServiceWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "eliminarAlumno", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EliminarAlumno")
    @ResponseWrapper(localName = "eliminarAlumnoResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EliminarAlumnoResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/eliminarAlumnoRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/eliminarAlumnoResponse")
    public void eliminarAlumno(
        @WebParam(name = "arg0", targetNamespace = "")
        Alumno arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.edwintumax.client.core.sw.Alumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarAlumnos", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.ListarAlumnos")
    @ResponseWrapper(localName = "listarAlumnosResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.ListarAlumnosResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/listarAlumnosRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/listarAlumnosResponse")
    public List<Alumno> listarAlumnos();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "registrarAlumno", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.RegistrarAlumno")
    @ResponseWrapper(localName = "registrarAlumnoResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.RegistrarAlumnoResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/registrarAlumnoRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/registrarAlumnoResponse")
    public void registrarAlumno(
        @WebParam(name = "arg0", targetNamespace = "")
        Alumno arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "modificarAlumno", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.ModificarAlumno")
    @ResponseWrapper(localName = "modificarAlumnoResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.ModificarAlumnoResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/modificarAlumnoRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/modificarAlumnoResponse")
    public void modificarAlumno(
        @WebParam(name = "arg0", targetNamespace = "")
        Alumno arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.edwintumax.client.core.sw.Alumno
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarAlumnoPorId", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EncontrarAlumnoPorId")
    @ResponseWrapper(localName = "encontrarAlumnoPorIdResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EncontrarAlumnoPorIdResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/encontrarAlumnoPorIdRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/encontrarAlumnoPorIdResponse")
    public Alumno encontrarAlumnoPorId(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.edwintumax.client.core.sw.Alumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarAlumnoPorCarne", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EncontrarAlumnoPorCarne")
    @ResponseWrapper(localName = "encontrarAlumnoPorCarneResponse", targetNamespace = "http://service.core.edwintumax.org/", className = "org.edwintumax.client.core.sw.EncontrarAlumnoPorCarneResponse")
    @Action(input = "http://service.core.edwintumax.org/AlumnoServiceWS/encontrarAlumnoPorCarneRequest", output = "http://service.core.edwintumax.org/AlumnoServiceWS/encontrarAlumnoPorCarneResponse")
    public List<Alumno> encontrarAlumnoPorCarne(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
