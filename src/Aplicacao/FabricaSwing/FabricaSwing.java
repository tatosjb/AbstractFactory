package Aplicacao.FabricaSwing;

import Aplicacao.AbstractFactorys.FabricaDeFormas;
import Aplicacao.AbstractFactorys.Formas.Elipse;
import Aplicacao.AbstractFactorys.Formas.Retangulo;
import Aplicacao.AbstractFactorys.Formas.Triangulo;

/**
 *
 * @author Tato
 */
public class FabricaSwing implements FabricaDeFormas{

    @Override
    public Triangulo criaTriangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Elipse criaElipse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retangulo criaRetangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
