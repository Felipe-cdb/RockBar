package balcao;
/**
 * Criação das interfaces que remete o tipo de Bebida
 * a partir dessa interface o strategy age variando as caracteristas
 * do tipo especifico desse tipo de bebida, a interface a baixo representa
 * o tipo de bebida cerveja e as classes que implementarão seu método
 * será os tipos de cervejas especifica. 
 */
public interface ICerveja{   
   boolean isZeroAcool();
   TipoEmbalagem emabalagem();
   
   void pedir();
}