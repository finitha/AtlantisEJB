/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.domain;

import java.io.Serializable;

/**
 *
 * @author gmartin
 */
public class User implements Serializable{
    private Long id;
    private LoginStatus status;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", status=" + status + ", username=" + username + ", password=" + password + '}';
    }
    
    
}
