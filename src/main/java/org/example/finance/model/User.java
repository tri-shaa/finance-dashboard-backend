package org.example.finance.model;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
@Data

public class User {

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean active = true;
}
