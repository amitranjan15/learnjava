package com.demo.entityes;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonField {

    private boolean active=true;
    private boolean deleted;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
