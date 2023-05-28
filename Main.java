public class Main{
   public static void main(String[] args) {
      
      ListaDoble lista = new ListaDoble();

      lista.insertarInicio(new Gato("RAUL", 2, "naranjado"));
      lista.insertarInicio(new Gato("TOMAS", 2, "CANINO"));
      lista.insertarInicio(new Gato("INGENIERITO", 2, "ANGORA"));

      lista.mostrarListaID();
      System.out.println("============================");
      lista.dividirLista();

   }
}