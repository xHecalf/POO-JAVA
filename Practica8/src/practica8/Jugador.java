package practica8;


public class Jugador {
    private int numeroUniforme, puntosAnotados;
    private String nombre, posicion;
    private float estatura;

    public Jugador(int numeroUniforme, String nombre, int puntosAnotados, String posicion, float estatura){
        this.setNumeroUniforme(numeroUniforme);
        this.setNombre(nombre);
        this.setPuntosAnotados(puntosAnotados);
        this.setPosicion(posicion);
        this.setEstatura(estatura);
    }

    private void setNumeroUniforme(int numeroUniforme) {
        this.numeroUniforme = numeroUniforme;
    }
    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    private void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }
    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    private void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPosicion() {
        return posicion;
    }

    private void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public float getEstatura() {
        return estatura;
    }
        
}
