package clasesModeladas;
import javax.persistence.*;

@Entity
@Table(name = "empresas")

public class Empresa {

    // atributos de la clase Empresa:

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "nit")
    private String nit;

    @Column(name = "phone")
    private int phone;

    @Column(name = "phone")
    private String address;


    //  metodo constructor vacio
    public Empresa() {
    }

    //  metodo constructor con parametros
    public Empresa(int id,String name, String nit, int phone, String address) {
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }
    // getters y setters

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
