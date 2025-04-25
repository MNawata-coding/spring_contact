package com.example.demo.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PutMapping;


//controllerはurl遷移処理を主に行う
@RestController
@RequestMapping("api")
public class ContactController {

    @Autowired
    ContactService service;

    /**
     * 送信後の保存処理
     * @return
     */
    @PostMapping("save")
    public void save(@Valid @RequestBody ContactDto contact) {
        service.save(contact);
    }

    /**
     * 情報取得処理
     * @return
     */
    @GetMapping("get")
    public List<ContactDto> get(){
        return service.get();
    }

    /**
     * 削除処理
     * @param
     */
    @DeleteMapping("/delete/{id}")
    public void delte(@PathVariable("id") Integer id) {
        service.delte(id);
    }

    //update処理
    @PutMapping("update/{id}")
    public void putMethodName(@PathVariable("id") Integer id, @Valid @RequestBody ContactDto contact) {
        //idで検索
        service.update(id, contact);
    }
}
