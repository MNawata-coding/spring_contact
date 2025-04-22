package com.example.demo.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;


    /***
     * 保存処理を行うサービスクラス
     * @param contact
     * @return
     */
    public void save(ContactDto contact){
        //Entityへ詰め替え
        Contact contactEntity = new Contact();
        contactEntity.setName(contact.getName());
        contactEntity.setEmail(contact.getEmail());
        contactEntity.setContent(contact.getContent());

        //データを保存する
        repository.save(contactEntity);
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
        Optional<Contact> updEntity = repository.findById(id);
        //存在した場合
        if(updEntity.isPresent()){
            //各値を設定する
            Contact updContact = updEntity.get();
            updContact.setName(contact.name);
            updContact.setEmail(contact.email);
            updContact.setContent(contact.content);
            //保存処理
            repository.save(updContact);
        } else {
            //存在しない場合
            System.out.println("更新error");
        }
    }

}
