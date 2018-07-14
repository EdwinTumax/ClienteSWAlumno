
package org.edwintumax.client.core.sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edwintumax.client.core.sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EncontrarAlumnoPorCarneResponse_QNAME = new QName("http://service.core.edwintumax.org/", "encontrarAlumnoPorCarneResponse");
    private final static QName _ListarAlumnosResponse_QNAME = new QName("http://service.core.edwintumax.org/", "listarAlumnosResponse");
    private final static QName _EliminarAlumno_QNAME = new QName("http://service.core.edwintumax.org/", "eliminarAlumno");
    private final static QName _ModificarAlumnoResponse_QNAME = new QName("http://service.core.edwintumax.org/", "modificarAlumnoResponse");
    private final static QName _ListarAlumnos_QNAME = new QName("http://service.core.edwintumax.org/", "listarAlumnos");
    private final static QName _EliminarAlumnoResponse_QNAME = new QName("http://service.core.edwintumax.org/", "eliminarAlumnoResponse");
    private final static QName _EncontrarAlumnoPorId_QNAME = new QName("http://service.core.edwintumax.org/", "encontrarAlumnoPorId");
    private final static QName _EncontrarAlumnoPorCarne_QNAME = new QName("http://service.core.edwintumax.org/", "encontrarAlumnoPorCarne");
    private final static QName _RegistrarAlumno_QNAME = new QName("http://service.core.edwintumax.org/", "registrarAlumno");
    private final static QName _EncontrarAlumnoPorIdResponse_QNAME = new QName("http://service.core.edwintumax.org/", "encontrarAlumnoPorIdResponse");
    private final static QName _ModificarAlumno_QNAME = new QName("http://service.core.edwintumax.org/", "modificarAlumno");
    private final static QName _RegistrarAlumnoResponse_QNAME = new QName("http://service.core.edwintumax.org/", "registrarAlumnoResponse");
    private final static QName _Alumno_QNAME = new QName("http://service.core.edwintumax.org/", "alumno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edwintumax.client.core.sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncontrarAlumnoPorCarne }
     * 
     */
    public EncontrarAlumnoPorCarne createEncontrarAlumnoPorCarne() {
        return new EncontrarAlumnoPorCarne();
    }

    /**
     * Create an instance of {@link RegistrarAlumno }
     * 
     */
    public RegistrarAlumno createRegistrarAlumno() {
        return new RegistrarAlumno();
    }

    /**
     * Create an instance of {@link EncontrarAlumnoPorId }
     * 
     */
    public EncontrarAlumnoPorId createEncontrarAlumnoPorId() {
        return new EncontrarAlumnoPorId();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link EncontrarAlumnoPorIdResponse }
     * 
     */
    public EncontrarAlumnoPorIdResponse createEncontrarAlumnoPorIdResponse() {
        return new EncontrarAlumnoPorIdResponse();
    }

    /**
     * Create an instance of {@link ModificarAlumno }
     * 
     */
    public ModificarAlumno createModificarAlumno() {
        return new ModificarAlumno();
    }

    /**
     * Create an instance of {@link RegistrarAlumnoResponse }
     * 
     */
    public RegistrarAlumnoResponse createRegistrarAlumnoResponse() {
        return new RegistrarAlumnoResponse();
    }

    /**
     * Create an instance of {@link EliminarAlumno }
     * 
     */
    public EliminarAlumno createEliminarAlumno() {
        return new EliminarAlumno();
    }

    /**
     * Create an instance of {@link EncontrarAlumnoPorCarneResponse }
     * 
     */
    public EncontrarAlumnoPorCarneResponse createEncontrarAlumnoPorCarneResponse() {
        return new EncontrarAlumnoPorCarneResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnosResponse }
     * 
     */
    public ListarAlumnosResponse createListarAlumnosResponse() {
        return new ListarAlumnosResponse();
    }

    /**
     * Create an instance of {@link ModificarAlumnoResponse }
     * 
     */
    public ModificarAlumnoResponse createModificarAlumnoResponse() {
        return new ModificarAlumnoResponse();
    }

    /**
     * Create an instance of {@link EliminarAlumnoResponse }
     * 
     */
    public EliminarAlumnoResponse createEliminarAlumnoResponse() {
        return new EliminarAlumnoResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnos }
     * 
     */
    public ListarAlumnos createListarAlumnos() {
        return new ListarAlumnos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAlumnoPorCarneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "encontrarAlumnoPorCarneResponse")
    public JAXBElement<EncontrarAlumnoPorCarneResponse> createEncontrarAlumnoPorCarneResponse(EncontrarAlumnoPorCarneResponse value) {
        return new JAXBElement<EncontrarAlumnoPorCarneResponse>(_EncontrarAlumnoPorCarneResponse_QNAME, EncontrarAlumnoPorCarneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "listarAlumnosResponse")
    public JAXBElement<ListarAlumnosResponse> createListarAlumnosResponse(ListarAlumnosResponse value) {
        return new JAXBElement<ListarAlumnosResponse>(_ListarAlumnosResponse_QNAME, ListarAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "eliminarAlumno")
    public JAXBElement<EliminarAlumno> createEliminarAlumno(EliminarAlumno value) {
        return new JAXBElement<EliminarAlumno>(_EliminarAlumno_QNAME, EliminarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "modificarAlumnoResponse")
    public JAXBElement<ModificarAlumnoResponse> createModificarAlumnoResponse(ModificarAlumnoResponse value) {
        return new JAXBElement<ModificarAlumnoResponse>(_ModificarAlumnoResponse_QNAME, ModificarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "listarAlumnos")
    public JAXBElement<ListarAlumnos> createListarAlumnos(ListarAlumnos value) {
        return new JAXBElement<ListarAlumnos>(_ListarAlumnos_QNAME, ListarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "eliminarAlumnoResponse")
    public JAXBElement<EliminarAlumnoResponse> createEliminarAlumnoResponse(EliminarAlumnoResponse value) {
        return new JAXBElement<EliminarAlumnoResponse>(_EliminarAlumnoResponse_QNAME, EliminarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAlumnoPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "encontrarAlumnoPorId")
    public JAXBElement<EncontrarAlumnoPorId> createEncontrarAlumnoPorId(EncontrarAlumnoPorId value) {
        return new JAXBElement<EncontrarAlumnoPorId>(_EncontrarAlumnoPorId_QNAME, EncontrarAlumnoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAlumnoPorCarne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "encontrarAlumnoPorCarne")
    public JAXBElement<EncontrarAlumnoPorCarne> createEncontrarAlumnoPorCarne(EncontrarAlumnoPorCarne value) {
        return new JAXBElement<EncontrarAlumnoPorCarne>(_EncontrarAlumnoPorCarne_QNAME, EncontrarAlumnoPorCarne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "registrarAlumno")
    public JAXBElement<RegistrarAlumno> createRegistrarAlumno(RegistrarAlumno value) {
        return new JAXBElement<RegistrarAlumno>(_RegistrarAlumno_QNAME, RegistrarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAlumnoPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "encontrarAlumnoPorIdResponse")
    public JAXBElement<EncontrarAlumnoPorIdResponse> createEncontrarAlumnoPorIdResponse(EncontrarAlumnoPorIdResponse value) {
        return new JAXBElement<EncontrarAlumnoPorIdResponse>(_EncontrarAlumnoPorIdResponse_QNAME, EncontrarAlumnoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "modificarAlumno")
    public JAXBElement<ModificarAlumno> createModificarAlumno(ModificarAlumno value) {
        return new JAXBElement<ModificarAlumno>(_ModificarAlumno_QNAME, ModificarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "registrarAlumnoResponse")
    public JAXBElement<RegistrarAlumnoResponse> createRegistrarAlumnoResponse(RegistrarAlumnoResponse value) {
        return new JAXBElement<RegistrarAlumnoResponse>(_RegistrarAlumnoResponse_QNAME, RegistrarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.core.edwintumax.org/", name = "alumno")
    public JAXBElement<Alumno> createAlumno(Alumno value) {
        return new JAXBElement<Alumno>(_Alumno_QNAME, Alumno.class, null, value);
    }

}
