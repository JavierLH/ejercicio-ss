//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 11:21:19 PM CDT 
//


package https.t4is_uv_mx.agenda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.agenda package. 
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

    private final static QName _BuscarAgendaRequest_QNAME = new QName("https://t4is.uv.mx/agenda", "BuscarAgendaRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.agenda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarAgendaResponse }
     * 
     */
    public BuscarAgendaResponse createBuscarAgendaResponse() {
        return new BuscarAgendaResponse();
    }

    /**
     * Create an instance of {@link AgendarRequest }
     * 
     */
    public AgendarRequest createAgendarRequest() {
        return new AgendarRequest();
    }

    /**
     * Create an instance of {@link AgendarResponse }
     * 
     */
    public AgendarResponse createAgendarResponse() {
        return new AgendarResponse();
    }

    /**
     * Create an instance of {@link BuscarAgendaResponse.Agendar }
     * 
     */
    public BuscarAgendaResponse.Agendar createBuscarAgendaResponseAgendar() {
        return new BuscarAgendaResponse.Agendar();
    }

    /**
     * Create an instance of {@link ModificarAgendaRequest }
     * 
     */
    public ModificarAgendaRequest createModificarAgendaRequest() {
        return new ModificarAgendaRequest();
    }

    /**
     * Create an instance of {@link ModificarAgendaResponse }
     * 
     */
    public ModificarAgendaResponse createModificarAgendaResponse() {
        return new ModificarAgendaResponse();
    }

    /**
     * Create an instance of {@link BorrarAgendaRequest }
     * 
     */
    public BorrarAgendaRequest createBorrarAgendaRequest() {
        return new BorrarAgendaRequest();
    }

    /**
     * Create an instance of {@link BorrarAgendaResponse }
     * 
     */
    public BorrarAgendaResponse createBorrarAgendaResponse() {
        return new BorrarAgendaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/agenda", name = "BuscarAgendaRequest")
    public JAXBElement<Object> createBuscarAgendaRequest(Object value) {
        return new JAXBElement<Object>(_BuscarAgendaRequest_QNAME, Object.class, null, value);
    }

}
