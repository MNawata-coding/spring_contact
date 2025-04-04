package com.example.demo.contact;

import java.util.List;
import java.util.Optional;

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

    /**
     * 更新処理
     * @param id
     * @param contact
     */
    public void update(Integer id, Contact contact){
        //idで検索する
        Optional<Contact> opEntity = repository.findById(id);
        //存在した場合
        if(opEntity.isPresent()){
            //各値を設定する
            Contact test = opEntity.get();
            test.setName(contact.name);
            test.setEmail(contact.email);
            test.setContent(contact.content);
            //保存処理
            repository.save(test);
        } else {
            //存在しない場合
            System.out.println("更新error");
        }
    }

}
