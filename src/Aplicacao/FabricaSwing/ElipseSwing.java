/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.FabricaSwing;

import Aplicacao.AbstractFactorys.Formas.Elipse;

/**
 *
 * @author Tato
 */
public class ElipseSwing implements Elipse{

    @Override
    public void Desenha() {
        System.out.println("Desenhando Elipse Swing");
    }
    
}
