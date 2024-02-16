package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public interface GestionAgendaDao {
    ArrayList<Contacto> buscarTodos();
    boolean altaContacto(Contacto contacto);
    boolean eliminarContacto(Contacto contacto);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);

    ArrayList<Contacto> buscarPorTresPrimeros(String nombre);
    boolean cambiarDatos(Contacto contacto);
    ArrayList<Contacto> contactosPorEmpresa(String empresa);
}
