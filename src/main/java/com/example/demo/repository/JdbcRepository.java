package com.example.demo.repository;

import com.example.demo.database.DBManager;
import com.example.demo.obj.User;
import org.springframework.stereotype.Repository;

// @ annotation 선언을 해주면 다른 곳에서 호출 가능
@Repository
public class JdbcRepository {
// mysql 접속해서 insert하기
// DDL vs DML

    public void findUsers(){
        DBManager db = new DBManager();
        db.connector("localhost","3306","demo_schema", "test_user", "xptmxm12#");
        User user = (User)db.sendQuery();
        db.disconnector();
    }
}
