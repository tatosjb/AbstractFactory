package Aplicacao;

import Aplicacao.AbstractFactorys.FabricaDeFormas;
import Aplicacao.AbstractFactorys.Formas.Elipse;
import Aplicacao.AbstractFactorys.Formas.Retangulo;
import Aplicacao.AbstractFactorys.Formas.Triangulo;
import Aplicacao.FabricaSwing.FabricaSwing;

/**
 *
 * @author Tato
 */
public class Aplicacao {
    private FabricaDeFormas fabricaDeFormas;


    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao(ConstrutorDeFabricaDeFormas.criaFabrica(false));
        aplicacao.inicia();
    }
    
    public Aplicacao(FabricaDeFormas fabricaDeFormas) {
        this.fabricaDeFormas = fabricaDeFormas;
    }
    
    public void inicia(){
        Retangulo retangulo = this.fabricaDeFormas.criaRetangulo();
        retangulo.Desenha();
        
        Triangulo triangulo = this.fabricaDeFormas.criaTriangulo();
        triangulo.Desenha();
        
        Elipse elipse = this.fabricaDeFormas.criaElipse();
        elipse.Desenha();
    }
}
