
package modelo;

import enuns.Cor;


public abstract class AbstractShape implements Shape {
    
    private Cor cor;

    
    
    public AbstractShape(Cor cor) {
        this.cor = cor;
    }
    
    
    

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    
    
}
