package com.clone.kurly.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Entity
public class Cart extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long cid;

    @OneToOne
    @JoinColumn (name = "USER_ID")
    private Optional<User> user;

    public Cart (Optional<User> user) {
        this.user = user;
    }


}
