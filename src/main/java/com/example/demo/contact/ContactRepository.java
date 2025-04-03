package com.example.demo.contact;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//repositoryはDBアクセスを行うクラス
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    //JpaRepositoryを継承することで基本的なDB操作は可能
}
