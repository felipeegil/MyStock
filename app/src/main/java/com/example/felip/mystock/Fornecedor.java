package com.example.felip.mystock;

public class Fornecedor {
    private String fornecedorId;
    private String name;
    private String phone;
    private String city;

    public Fornecedor() {
    }

    public String getId() {
        return fornecedorId;
    }

    public void setId(String fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
