package com.example.demo.obj;

import javax.persistence.Entity;
import javax.persistence.Id;

// 실제 db 테이블의 컬럼명과 같이 써주시는거 권장
@Entity
public class User {
    @Id
    public String iduser;
    public String password;
    public String username;
}

// getter setter 안만듬?
// 이유??
// 비효율적인 메모리 접근