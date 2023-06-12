package projeto;

import enuns.Cor;
import modelo.AbstractShape;
import modelo.Circulo;
import modelo.Retangulo;

public class Main {

    public static void main(String[] args) {

        AbstractShape s1 = new Circulo(Cor.PRETO, 2.0);
        AbstractShape s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getCor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getCor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }

}
