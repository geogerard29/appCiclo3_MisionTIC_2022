package clasesModeladas;
public class Empleado {

    // atributos de la clase Empleado
    int id;
    String name;
    String email;
    String enterprise;

    // atributo role
    public enum role {
        Administrador,
        Operativo
    }

    role roleName;

    // metodo constructor
    public Empleado(int id, String name, String email, String enterprise, role roleName)  {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.roleName = roleName;
    }

    // getters y setters

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
    public role getRoleName() {
        return roleName;
    }
    public void setRoleName(role roleName) {
        this.roleName = roleName;
    }
}
