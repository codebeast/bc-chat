package com.codebeast;

import java.io.Serializable;

public class Message implements Serializable {
    private String message;
    private String name;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
