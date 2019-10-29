package com.tces.pojo;

public class TbGrade {
    private Integer id;

    private Integer lessonInfoId;

    private Double socre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonInfoId() {
        return lessonInfoId;
    }

    public void setLessonInfoId(Integer lessonInfoId) {
        this.lessonInfoId = lessonInfoId;
    }

    public Double getSocre() {
        return socre;
    }

    public void setSocre(Double socre) {
        this.socre = socre;
    }
}