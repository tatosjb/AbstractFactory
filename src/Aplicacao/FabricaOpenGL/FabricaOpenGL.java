package Aplicacao.FabricaOpenGL;

import Aplicacao.AbstractFactorys.FabricaDeFormas;
import Aplicacao.AbstractFactorys.Formas.Elipse;
import Aplicacao.AbstractFactorys.Formas.Retangulo;

/**
 *
 * @author Tato
 */
public class FabricaOpenGL implements FabricaDeFormas{

    @Override
    public TrianguloOpenGL criaTriangulo() {
        return new TrianguloOpenGL();
    }

    @Override
    public Elipse criaElipse() {
        return new ElipseOpenGL();
    }

    @Override
    public Retangulo criaRetangulo() {
        return new RetanguloOpenGL();
    }
    
}
