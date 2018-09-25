package com.chainbox.io.mock.entities;

import org.springframework.http.HttpStatus;

import javax.persistence.Entity;

@Entity
public class Record extends BaseEntity {

    private long shortCode;
    private long MSISDN;
    private String KeyWord;
    private int status;
    private String refrenceCode;

    public Record(long shortCode, long MSISDN, String keyWord, int status) {
        this.shortCode = shortCode;
        this.MSISDN = MSISDN;
        KeyWord = keyWord;
        this.status = status;
    }

    public Record() {
    }

    public long getShortCode() {
        return shortCode;
    }

    public void setShortCode(long shortCode) {
        this.shortCode = shortCode;
    }

    public long getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(long MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String keyWord) {
        KeyWord = keyWord;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRefrenceCode() {
        return refrenceCode;
    }

    public void setRefrenceCode(String refrenceCode) {
        this.refrenceCode = refrenceCode;
    }
}
