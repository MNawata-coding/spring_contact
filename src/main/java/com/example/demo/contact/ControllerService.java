package com.example.demo.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerService {

    @Autowired
    ContactRepository repository;

    /***
     * 保存処理を行うサービスクラス
     * @param contact
     * @return
     */
    public String save(Contact contact){

        //データを保存する
        repository.save(contact);
        return "";
    }
    
    /***
     * 全件取得処理
     * @return
     */
    public List<Contact> get(){
        //Contactリストを返却する
        return repository.findAll();
    }

    /**
     * 削除処理
     * @param id
     */
    public void delte(Integer id){
        repository.deleteById(id);
    }

}
