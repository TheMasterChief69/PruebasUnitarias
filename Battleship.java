import java.util.ArrayList;
import java.util.Scanner; 
public class Battleship
{   
    private ArrayList<Tablero> memoria;
    private int valorRescatado=0;
    private Tablero tableroJugador ;
    private Tablero tableroJugador2 ;
    public Battleship()
    {
        memoria =new ArrayList<Tablero>();
        Tablero tablero = new Tablero();
        tablero.crearTablero1();
        actualizarMemoria(tablero);
        Tablero tablero2 = new Tablero();
        tablero2.crearTablero2();
        actualizarMemoria(tablero2);
        Tablero tablero3 = new Tablero();
        tablero3.crearTablero3();
        actualizarMemoria(tablero3);
        tableroJugador = asignarTablero();
        tableroJugador2 = asignarTablero();
    }
    
    public ArrayList<Tablero> getMemoria()
    {
        return memoria;
    }
    
    public Tablero asignarTablero()
    {
        return memoria.get(randomNumero());
    }
    
    public int randomNumero()
    {
        
        int valor = (int)(Math.random()*3);
        if(valor != valorRescatado)
        {
            valorRescatado=valor;
            return valor;
        }
        else
        {
            return randomNumero();
        }      
    }

    public Tablero getTableroJugador()
    {
        return tableroJugador;
    }
    
    public Tablero getTableroJugador2()
    {
        return tableroJugador2;
    }

    public void actualizarMemoria(Tablero tab)
    {
       memoria.add(tab);
    }

    public boolean atacar(int fila, int columna)
    {
        boolean res=false;
        Tablero tab=tableroJugador2;
            if (tableroJugador.getTurno() && !ganadoJugador())
            {
                
                tableroJugador.setTurno(false);
                tableroJugador2.setTurno(true);
            }
            
            else{
                if (tableroJugador2.getTurno() && !ganadoJugador2())
                {
                 tab=tableroJugador;
                 tableroJugador2.setTurno(false);
                 tableroJugador.setTurno(true);
                }
            }
                
            if(tab.getDatoSegunPosicion(fila, columna)=='X')
            {
                    tab.setDatoSegunPosicion(fila, columna, 'H');
                    tab.danado();
                    res=true;
            }
            else if(tab.getDatoSegunPosicion(fila, columna)=='O')
                {
                    tab.setDatoSegunPosicion(fila,columna,'-');
                    res=true;
                }
        return res;
    }
    
    public boolean ganadoJugador()
    {
        return tableroJugador2.getPuntos()==0;
    }
    
    public boolean ganadoJugador2()
    {
        return tableroJugador.getPuntos()==0;
    }
    
}   
