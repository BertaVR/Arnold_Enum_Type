package edu.pingpong;

import java.util.EnumSet;
public enum Planeta {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    EARTH (5.976e+24, 6.37814e6),
    MARS (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27, 7.1492e7),
    SATURN (5.688e+26, 6.0268e7),
    URANUS (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private double masa = 0d;
    private double radio = 0d;
    private final double G = 6.67300e-11;


    Planeta(double masaPlanetaria, double radio) {
        this.masa = masaPlanetaria;
        this.radio = radio;

    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }


    public double masaCuerpo(double pesoTerrestre){
        return pesoTerrestre / EARTH.gravedadSuperficie();
    }

    public double pesoSuperficie(double peso){
        return masaCuerpo(peso) * this.gravedadSuperficie();
    }

    public double gravedadSuperficie(){
    return G * getMasa() / (getRadio() * getRadio()); //refactorizar este cuadrado uwu
    }


}
