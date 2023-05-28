public class ListaDoble {
   
   public NodoDoble primero;
   public NodoDoble ultimo;
   public Integer size;

   public ListaDoble(){
      this.primero = null;
      this.ultimo = null;
      this.size = 0;
   }

   public boolean empty(){
      if(size == 0)
         return true;
      return false;
   }

   public void insertarInicio(Gato gato){
      NodoDoble tmp = new NodoDoble(gato);
      if(empty()){
         primero = tmp;
         ultimo = tmp;
         ultimo.siguiente = primero;
         primero.anterior = ultimo;
      }else{
         tmp.siguiente = primero;
         tmp.anterior = ultimo;
         primero.anterior = tmp;
         primero = tmp;
         ultimo.siguiente = primero;
      }
      size++;
   }

   public void mostrarListaID(){
      NodoDoble tmp = primero;
      do{
         System.out.print(tmp.gato.nombre + " ");
         tmp = tmp.siguiente;
      }while(tmp != primero);
      System.out.println();
   }

   public void dividirLista(){
      NodoDoble tmp = primero;
      int n = size / 2;
      int contador = 0;
      ListaDoble l1 = new ListaDoble();
      ListaDoble l2 = new ListaDoble();
      ListaDoble l3 = new ListaDoble();
      if(size % 2 == 0){
         do{
            if(contador <= n){
               l1.insertarInicio(tmp.gato);
            }else{
               l2.insertarInicio(tmp.gato);
            }
            tmp = tmp.siguiente;
            contador++;
         }while(tmp != primero); 
      }else{
         do{
            if(contador < n){
               l1.insertarInicio(tmp.gato);
            }else{
               l2.insertarInicio(tmp.gato);
            }
            tmp = tmp.siguiente;
            contador++;
         }while(tmp != primero); 
      }
      System.out.println("lsita1:");
      l1.mostrarListaID();
      NodoDoble tmp2 = l2.primero;
      do{
         l3.insertarInicio(tmp2.gato);
         tmp2 = tmp2.siguiente;
      }while(tmp2 != l2.primero);
      System.out.println("lista2:");
      l3.mostrarListaID();
   }

}









