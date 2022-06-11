package com.green.team4.mapperTests;

import com.green.team4.mapper.shop.ReviewMapper;
import com.green.team4.service.shop.ReviewService;
import com.green.team4.vo.shop.ReviewVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ReviewMapperTest {

    @Autowired
    private ReviewMapper mapper;

    @Autowired
    private ReviewService reviewService;

    @Test
    public void testGetList(){

        
    }
    @Test
    public void testGetList2(){

        
    }

    @Test
    public void testInsert(){


        for (int i = 0; i < 1000; i++) {
            ReviewVO rvo = new ReviewVO();
            rvo.setMno(i);
            rvo.setPno((int)(Math.random()*20));
            rvo.setRContent("참 잘샀어요!" + i);
            rvo.setRRating((int)(Math.random()*5));
            rvo.setRRegdate(new Date());
            rvo.setRUpdatedate(new Date());
            reviewService.write(rvo);
        }
    }
    @Test
    public void testInsert2(){


        for (int i = 0; i < 20; i++) {
            ReviewVO rvo = new ReviewVO();
            rvo.setMno(i);
            rvo.setPno(201);
            rvo.setRContent("참 잘샀어요!" + i);
            rvo.setRRating((int)(Math.random()*5));
            rvo.setRRegdate(new Date());
            rvo.setRUpdatedate(new Date());
            reviewService.write(rvo);
        }
    }
    @Test
    public void testInsertService(){
        for (int i = 0; i < 10; i++) {
            ReviewVO rvo = new ReviewVO();
            rvo.setMno(1);
            rvo.setPno(1);
            rvo.setRContent("참 잘샀어요!fdsf");
            rvo.setRRating(5);
            rvo.setRRegdate(new Date());
            rvo.setRUpdatedate(new Date());
            reviewService.write(rvo);

        }
    }
}
