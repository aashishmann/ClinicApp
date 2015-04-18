import javax.persistence.*;

/**
 * Created by aashish on 27/12/14.
 */
@Entity
@Table(name="test_table")
public class TestTable {
    private int id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
