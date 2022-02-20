package jp.co.itfllc.officesystemaccount.entities;

import jp.co.itfllc.officesystemaccount.enums.UsersPermission;
import lombok.Data;

@Data
public class UsersEntity {
    private Long id;

    private String account;

    private String passwordHash;

    private String name;

    private UsersPermission permission;

    private Boolean isEnabled;
}
