/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author EquipoH
 */
public class Triangulo extends Poligono {
    private int alpha, beta, gamma;
    private int a, b, c;
    private float base, altura;

    public Triangulo() {
    }

    public Triangulo(int alpha, int beta, int gamma, int a, int b, int c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return Método que retorna alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * @param alpha Método que modifica alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * @return Método que retorna beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * @param beta Método que modifica beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * @return Método que retorna gamma
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * @param gamma Método que modifica gamma
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * @return Método que retorna a
     */
    public int getA() {
        return a;
    }

    /** 
     * @param a Método que modifica a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return Método que retorna b
     */
    public int getB() {
        return b;
    }

    /** 
     * @param b Método que modifica b
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return Método que retorna c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c Método que modifica c
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return Método que retorna la base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base Método que modifica la base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return Método que retorna la altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura Método que modifica la altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int perimetro() {
        return this.a + this.b + this.c;
    }

    @Override
    public float area() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c="
                + c + ", base=" + base + ", altura=" + altura + "]";
    }
}
