package testing;

import modelo.javabean.Contacto;

public class TestContacto {
     public static void main(String[] args){
          Contacto contacto1 = new Contacto("Pedro", "Sanchez", "662301123","bizcochito69@gmail.com", "PSOE");

          Contacto contacto2 = new Contacto();
          contacto2.setNombre("Mariano");
          contacto2.setApellidos("Rajoy");
          contacto2.setTelefono("633103341");
          contacto2.setEmail("tractor364@gmail.com");
          contacto2.setEmpresa("PP");

          Contacto [] contactos  = {contacto1,contacto2};

          for (Contacto con : contactos){
               System.out.println("Nombre: "+ con.getNombre() + " Apellido: "+con.getApellidos());
          }
     }
}
