package com.comp.spring.database.repository;

import com.comp.spring.bpp.Auditing;
import com.comp.spring.bpp.InjectBean;
import com.comp.spring.bpp.Transaction;
import com.comp.spring.database.entity.Company;
import com.comp.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company>{

    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init(){
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findByID method ....");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("Delete method .........");
    }
}
