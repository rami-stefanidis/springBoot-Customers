package com.rami.vo;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
public class ClientVO {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClientVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
