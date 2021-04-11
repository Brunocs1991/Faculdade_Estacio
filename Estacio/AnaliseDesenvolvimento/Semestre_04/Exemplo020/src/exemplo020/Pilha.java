package exemplo020;

/**
 *
 * @author bruno
 * @param <K>
 */
public class Pilha<K> {
     class NoPilha<K> {
      K dado;
      NoPilha<K> proximo;
   }
   private NoPilha<K> topo = null;

   public void empilhar(K dado){
      NoPilha<K> novo = new NoPilha<>();
      novo.dado = dado;
      novo.proximo = topo;
      topo = novo;
   }

   public K desempilhar(){
      if(topo==null)
         return null;
      NoPilha<K> antigo = topo;
      topo = topo.proximo;
      return antigo.dado;
   }

}