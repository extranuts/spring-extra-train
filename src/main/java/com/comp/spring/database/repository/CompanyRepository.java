package com.comp.spring.database.repository;

import com.comp.spring.database.pool.ConnectionPool;

public class CompanyRepository {

    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
