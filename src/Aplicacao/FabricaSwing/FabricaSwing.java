package Aplicacao.FabricaSwing;

import Aplicacao.AbstractFactorys.FabricaDeFormas;
import Aplicacao.AbstractFactorys.Formas.Elipse;
import Aplicacao.AbstractFactorys.Formas.Retangulo;

/**
 *
 * @author Tato
 */
public class FabricaSwing implements FabricaDeFormas{

    @Override
    public TrianguloSwing criaTriangulo() {
        return new TrianguloSwing();
    }

    @Override
    public Elipse criaElipse() {
        return new ElipseSwing();
    }

    @Override
    public Retangulo criaRetangulo() {
        return new RetanguloSwing();
    }
    
}
