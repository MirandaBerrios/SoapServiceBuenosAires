/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author jocpa
 */
public class Employee {
    
    private String  id;
    private String  name;
    private String  lastName;
    private String  rut;
    private String  adress;
    private String  emai;
    private String  password;
    private String  repeatPassword; 
    private String  isAuthenticate;
    private String  isOnline;
    private String  idRole;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getIsAuthenticate() {
        return isAuthenticate;
    }

    public void setIsAuthenticate(String isAuthenticate) {
        this.isAuthenticate = isAuthenticate;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public Employee() {
    }

    public Employee(String id, String name, String lastName, String rut, String adress, String emai, String password, String repeatPassword, String isAuthenticate, String isOnline, String idRole) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rut = rut;
        this.adress = adress;
        this.emai = emai;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.isAuthenticate = isAuthenticate;
        this.isOnline = isOnline;
        this.idRole = idRole;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", rut=" + rut + ", adress=" + adress + ", emai=" + emai + ", password=" + password + ", repeatPassword=" + repeatPassword + ", isAuthenticate=" + isAuthenticate + ", isOnline=" + isOnline + ", idRole=" + idRole + '}';
    }
    
    
    
}
