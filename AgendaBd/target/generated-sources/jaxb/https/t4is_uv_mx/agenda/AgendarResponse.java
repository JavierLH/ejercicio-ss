//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 11:21:19 PM CDT 
//


package https.t4is_uv_mx.agenda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventoNuevo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventoNuevo"
})
@XmlRootElement(name = "AgendarResponse")
public class AgendarResponse {

    @XmlElement(name = "EventoNuevo", required = true)
    protected String eventoNuevo;

    /**
     * Obtiene el valor de la propiedad eventoNuevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoNuevo() {
        return eventoNuevo;
    }

    /**
     * Define el valor de la propiedad eventoNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoNuevo(String value) {
        this.eventoNuevo = value;
    }

}
