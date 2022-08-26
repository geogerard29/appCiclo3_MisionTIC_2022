package clasesModeladas;

public class Empleado {

    // Agregar los atributos del empleado:  nombre, correo, empresa (a la que pertenece el empleado) y rol (administrador u operativo)
    int id;
    String name;
    String email;
    String enterprise;
    String role;


    // Agregar metodo constructor

    public Empleado(int id, String name, String email, String enterprise, String role)  {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.role = role;

    }

    // Agregar getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
