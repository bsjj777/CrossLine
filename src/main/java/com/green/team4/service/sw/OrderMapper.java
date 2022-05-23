package com.green.team4.service.sw;

import com.green.team4.vo.sw.OrderVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<OrderVO> getAll(int mno); // 데이터 전체 가져오기(mno 단위로)
    OrderVO getOne(String ono); // 데이터 하나 가져오기(ono 단위로)
    int update(OrderVO orderVO);
    // 주문 취소는 일반회원 신청 => 관리자(사업자) 내용 확인 => 관리자가 주문 상태 취소로 변경
    // 데이터 삭제는 없음(history는 db에 취소 상태로 계속 남김)

    //관리자
    List<OrderVO> getAllAdmin();
}
