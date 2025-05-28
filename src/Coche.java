package MVC_coches.src;

public class Coche {
   private String matricula;
   private String modelo;
   private Integer velocidad;
   private Double gasolina;
   private Double posicion;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 0.0;
        this.posicion = 0.0;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Double getGasolina() {
        return gasolina;
    }

    public void setGasolina(Double gasolina) {
        this.gasolina = gasolina;
    }

    public Double getPosicion() {
        return posicion;
    }

    public void setPosicion(Double posicion) {
        this.posicion = posicion;
    }
}
