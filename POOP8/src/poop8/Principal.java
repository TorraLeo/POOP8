/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author EquipoH
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * System.out.println("Herencia como polimorfismo");
         * Poligono poligono = new Poligono();
         * System.out.println(poligono);
         * poligono = new Poligono();
         * System.out.println(poligono);
         * poligono = new Cuadrilatero(); //herencia como polimorfismo
         * System.out.println(poligono);
         * //poligono.getAltura(); // no se puede se hace referencia entre
         * // poligono es una variable que tiene un objeto cuadrilatero
         * // variable != objeto
         */
        // ------------------------------------------------
        /*
         * System.out.println("Prueba con Object");
         * Poligono wawa = new Poligono();
         * //tipo de variable - objeto = new Clase
         * System.out.println(wawa.area());
         * Object objeto = wawa;
         * System.out.println(wawa);
         * System.out.println(objeto);
         */
        // -------------------------------------------------
        /*
         * System.out.println("InstanceOf");
         * Poligono poligono = new Poligono();
         * tipoPoligono(poligono);
         * poligono = new Cuadrilatero();
         * tipoPoligono(poligono);
         * poligono = new Triangulo();
         * tipoPoligono(poligono);
         */
        ////////////////////////////////////////
        /*
         * System.out.println("CLASES ABSTRACTAS");
         * //Poligono poligono=new Poligono(); // una vez que se hace abstracta,
         * necesita un tratamiento especial
         * Triangulo triangulo = new Triangulo();
         * Cuadrilatero cuadrilatero = new Cuadrilatero();
         * Poligono poligono = cuadrilatero; //
         * System.out.println(""+ poligono + cuadrilatero + triangulo); // no funca si
         * se concatenan solos, necesita una cadena
         */
        //////////////////////////////////////////////
        // System.out.println("INTERFAZ");
        // //InstrumentoMusical instrumento = new InstrumentoMusical(); // no se puede
        ////////////////////////////////////////////// instanciar pq es abstracto
        // InstrumentoMusical instrumento = new InstrumentoDeViento();
        // System.out.println(instrumento);
        ////////////////////////////////////
        System.out.println(Math.PI);
        System.out.println(Meses.DOS);
        // Se puede acceder a las variables de la interfaz sin crear instancias
        System.out.println("El mes " + Meses.DOS + " corresponde a:");
        System.out.println(Meses.NOMBRES_MESES[Meses.DOS]);

    }

    private static void tipoPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Soy un triangulo");// intancia de la clase Triangulo
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Soy un cuadrado");
            // Cuadrilatero cuadrilatero = poligono; // la transformacion no es
            // bidireccional, necesita castearse
            Cuadrilatero cuadrilatero = (Cuadrilatero) poligono;
            System.out.println(cuadrilatero);
        } else
            System.out.println("soy un poligono");
    }
}
