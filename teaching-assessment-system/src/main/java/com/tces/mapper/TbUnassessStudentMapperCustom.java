package com.tces.mapper;

import com.tces.pojo.TbUnassessStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUnassessStudentMapperCustom {
     List<TbUnassessStudent> findByBatchAndStudentId(Integer studentId);
}
