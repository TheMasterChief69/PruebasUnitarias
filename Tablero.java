import java.util.*;
/*
 * vV
 */
//
public class Tablero
{
    private char matriz[][];
    private int puntos;
    private boolean turno;

    public Tablero()
    {
        matriz=new char [10][10];
        turno=true;
    }

    public int getTamanioFilas()
    {
        return matriz.length;
    }
    
    public int getTamanioColumnas()
    {
        return matriz[0].length;
    }

    public void imprimirTablero()
    {
   
      for (int x=0; x < matriz.length; x++) {
          System.out.print("|");
          for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
            if (y!=matriz[x].length-1) 
                System.out.print("\t");
          }
          System.out.println("|");
      }
    }
    
    public boolean buscarCasilla(int fila, int columna)
    {
      if(matriz [fila][columna] == 'X' || matriz [fila][columna] == 'O' )
        return true;
      else
        return false;
    }
    
    public char getDatoSegunPosicion(int fila,int columna)
    {
        return matriz[fila][columna];
    }
    
    public void setDatoSegunPosicion(int fila, int columna, char dato)
    {
        matriz[fila][columna] = dato;
    }
    
    public int getPuntos()
    {
        return puntos;
    }
    
    public char [][] getMatriz()
    {
        return matriz;
    }
    
    public void danado()
    {
        puntos = puntos-1;
    }

    public void calcularPuntos()
    {
        for (int x=0; x < matriz.length; x++) 
            {
                for (int y=0; y < matriz[x].length; y++) 
                    {
                        if (matriz[x][y] == 'X') 
                            puntos ++;
                    }
                }    
    }
    
    public boolean elTableroNoVacio()
    {
        boolean vacio = true;
        for (int x=0; x < matriz.length; x++) 
            {
                for (int y=0; y < matriz[x].length; y++) 
                    {
                        if (matriz[x][y] == 'X'|| matriz [x][y] == 'O') 
                            vacio = false;
                    }
            }   
        return vacio;        
    }
    
    public void setTurno(boolean tur)
    {
        turno=tur;
    }
    
    public boolean getTurno()
    {
        return turno;
    }
        
    public void crearTablero1()
    {
        
        matriz[0][0] = 'O';
        matriz[0][1] = 'O';
        matriz[0][2] = 'O';
        matriz[0][3] = 'O';
        matriz[0][4] = 'O';
        matriz[0][5] = 'O';
        matriz[0][6] = 'O';
        matriz[0][7] = 'O';
        matriz[0][8] = 'O';
        matriz[0][9] = 'O';
        
        matriz[1][0] = 'X';
        matriz[1][1] = 'O';
        matriz[1][2] = 'X';
        matriz[1][3] = 'X';
        matriz[1][4] = 'X';
        matriz[1][5] = 'O';
        matriz[1][6] = 'O';
        matriz[1][7] = 'O';
        matriz[1][8] = 'X';
        matriz[1][9] = 'O';
        
        matriz[2][0] = 'X';
        matriz[2][1] = 'O';
        matriz[2][2] = 'O';
        matriz[2][3] = 'O';
        matriz[2][4] = 'O';
        matriz[2][5] = 'O';
        matriz[2][6] = 'O';
        matriz[2][7] = 'O';
        matriz[2][8] = 'O';
        matriz[2][9] = 'O';
        
        matriz[3][0] = 'X';
        matriz[3][1] = 'O';
        matriz[3][2] = 'X';
        matriz[3][3] = 'O';
        matriz[3][4] = 'O';
        matriz[3][5] = 'X';
        matriz[3][6] = 'O';
        matriz[3][7] = 'O';
        matriz[3][8] = 'O';
        matriz[3][9] = 'O';
        
        matriz[4][0] = 'O';
        matriz[4][1] = 'O';
        matriz[4][2] = 'O';
        matriz[4][3] = 'O';
        matriz[4][4] = 'O';
        matriz[4][5] = 'X';
        matriz[4][6] = 'O';
        matriz[4][7] = 'O';
        matriz[4][8] = 'O';
        matriz[4][9] = 'O';
        
        matriz[5][0] = 'O';
        matriz[5][1] = 'O';
        matriz[5][2] = 'O';
        matriz[5][3] = 'O';
        matriz[5][4] = 'O';
        matriz[5][5] = 'X';
        matriz[5][6] = 'O';
        matriz[5][7] = 'O';
        matriz[5][8] = 'O';
        matriz[5][9] = 'O';
        
        matriz[6][0] = 'O';
        matriz[6][1] = 'X';
        matriz[6][2] = 'O';
        matriz[6][3] = 'O';
        matriz[6][4] = 'O';
        matriz[6][5] = 'X';
        matriz[6][6] = 'O';
        matriz[6][7] = 'O';
        matriz[6][8] = 'O';
        matriz[6][9] = 'O';
        
        matriz[7][0] = 'O';
        matriz[7][1] = 'X';
        matriz[7][2] = 'O';
        matriz[7][3] = 'O';
        matriz[7][4] = 'O';
        matriz[7][5] = 'X';
        matriz[7][6] = 'O';
        matriz[7][7] = 'O';
        matriz[7][8] = 'O';
        matriz[7][9] = 'O';
        
        matriz[8][0] = 'O';
        matriz[8][1] = 'X';
        matriz[8][2] = 'O';
        matriz[8][3] = 'O';
        matriz[8][4] = 'O';
        matriz[8][5] = 'O';
        matriz[8][6] = 'O';
        matriz[8][7] = 'O';
        matriz[8][8] = 'O';
        matriz[8][9] = 'O';
        
        matriz[9][0] = 'O';
        matriz[9][1] = 'O';
        matriz[9][2] = 'O';
        matriz[9][3] = 'X';
        matriz[9][4] = 'X';
        matriz[9][5] = 'X';
        matriz[9][6] = 'X';
        matriz[9][7] = 'X';
        matriz[9][8] = 'O';
        matriz[9][9] = 'O';
        calcularPuntos();
    }
    
    public void crearTablero2()
    {
        
        matriz[0][0] = 'X';
        matriz[0][1] = 'O';
        matriz[0][2] = 'O';
        matriz[0][3] = 'O';
        matriz[0][4] = 'O';
        matriz[0][5] = 'O';
        matriz[0][6] = 'O';
        matriz[0][7] = 'O';
        matriz[0][8] = 'O';
        matriz[0][9] = 'X';
        
        matriz[1][0] = 'X';
        matriz[1][1] = 'O';
        matriz[1][2] = 'X';
        matriz[1][3] = 'X';
        matriz[1][4] = 'X';
        matriz[1][5] = 'X';
        matriz[1][6] = 'X';
        matriz[1][7] = 'O';
        matriz[1][8] = 'O';
        matriz[1][9] = 'O';
        
        matriz[2][0] = 'X';
        matriz[2][1] = 'O';
        matriz[2][2] = 'O';
        matriz[2][3] = 'O';
        matriz[2][4] = 'O';
        matriz[2][5] = 'O';
        matriz[2][6] = 'O';
        matriz[2][7] = 'O';
        matriz[2][8] = 'X';
        matriz[2][9] = 'O';
        
        matriz[3][0] = 'O';
        matriz[3][1] = 'O';
        matriz[3][2] = 'O';
        matriz[3][3] = 'O';
        matriz[3][4] = 'O';
        matriz[3][5] = 'O';
        matriz[3][6] = 'O';
        matriz[3][7] = 'O';
        matriz[3][8] = 'X';
        matriz[3][9] = 'O';
        
        matriz[4][0] = 'O';
        matriz[4][1] = 'O';
        matriz[4][2] = 'O';
        matriz[4][3] = 'O';
        matriz[4][4] = 'X';
        matriz[4][5] = 'O';
        matriz[4][6] = 'O';
        matriz[4][7] = 'O';
        matriz[4][8] = 'X';
        matriz[4][9] = 'O';
        
        matriz[5][0] = 'O';
        matriz[5][1] = 'O';
        matriz[5][2] = 'O';
        matriz[5][3] = 'O';
        matriz[5][4] = 'O';
        matriz[5][5] = 'O';
        matriz[5][6] = 'O';
        matriz[5][7] = 'O';
        matriz[5][8] = 'X';
        matriz[5][9] = 'O';
        
        matriz[6][0] = 'O';
        matriz[6][1] = 'O';
        matriz[6][2] = 'O';
        matriz[6][3] = 'O';
        matriz[6][4] = 'O';
        matriz[6][5] = 'O';
        matriz[6][6] = 'O';
        matriz[6][7] = 'O';
        matriz[6][8] = 'X';
        matriz[6][9] = 'O';
        
        matriz[7][0] = 'O';
        matriz[7][1] = 'X';
        matriz[7][2] = 'X';
        matriz[7][3] = 'X';
        matriz[7][4] = 'O';
        matriz[7][5] = 'O';
        matriz[7][6] = 'O';
        matriz[7][7] = 'O';
        matriz[7][8] = 'O';
        matriz[7][9] = 'O';
        
        matriz[8][0] = 'O';
        matriz[8][1] = 'O';
        matriz[8][2] = 'O';
        matriz[8][3] = 'O';
        matriz[8][4] = 'O';
        matriz[8][5] = 'O';
        matriz[8][6] = 'O';
        matriz[8][7] = 'O';
        matriz[8][8] = 'O';
        matriz[8][9] = 'O';
        
        matriz[9][0] = 'O';
        matriz[9][1] = 'O';
        matriz[9][2] = 'X';
        matriz[9][3] = 'O';
        matriz[9][4] = 'O';
        matriz[9][5] = 'O';
        matriz[9][6] = 'O';
        matriz[9][7] = 'X';
        matriz[9][8] = 'X';
        matriz[9][9] = 'X';
        calcularPuntos();
    }
    
    public void crearTablero3()
    {
        
        matriz[0][0] = 'X';
        matriz[0][1] = 'O';
        matriz[0][2] = 'O';
        matriz[0][3] = 'O';
        matriz[0][4] = 'O';
        matriz[0][5] = 'O';
        matriz[0][6] = 'O';
        matriz[0][7] = 'O';
        matriz[0][8] = 'O';
        matriz[0][9] = 'X';
        
        matriz[1][0] = 'X';
        matriz[1][1] = 'O';
        matriz[1][2] = 'X';
        matriz[1][3] = 'O';
        matriz[1][4] = 'O';
        matriz[1][5] = 'O';
        matriz[1][6] = 'O';
        matriz[1][7] = 'O';
        matriz[1][8] = 'O';
        matriz[1][9] = 'O';
        
        matriz[2][0] = 'X';
        matriz[2][1] = 'O';
        matriz[2][2] = 'X';
        matriz[2][3] = 'O';
        matriz[2][4] = 'X';
        matriz[2][5] = 'X';
        matriz[2][6] = 'X';
        matriz[2][7] = 'O';
        matriz[2][8] = 'X';
        matriz[2][9] = 'O';
        
        matriz[3][0] = 'O';
        matriz[3][1] = 'O';
        matriz[3][2] = 'X';
        matriz[3][3] = 'O';
        matriz[3][4] = 'O';
        matriz[3][5] = 'O';
        matriz[3][6] = 'O';
        matriz[3][7] = 'O';
        matriz[3][8] = 'X';
        matriz[3][9] = 'O';
        
        matriz[4][0] = 'O';
        matriz[4][1] = 'O';
        matriz[4][2] = 'X';
        matriz[4][3] = 'O';
        matriz[4][4] = 'O';
        matriz[4][5] = 'O';
        matriz[4][6] = 'O';
        matriz[4][7] = 'O';
        matriz[4][8] = 'X';
        matriz[4][9] = 'O';
        
        matriz[5][0] = 'O';
        matriz[5][1] = 'O';
        matriz[5][2] = 'X';
        matriz[5][3] = 'O';
        matriz[5][4] = 'O';
        matriz[5][5] = 'O';
        matriz[5][6] = 'O';
        matriz[5][7] = 'O';
        matriz[5][8] = 'X';
        matriz[5][9] = 'O';
        
        matriz[6][0] = 'O';
        matriz[6][1] = 'O';
        matriz[6][2] = 'O';
        matriz[6][3] = 'O';
        matriz[6][4] = 'O';
        matriz[6][5] = 'X';
        matriz[6][6] = 'O';
        matriz[6][7] = 'O';
        matriz[6][8] = 'X';
        matriz[6][9] = 'O';
        
        matriz[7][0] = 'X';
        matriz[7][1] = 'O';
        matriz[7][2] = 'O';
        matriz[7][3] = 'O';
        matriz[7][4] = 'O';
        matriz[7][5] = 'O';
        matriz[7][6] = 'O';
        matriz[7][7] = 'O';
        matriz[7][8] = 'O';
        matriz[7][9] = 'O';
        
        matriz[8][0] = 'X';
        matriz[8][1] = 'O';
        matriz[8][2] = 'O';
        matriz[8][3] = 'O';
        matriz[8][4] = 'O';
        matriz[8][5] = 'O';
        matriz[8][6] = 'O';
        matriz[8][7] = 'X';
        matriz[8][8] = 'O';
        matriz[8][9] = 'O';
        
        matriz[9][0] = 'X';
        matriz[9][1] = 'O';
        matriz[9][2] = 'O';
        matriz[9][3] = 'O';
        matriz[9][4] = 'O';
        matriz[9][5] = 'O';
        matriz[9][6] = 'O';
        matriz[9][7] = 'O';
        matriz[9][8] = 'O';
        matriz[9][9] = 'O';
        calcularPuntos();
    }
    

}
