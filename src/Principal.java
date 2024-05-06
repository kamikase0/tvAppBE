import calculo.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9 ){
            String menu = """
                    Bienvenido a ScreenMatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    
                    9) Salir
                    """;
            System.out.println(menu);
            System.out.println("Ingrese una opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el titulo de la pelicula");;
                    String nombre = teclado.nextLine();
                    teclado.nextLine();
                    System.out.println("Ingrese el año de la lanzamiento");;
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("INgrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();


                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                    case 2:
                    System.out.println("Ingrese el titulo de la serie");;
                    String nombres = teclado.nextLine();
                    teclado.nextLine();
                    System.out.println("Ingrese el año de la lanzamiento");;
                    int fechaDeLanzamientos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la serie");
                    int duracionEnMinutoss = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese numero de temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese episodio por temporada");
                    int episodioPorTemporada = teclado.nextInt();
                    teclado.nextLine();


                    serieUsuario.setNombre(nombres);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientos);
                    //serieUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutoss);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodioPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutoss);
                    serieUsuario.setTiempoDeDuracionEnMinutos(serieUsuario.getTiempoDeDuracionEnMinutos());
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 3:
                    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    calculadoraDeTiempo.incluye(serieUsuario);
                    System.out.println("Tiempo que necesitas para ver las peliculas y serie favoritos"+
                            calculadoraDeTiempo.getTiempoTotal()+"minutos.");
                    break;
                case 9:
                    System.out.println("Salida del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}
