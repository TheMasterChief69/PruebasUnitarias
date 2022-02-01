import java.util.*;
public class Main
{
    public Main()
    {
        
        Battleship battleship = new Battleship();
        Tablero tab;
       
        tab =battleship.getTableroJugador();
        System.out.println("Este tablero es del Jugador1");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        tab.imprimirTablero();
        
        tab=battleship.getTableroJugador2();
        System.out.println("Este tablero es del Jugador2");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        tab.imprimirTablero();
        for (int w=0; w <5; w++) 
              {
                 for (int z=0; z < 5; z++) 
                 {
                     battleship.atacar(w,z); 
                  }
              }
        tab =battleship.getTableroJugador();
        System.out.println("Este tablero es del Jugador1");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        tab.imprimirTablero();
        
        tab=battleship.getTableroJugador2();
        System.out.println("Este tablero es del Jugador2");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        tab.imprimirTablero();
        for (int x=0; x < tab.getMatriz().length; x++) 
            {
                for (int y=0; y < tab.getMatriz()[x].length; y++) 
                    {
                       for (int w=1; w < tab.getMatriz().length; w++) 
                            {
                                for (int z=1; z < tab.getMatriz()[w].length; z++) 
                                {
                                    battleship.atacar(w,z);
                                    battleship.atacar(x,y); 
                                    
                                }
                            } 
                    }
             } 
        tab =battleship.getTableroJugador();
        System.out.println("Este tablero es del Jugador1");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        if( battleship.ganadoJugador())
         System.out.println("Ganaste");
        if( battleship.ganadoJugador2())
        System.out.println("Mejor suerte para la otra");
        tab.imprimirTablero();
        
        tab=battleship.getTableroJugador2();
        System.out.println("Este tablero es del Jugador2");
        System.out.println("Con:"+tab.getPuntos()+" puntos");
        if( battleship.ganadoJugador2())
         System.out.println("Ganaste");
        if( battleship.ganadoJugador())
         System.out.println("Mejor suerte para la otra");
        tab.imprimirTablero();
    }
}