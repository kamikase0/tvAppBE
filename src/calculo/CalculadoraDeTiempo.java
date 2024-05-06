package calculo;

import modelo.Titulo;

public class CalculadoraDeTiempo {

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getTiempoDeDuracionEnMinutos();
    }
}
