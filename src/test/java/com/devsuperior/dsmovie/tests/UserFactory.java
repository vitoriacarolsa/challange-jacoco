package com.devsuperior.dsmovie.tests;

import com.devsuperior.dsmovie.entities.RoleEntity;
import com.devsuperior.dsmovie.entities.UserEntity;

public class UserFactory {

	public static UserEntity createClienteUser() {
		UserEntity user = new UserEntity(1L, "Maria", "maria@gmail.com", "988118822");
		user.addRole(new RoleEntity(1L, "ROLE_CLIENT"));
		return user;
	}

	public static UserEntity createAdminUser() {
		UserEntity user = new UserEntity(2L, "Alex", "alex@gmail.com", "988118822");
		user.addRole(new RoleEntity(2L, "ROLE_ADMIN"));
		return user;
	}

	public static UserEntity createCustomAdminUser(Long id, String username){
		UserEntity user = new UserEntity(id, "Alex", username, "988282818");
		user.addRole(new RoleEntity(id, "ROLE_ADMIN"));
		return user;
	}

	public static UserEntity createCustomClientUser(Long id, String username){
		UserEntity user = new UserEntity(id, "Maria", username, "988118822");
		user.addRole(new RoleEntity(1L, "ROLE_CLIENT"));
		return user;
	}

	public static UserEntity createUserEntity() {
		UserEntity user = new UserEntity(2L, "Maria", "maria@gmail.com", "$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG");
		return user;
	}
}
