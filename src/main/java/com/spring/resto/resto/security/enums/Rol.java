package com.spring.resto.resto.security.enums;

public enum Rol {
	ROLE_USER(1),
	ROLE_ADMIN(2);
	
	private int level;

	private Rol(int theLevel) {
        this.level = theLevel;
    }

    public int getLevel() {
        return level;
    }
}
