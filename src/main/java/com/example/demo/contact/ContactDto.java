package com.example.demo.contact;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto{

    //@Dataでデフォルトコンストラクタとgetter,setterを自動生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "名前は必須項目です")
    @Size(min=1, max=30)
    String name;

    @NotBlank(message = "メールアドレスを入力してください")
    @Email
    String email;

    @NotBlank(message = "内容を入力してください")
    @Size(min=1, max=100)
    String content;
}