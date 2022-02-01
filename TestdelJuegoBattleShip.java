import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class xxx.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestdelJuegoBattleShip
{
    public TestdelJuegoBattleShip()
    {
    }
    
    @Test
    public void VerificarMemoriaEsteConTableros()
    {
        Battleship battleship = new Battleship();
        assertFalse(battleship.getMemoria().isEmpty());
    }
    
    //Tableros deben tener una dimensión 10x10 
    @Test
    public void VerificarDimensionDeTableros10x10()
    {
        Battleship battleship = new Battleship();
        Tablero tablero = new Tablero();
        assertEquals(tablero.getTamanioFilas(),10);
        assertEquals(tablero.getTamanioColumnas(),10);
    }

     @Test
    public void TablerosDistintosParaCadaJugador()
    {
        Battleship battleship = new Battleship();
        assertNotSame(battleship.getTableroJugador(),battleship.getTableroJugador2());
    }

     @Test
    public void TableroDeJugadoresNoEsteSinElementos()
    {
        Battleship battleship = new Battleship();
        assertEquals(battleship.getTableroJugador().elTableroNoVacio(),false);
        assertEquals(battleship.getTableroJugador2().elTableroNoVacio(),false);
    }
    
    //Tarea 3
    //La posición debe existir
    @Test
    public void PosicionAAtacarDebeExistir()
    {
        Battleship battleship = new Battleship();
        assertTrue(battleship.getTableroJugador().buscarCasilla(1,1));
    }
    
    @Test
    public void ActualizacionDelTablero()
    {
       Battleship battleship = new Battleship();
        Tablero tab1 =battleship.getTableroJugador();
        int valor=tab1.getPuntos();
        for (int w=0; w < tab1.getMatriz().length; w++) 
             {
                 for (int z=0; z < tab1.getMatriz()[w].length; z++) 
                 {
                     battleship.atacar(w,z); 
                  }
              } 
        Tablero tab1_1 =battleship.getTableroJugador();
        assertNotEquals(valor,tab1_1.getPuntos());
    }
    
    @Test
    public void NoAtacarDosVecesMismaCasilla()
    {
        Battleship battleship = new Battleship();
        battleship.atacar(2,0);
        battleship.atacar(2,0);
        assertFalse(battleship.atacar(2,0)); 
    }
    
    @Test
    public void NoSeGanoJuegoConUnAtaque()
    {
        Battleship battleship = new Battleship();
        battleship.atacar(2,0);
        assertFalse(battleship.ganadoJugador());
        assertFalse(battleship.ganadoJugador2());
    }

    @Test
    public void ExisteUnGanadorDelJuego()
    {
        Battleship battleship = new Battleship();
        Tablero tab2 =battleship.getTableroJugador2();
        for (int x=0; x < tab2.getMatriz().length; x++) 
            {
                for (int y=0; y < tab2.getMatriz()[x].length; y++) 
                    {
                       for (int w=0; w < tab2.getMatriz().length; w++) 
                            {
                                for (int z=0; z < tab2.getMatriz()[w].length; z++) 
                                {
                                    battleship.atacar(x,y); 
                                    battleship.atacar(w,z);
                                }
                            } 
                    }
             }  
        assertTrue(battleship.ganadoJugador2());
        
    }
    
    @Test
    public void NoSeDaEmpateEnElJuego()
    {
        Battleship battleship = new Battleship();
        Tablero tab2 =battleship.getTableroJugador2();
        for (int x=0; x < tab2.getMatriz().length; x++) 
            {
                for (int y=0; y < tab2.getMatriz()[x].length; y++) 
                    {
                       for (int w=1; w < tab2.getMatriz().length; w++) 
                            {
                                for (int z=1; z < tab2.getMatriz()[w].length; z++) 
                                {
                                    battleship.atacar(x,y); 
                                    battleship.atacar(w,z);
                                }
                            } 
                    }
             }  
        assertTrue(battleship.ganadoJugador());
        assertFalse(battleship.ganadoJugador2());
    }
}
