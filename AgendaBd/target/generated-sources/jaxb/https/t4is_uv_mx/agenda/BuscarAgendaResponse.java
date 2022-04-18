//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 11:21:19 PM CDT 
//


package https.t4is_uv_mx.agenda;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="agendar" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nombreActividad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "agendar"
})
@XmlRootElement(name = "BuscarAgendaResponse")
public class BuscarAgendaResponse {

    @XmlElement(required = true)
    protected List<BuscarAgendaResponse.Agendar> agendar;

    /**
     * Gets the value of the agendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarAgendaResponse.Agendar }
     * 
     * 
     */
    public List<BuscarAgendaResponse.Agendar> getAgendar() {
        if (agendar == null) {
            agendar = new ArrayList<BuscarAgendaResponse.Agendar>();
        }
        return this.agendar;
    }


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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nombreActividad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "id",
        "fecha",
        "nombreActividad",
        "descripcion",
        "lugar"
    })
    public static class Agendar {

        protected int id;
        @XmlElement(required = true)
        protected String fecha;
        @XmlElement(required = true)
        protected String nombreActividad;
        @XmlElement(name = "Descripcion", required = true)
        protected String descripcion;
        @XmlElement(name = "Lugar", required = true)
        protected String lugar;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreActividad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreActividad() {
            return nombreActividad;
        }

        /**
         * Define el valor de la propiedad nombreActividad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreActividad(String value) {
            this.nombreActividad = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad lugar.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLugar() {
            return lugar;
        }

        /**
         * Define el valor de la propiedad lugar.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLugar(String value) {
            this.lugar = value;
        }

    }

}
