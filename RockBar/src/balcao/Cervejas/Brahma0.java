/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balcao.Cervejas;

import balcao.TipoEmbalagem;
import balcao.Bebidas;
import balcao.ICerveja;

/**
 *
 * @author felipe
 */
public class Brahma0 extends Bebidas implements ICerveja{

    public Brahma0() {
        setNome("Brahma 0.0");
        setPreco(3.5f);
    }

    @Override
    public boolean isZeroAcool() {
        return true;
    }

    @Override
    public TipoEmbalagem emabalagem() {
        return TipoEmbalagem.LATA;
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(emabalagem());
        System.out.println((isZeroAcool() == false) ? "Com Alcool" : "Sem Alcool");
    }
    
}
