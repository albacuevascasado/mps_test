package com.mps.data_model.models;

import com.mps.data_model.common.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_USERS\"", schema = "mps_schema")
@IdClass(SYSUsersKey.class)
public class SYSUsers {

    @Id
    @Column(name = "\"USER_ID\"", nullable = false)
    @Getter @Setter
    private Long userId;

    @Id
    @Column(name = "\"USER_NAME\"", nullable = false)
    @Getter @Setter
    private String userName;

    @Column(name = "\"USER_TYPE\"", nullable = false)
    @Getter @Setter
    private UserType userType;

    @Column(name = "\"PASSWORD\"", nullable = false)
    @Getter @Setter
    private String password;

    @Column(name = "\"LAST_LOGIN\"")
    @Getter @Setter
    private LocalDateTime lastLogin;

}
