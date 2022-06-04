package practica8;

import java.util.HashMap;
import java.util.Map;

public class Equipo {
    private String nombre, division, entrenador;
    private int torneosParticipantes, torneosGanados, torneosPerdidos, cantidadDeJugadores, numeroEquipo;
    public Map<Integer, Jugador> jugadores;
    
    public Equipo(String nombre, String division, String entrenador, int torneosParticipantes, int torneosGanados, int torneosPerdidos, int cantidadDeJugadores, int numeroEquipo){
        this.jugadores = new HashMap<>();
        this.setNombre(nombre);
        this.setDivision(division);
        this.setEntrenador(entrenador);
        this.setTorneosParticipantes(torneosParticipantes);
        this.setTorneosGanados(torneosGanados);
        this.setTorneosPerdidos(torneosPerdidos);
        this.setCantidadDeJugadores(cantidadDeJugadores);
        this.setNumeroEquipo(numeroEquipo);

        this.agregarJugador();
    }

    private void agregarJugador(){
        System.out.println("------Captura de informacion sobre jugadores------");
        for(int i=0; i<this.getNumeroJugadores(); i++){
            System.out.printf("\nJugador #%d", i+1);
            Jugador jugador = new Jugador(this.validarNumeroUniforme(i, 
            Captura.capturarEntero("Introducir numero de uniforme")), 
            Captura.capturarString("Introducir nombre"), 
            Captura.capturarEntero("Puntos anotados"), 
            Captura.capturarString("Posicion"),
            Captura.capturarFloat("Estatura"));
            this.jugadores.put(i, jugador);
        }
    }

    public int validarNumeroUniforme(int jugador, int numeroDeUniforme){
        if(this.jugadores.isEmpty()){
            return numeroDeUniforme;
        }
        else{
            for(int i=0; i<this.getJugadoresRegistrados();i++){
                if(numeroDeUniforme==this.jugadores.get(i).getNumeroUniforme()){
                    numeroDeUniforme=Captura.capturarEntero("Invalido. Ingresar otro numero disponible");
                }
            }
        }
        return numeroDeUniforme;
    }

    public int puntosAnotados(){
        int puntosTotales=0, jugReg;
        jugReg = this.getJugadoresRegistrados();
        
        for (int i=0; i<jugReg; i++){
            puntosTotales += this.jugadores.get(i).getPuntosAnotados();
        }
        return puntosTotales;
    }

    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDivision(){
        return division;
    }
    private void setDivision(String division){
        this.division = division;
    }

    public String getEntrenador(){
        return entrenador;
    }
    private void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }
    public int getNumeroJugadores(){
        return cantidadDeJugadores;
    }
    private void setCantidadDeJugadores(int cantidadDeJugadores){
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public int getNumeroEquipo(){
        return numeroEquipo;
    }
    private void setNumeroEquipo(int numeroEquipo){
        this.numeroEquipo = numeroEquipo;
    }

    public int getJugadoresRegistrados(){
        return jugadores.size();
    }

    public String getNombreJugador(int jugador){
        return jugadores.get(jugador).getNombre();
    }
    public int getNumeroUniforme(int jugador){
        return jugadores.get(jugador).getNumeroUniforme();
    }

    public int getTorneosParticipantes(){
        return torneosParticipantes;
    }
    private void setTorneosParticipantes(int torneosParticipantes){
        this.torneosParticipantes = torneosParticipantes;
    }

    public int getTorneosGanados(){
        return torneosGanados;
    }
    private void setTorneosGanados(int torneosGanados){
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos(){
        return torneosPerdidos;
    }
    private void setTorneosPerdidos(int torneosPerdidos){
        this.torneosPerdidos = torneosPerdidos;
    }

    
}
