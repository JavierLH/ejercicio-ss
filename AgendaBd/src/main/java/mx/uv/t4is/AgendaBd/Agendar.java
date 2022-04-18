package mx.uv.t4is.AgendaBd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fecha;
    private String nombreActividad;
    private String Descripcion;
    private String Lugar;

    public int getId() {
        return id;
    }
    public String getLugar() {
        return Lugar;
    }
    public void setLugar(String lugar) {
        this.Lugar = lugar;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    public String getNombreActividad() {
        return nombreActividad;
    }
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
