package com.vitorotto.model;

import java.time.LocalDate;
import java.util.Objects;

import com.vitorotto.model.enums.ClientType;

public class ClientModel {

    private final int id;
    private String name;
    private ClientType type;
    private String city;
    private String state;
    private final LocalDate registrationDate;

    public ClientModel(int id, String name, ClientType type, String city, String state, LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
        this.state = state;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ClientType getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClientModel [id=" + id + ", name=" + name + ", type=" + type + ", city=" + city + ", state=" + state
                + ", registrationDate=" + registrationDate + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClientModel other = (ClientModel) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
