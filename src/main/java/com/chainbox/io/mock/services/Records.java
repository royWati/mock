package com.chainbox.io.mock.services;

import com.chainbox.io.mock.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Records {
    Record addRecord(Record record);
    Page fetchAll(Pageable pageable);
}
