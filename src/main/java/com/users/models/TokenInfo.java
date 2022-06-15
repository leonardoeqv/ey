/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.models;

import java.io.Serializable;

/**
 *
 * @author leonardo
 */
public class TokenInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String jwtToken;

    public TokenInfo(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return this.jwtToken;
    }
}
