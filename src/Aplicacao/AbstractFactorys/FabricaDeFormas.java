/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.AbstractFactorys;

import Aplicacao.AbstractFactorys.Formas.Retangulo;
import Aplicacao.AbstractFactorys.Formas.Triangulo;
import Aplicacao.AbstractFactorys.Formas.Elipse;

/**
 *
 * @author Tato
 */
public interface FabricaDeFormas {
    public Triangulo criaTriangulo();
    public Elipse criaElipse();
    public Retangulo criaRetangulo();
    
}
