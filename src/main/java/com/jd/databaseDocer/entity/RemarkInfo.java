package com.jd.databaseDocer.entity;

/**
 * 备注信息
 * Created by yanghui10 on 2016/8/22.
 */
public class RemarkInfo{
    private int code;
    private int Pcode;//父字典码
    private String desc;
    private String valid;
    public RemarkInfo(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public RemarkInfo(int code, int pcode, String desc, String valid) {
        this.code = code;
        Pcode = pcode;
        this.desc = desc;
        this.valid = valid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public int getPcode() {
        return Pcode;
    }

    public void setPcode(int pcode) {
        Pcode = pcode;
    }
}
