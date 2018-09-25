package com.chainbox.io.mock.entities;

import org.springframework.http.HttpStatus;

import javax.persistence.Entity;

@Entity
public class Record extends BaseEntity {

    private long shortCode;
    private long MSISDN;
    private long KeyWord;
    private int status;

    public Record(long shortCode, long MSISDN, long keyWord, int status) {
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

    public long getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(long keyWord) {
        KeyWord = keyWord;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
