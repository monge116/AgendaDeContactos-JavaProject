package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public class GestionAgendaDaoImplArrayList implements GestionAgendaDao{
    private ArrayList<Contacto> contactos;

    /**
     * Muestra todos los contactos de una agenda
     * @return ArrayList<Contactos>
     */
    public ArrayList<Contacto> buscarTodos(){
        return contactos;
    }

    /**
     * Constructor Agenda
     */
    public GestionAgendaDaoImplArrayList(){
        contactos=new ArrayList<>();
        cargarContactos();
    }
    private void cargarContactos(){
        contactos.add(new Contacto("Pedro", "Sánchez", "667145523", "bizcochito55@gmail.com","PSOE"));
        contactos.add(new Contacto("Mariano", "Rajoy", "611873321", "tractor364@gmail.com","PP"));
        contactos.add(new Contacto("Adolfo", "Suarez", "687333892", "pimpumpam@gmail.com","CDS"));
        contactos.add(new Contacto("José Maria", "Aznar", "676189033", "bigotillomolon@gmail.com","PSOE"));
        contactos.add(new Contacto("José Luis", "Rodriguez", "632112323", "mrbeanfake@gmail.com","PP"));
    }

    /**
     * Para dar de alta un contacto
     * @param contacto
     * @return boolean
     */
    @Override
    public boolean altaContacto(Contacto contacto) {
        if (!contactos.contains(contacto)){
            contactos.add(contacto);
            return true;
        }
        else
            return false;
    }

    /**
     * Elimina un contacto
     * @param contacto
     * @return boolean
     */
    @Override
    public boolean eliminarContacto(Contacto contacto) {
        return contactos.remove(contacto) ? true : false;
    }

    /**
     * Buscar por nombre
     * @param nombre
     * @return Contacto
     */
    @Override
    public Contacto buscarUno(String nombre) {
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        int pos = contactos.indexOf(contacto);
        if (pos==-1)
        return null;
        else
            return contactos.get(pos);
    }

    /**
     * Busca por telefono
     * @param telefono
     * @return Contacto
     */
    @Override
    public Contacto buscarTelefono(String telefono) {
        int pos;
        for (Contacto contacto : contactos){
            pos = contactos.indexOf(contacto);
            if (!contacto.getTelefono().equals(telefono)){

            }
            else {
                return contactos.get(pos);
            }
        }
        return null;
    }

    /**
     * Busca por email
     * @param email
     * @return Contacto
     */
    @Override
    public Contacto buscarEmail(String email) {
        int pos;
        for (Contacto contacto : contactos){
            pos = contactos.indexOf(contacto);
            if (!contacto.getEmail().equals(email)){

            }
            else {
                return contactos.get(pos);
            }
        }
        return null;
    }

    /**
     * Busca por tres letras introducidas
     * @param nombre
     * @return ArrayList
     */
    @Override
    public ArrayList<Contacto> buscarPorTresPrimeros(String nombre) {
        ArrayList<Contacto> aux = new ArrayList<Contacto>();
        for (Contacto contacto : contactos){
            if (contacto.getNombre().substring(0,3).equals(nombre.substring(0,3))){
                aux.add(contacto);
            }
        }
        return aux;
    }

    /**
     * Cambiar datos de un contactos
     * @param contacto
     * @return boolean
     */
    @Override
    public boolean cambiarDatos(Contacto contacto) {
        for (Contacto contacto1 : contactos) {
            if(contacto1.getNombre().equals(contacto.getNombre())) {
                contacto1.setApellidos(contacto.getApellidos());
                contacto1.setTelefono(contacto.getTelefono());
                contacto1.setEmail(contacto.getEmail());
                contacto1.setEmpresa(contacto.getEmpresa());
            }
            }
        return false;
    }

    /**
     * Busca por nombre de empresa
     * @param empresa
     * @return ArrayList
     */
    @Override
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> aux = new ArrayList<Contacto>();
        for (Contacto contacto : contactos) {
            if (contacto.getEmpresa().equals(empresa)) {
                aux.add(contacto);
            }
        }
            return null;
    }
}
