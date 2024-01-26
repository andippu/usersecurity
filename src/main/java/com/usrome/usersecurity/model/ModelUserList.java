package com.usrome.usersecurity.model;

import lombok.Data;

import java.util.Date;

public interface ModelUserList {
    String getuserId();
    String getuserName();
    Date getuserStartDate();
    Date getuserEndDate();
    String getuserEnableSts();


}

