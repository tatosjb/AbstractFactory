/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Aplicacao.AbstractFactorys.FabricaDeFormas;
import Aplicacao.FabricaOpenGL.FabricaOpenGL;
import Aplicacao.FabricaSwing.FabricaSwing;

/**
 *
 * @author Tato
 */
public class ConstrutorDeFabricaDeFormas {

    public static FabricaDeFormas criaFabrica(Boolean openglInstalado) {
        if (openglInstalado) {
            return new FabricaOpenGL();
        }
        return new FabricaSwing();
    }
}
