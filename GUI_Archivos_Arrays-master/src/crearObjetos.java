import java.io.Serial;
import java.io.Serializable;
public class crearObjetos implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    private String marca;
    private String anio;
    private String modelo;
    private String cilindraje;

    //Constructor

    public crearObjetos(String marca, String anio, String modelo, String cilindraje) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    //Setters y Getteres
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodo
    @Override
    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\nCilindraje: " + cilindraje;
    }
}
