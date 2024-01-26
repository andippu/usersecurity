package com.usrome.usersecurity.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class VApplUserParentMenuCompKey  implements Serializable {
    private String vuspamnUserId;
    private Integer vuspamnModuleId;
    private Integer vuspamnParentId;
}
