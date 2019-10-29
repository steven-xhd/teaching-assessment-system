package com.tces.mapper;

import com.tces.pojo.TbAssessResultVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAssessResultMapperCustom {
    List<TbAssessResultVo> findScoreByUserId(Integer userId);
}
