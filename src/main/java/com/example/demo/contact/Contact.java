package com.example.demo.contact;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

//Entityはテーブルと対応付けるクラス
@Entity
@Data
public class Contact {
    //@Dataでデフォルトコンストラクタとgetter,setterを自動生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @NotBlank(message = "名前は必須項目です")
    String name;

    @NotBlank
    @Email
    String email;
    
    @NotBlank
    String content;
}
