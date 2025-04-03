package com.example.demo.contact;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//Entityはテーブルと対応付けるクラス
@Entity
@Data
public class Contact {
    //@Dataでデフォルトコンストラクタとgetter,setterを自動生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String email;
    
    String content;
}
