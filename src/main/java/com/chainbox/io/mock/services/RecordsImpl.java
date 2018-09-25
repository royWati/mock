package com.chainbox.io.mock.services;

import com.chainbox.io.mock.entities.Record;
import com.chainbox.io.mock.exceptions.missingRecords;
import com.chainbox.io.mock.repos.RecordsRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;

@Service
public class RecordsImpl implements Records {

    private final RecordsRepo repo;

    public RecordsImpl(RecordsRepo repo) {
        this.repo = repo;
    }

    @Override
    public Record addRecord(Record records) {


            if(records.getKeyWord()<10){
                records.setStatus(HttpStatus.OK.value());
            }else if (records.getKeyWord()<20){
                records.setStatus(HttpStatus.BAD_GATEWAY.value());
            }else if (records.getKeyWord()<30){
                records.setStatus(HttpStatus.BAD_REQUEST.value());
            }else {
                records.setStatus(HttpStatus.ACCEPTED.value());
            }

        return repo.save(records);
    }

    @Override
    public Page fetchAll(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
