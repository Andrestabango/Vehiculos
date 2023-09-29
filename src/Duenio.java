public class Duenio {

    String nombre="";
    int edad=0;
    int cedula=0;
    String genero="";
   public String mayorEdad (){
        String me ="";
        if(edad>=18){
            me="Mayor de edad";
            System.out.printf(me);
        }else{
            me="Menor de edad";
            System.out.printf(me);
        }
        return me;
    }

}
