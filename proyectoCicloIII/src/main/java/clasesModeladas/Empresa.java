package clasesModeladas;
public class Empresa {

    // Agregar los atributos de la Empresa:  nombre, direcciòn, telefono y nit
    String name;
    String nit;
    int phone;
    String address;
    int id;

    // Agregar metodo constructor
    public Empresa(int id,String name, String nit, int phone, String address) {
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }
    // Agregar getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
