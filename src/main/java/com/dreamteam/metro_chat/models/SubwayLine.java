package com.dreamteam.metro_chat.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subwaylines")
public class SubwayLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public SubwayLine() {
    }

    public SubwayLine(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SubwayLine chat = (SubwayLine) o;
        return id.equals(chat.id) && name.equals(chat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + this.id + ", chat_name='" + this.name + '}';
    }

}
