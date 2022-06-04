package practica8;
//Hector Alfonso

public class Practica8 {
    public static void main(String[] args) {
        
        Torneo t = new Torneo(
            
        Captura.capturarString("Nombre del torneo"),
        Captura.capturarString("Region"),
        Captura.capturarEntero("Cantidad de equipos participantes"),
        Captura.capturarEntero("Cantidad de partidos jugados"),
        Captura.capturarEntero("Cantidad de partidos por jugar"));
        
        System.out.println("\n--Información del Torneo--");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Region: " + t.getRegion());
        System.out.println("Numero de equipos participantes: " + t.getNumeroEquiposParticipantes());
        System.out.println("Partidos jugados: " + t.getPartidosJugados());
        System.out.println("Partidos pendientes: " + t.getPartidosPendientes());
        
        System.out.println("\n--Información sobre los equipos--");
        for(int i=0; i<t.getNumeroEquiposParticipantes(); i++){
            System.out.println("Equipo: " + t.getNombreEquipo(i));
            System.out.println("Division: " + t.getDivision(i));
            System.out.println("Puntos anotados: " + t.getPuntosEquipos(i));
            System.out.println("Cantidad de jugadores: " + t.getNumeroJugadores(i));
            System.out.println("Jugadores:");

            for(int j=0; j<t.getNumeroEquiposParticipantes(); j++){
                System.out.println("Nombre: " + t.getNombreJugador(i, j));
                System.out.println("Numero: "+ t.getNumeroUniforme(i, j));
            }
            System.out.println("\n");
        }
    }

}