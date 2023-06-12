package modelo;

import enuns.Cor;

public class Circulo extends AbstractShape {

    private Double raio;

    
    
    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    
    
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    
    
    @Override
    public double area() {

        return Math.PI * raio * raio;

    }

}
