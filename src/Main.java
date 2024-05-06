import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Bienvenidos en inmersion en Java");
        //System.out.println("Pelicula Matrix");

        int ifechaDeLanzamiento = 1992;
        double dEvaluacion = 4.5;
        boolean bincluidoEnElPlanBasico = true;
        String snombre = "Matrix";
        String ssinopsis = """
                La mejor pelicula del fin de milenio
                con la participacion de Nicolas Cache.""";
        double mediaEvaluacion = (3.5+6.5+5.8)/3;
        double notaMatrix = 0;
        double mediaEvaluacionUsuario = 0;

        System.out.println("mediaEvaluacion:"+mediaEvaluacion);
        System.out.println("Palicula: "+ snombre);
        System.out.println(ssinopsis);
        System.out.println(ifechaDeLanzamiento);
        System.out.println(dEvaluacion);
        System.out.println(bincluidoEnElPlanBasico);

        if (ifechaDeLanzamiento >= 2023){
            System.out.println("peliula popular en el momento");
        }else {
            System.out.println("peliula retro que vale la pena ver");
        }
        for (int i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese la nota que le darias a Matrix");
            notaMatrix = in.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("la media de la evaluacion"+
                "Matrix calulada por el usuario es :" +mediaEvaluacion/3);
    }
}