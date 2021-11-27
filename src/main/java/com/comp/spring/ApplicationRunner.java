package com.comp.spring;

import com.comp.spring.database.pool.ConnectionPool;
import com.comp.spring.database.repository.CompanyRepository;
import com.comp.spring.database.repository.UserRepository;
import com.comp.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var companyRepository = new CompanyRepository(connectionPool);
        var userService = new UserService(userRepository, companyRepository);
        // TODO: 27.11.2021 userService
    }
}
