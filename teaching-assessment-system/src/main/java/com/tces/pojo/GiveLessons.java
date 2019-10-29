package com.tces.pojo;

import lombok.Data;

/**
 * 授课信息
 */
@Data
public class GiveLessons {
    private Integer id;
    private Integer batchId;
    private String batchName;
    private Integer classId;
    private String className;
    private Integer lessonId;
    private String lessonName;
    private Integer userId;
    private String username;
    private Integer depId;
    private String depName;
}
