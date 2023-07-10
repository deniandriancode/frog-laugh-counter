package app;

import lombok.*;
import jakarta.persistence.*;

@Entity
public class Laugh {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private int laugh;

    public Laugh() {
        this.laugh = 0;
    }

    public Laugh(int laugh) {
        this.laugh = laugh;
    }

    public Long getId() {
        return id;
    }

}
