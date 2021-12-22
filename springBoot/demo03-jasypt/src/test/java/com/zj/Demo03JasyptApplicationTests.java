package com.zj;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo03JasyptApplicationTests {

    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    void generatePW() {
        System.out.println(stringEncryptor.encrypt("root"));
        System.out.println(stringEncryptor.encrypt("123321"));
        System.out.println(stringEncryptor.encrypt("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC"));
    }

}
