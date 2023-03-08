package com.mps.data_model.models;

import com.mps.data_model.common.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_USERS\"", schema = "mps_schema")
@IdClass(SYSUsersKey.class)
@Getter @Setter
public class SYSUsers {

    @Id
    @Column(name = "\"USER_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_USER_ID\"",
            sequenceName = "\"S_USER_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_USER_ID\""
    )
    private BigInteger userId;

    @Id
    @Column(name = "\"USER_NAME\"", nullable = false)
    private String userName;

    @Column(name = "\"USER_TYPE\"", nullable = false)
    private UserType userType;

    @Column(name = "\"PASSWORD\"", nullable = false)
    private String password;

    @Column(name = "\"LAST_LOGIN\"")
    private LocalDateTime lastLogin;

}
