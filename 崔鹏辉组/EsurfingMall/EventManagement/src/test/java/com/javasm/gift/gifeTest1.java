package com.javasm.gift;

import com.javasm.gift.entity.Gift;
import com.javasm.gift.mapper.GiftMapper;
import com.javasm.gift.service.IGiftService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: SamCui
 * @date: 2021/12/310:42
 * @className: gifeTest1
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */
@SpringBootTest
public class gifeTest1 {

    @Autowired
    private GiftMapper gif;
    @Test
    public void selectById(){
        Gift gift = gif.selectById("1");
        System.out.println(gift);
    }
}
