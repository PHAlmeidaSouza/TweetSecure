package com.TweetSecure.SpringSecurity.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    public enum Values {
        BASIC(1L),
        ADMIN(2L);

        long roleId;

        Values(long roleId) {
            this.roleId = roleId;
        }
    }
}
