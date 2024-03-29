package modelo;

import enuns.Cor;

public class Retangulo extends AbstractShape {

    private Double largura;
    private Double altura;
    
    

    public Retangulo(Cor cor, double largura,double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    
    
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public double area() {

        return altura * largura;
        
    }

}
