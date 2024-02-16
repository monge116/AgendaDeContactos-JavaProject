package testing;

import java.util.Scanner;

import modelo.dao.GestionAgendaDaoImplArrayList;
import modelo.javabean.Contacto;

public class TestGestionAgendaDaoImpl {

    private static GestionAgendaDaoImplArrayList gadao;
    private static Scanner leer;
    static {
        gadao = new GestionAgendaDaoImplArrayList();
        leer = new Scanner(System.in);

    };

    public static void main(String[] args) {


        //	System.out.println(GestionAgendaDao.buscarTodos());
        //altaContacto();
        //eliminarContacto();
        //buscarUno();
        //buscarTelefono();
        //buscarEmail();
        //contactosPorEmpresa();
        //buscarPorTresPrimeros();
        cambiarDatos();
    }

    public static void altaContacto() {
        GestionAgendaDaoImplArrayList GestionAgendaDao = new GestionAgendaDaoImplArrayList();
        Contacto contacto1 = new Contacto("Isabel", "Ayuso", "655123422", "madrid360eco@gmail.com","PP");
        System.out.println("filas insertadas: "+ GestionAgendaDao.altaContacto(contacto1));

        for (Contacto contacto : GestionAgendaDao.buscarTodos()) {
            System.out.println(contacto);
        }
    }

    public static void eliminarContacto() {
        Contacto contacto2 = new Contacto("Pedro", "Sánchez", "667145523", "bizcochito55@gmail.com","PSOE");
        System.out.println(gadao.eliminarContacto(contacto2));
        System.out.println(gadao.buscarTodos());
    }

    public static void buscarUno() {
        String nombre = leer.next();
        Contacto contacto = gadao.buscarUno(nombre);
        //System.out.println(GestionAgendaDao.buscarUno("Mariano"));
        if (contacto!=null) {
            System.out.println(contacto);
        }
        else {
            System.out.println("No existe contacto");
        };
    }
    public static void buscarTelefono() {
        String telefono = leer.next();
        Contacto contacto = gadao.buscarTelefono(telefono);
        //System.out.println(GestionAgendaDao.buscarUno("Mariano"));
        if (contacto!=null) {
            System.out.println(contacto);
        }
        else {
            System.out.println("No existe contacto");
        };
    }
    public static void buscarEmail() {
        String email = leer.next();
        Contacto contacto = gadao.buscarEmail(email);
        //System.out.println(GestionAgendaDao.buscarUno("Mariano"));
        if (contacto!=null) {
            System.out.println(contacto);
        }
        else {
            System.out.println("No existe contacto");
        };
    }
    public static void contactosPorEmpresa() {
        String empresa = "PP";
        for (Contacto con: gadao.contactosPorEmpresa(empresa)){
            System.out.println(con);
        }
    }
    public static void buscarPorTresPrimeros() {
        String nombre = "Jos";
        for (Contacto con: gadao.buscarPorTresPrimeros(nombre)){
            System.out.println(con);
        }
    }
    public static void cambiarDatos() {
        Contacto contacto = new Contacto("Adolfo", "Suarez", "687333892", "centrodemocrático@gmail.com","CDS");
        gadao.cambiarDatos(contacto);

        System.out.println(contacto);


    }

}
