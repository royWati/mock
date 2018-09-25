package com.chainbox.io.mock.services;

import com.chainbox.io.mock.DO.Response;
import com.chainbox.io.mock.entities.Record;
import com.chainbox.io.mock.exceptions.StartResponse;
import com.chainbox.io.mock.exceptions.missingRecords;
import com.chainbox.io.mock.repos.RecordsRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class RecordsImpl implements Records {

    private final RecordsRepo repo;

    public RecordsImpl(RecordsRepo repo) {
        this.repo = repo;
    }

    @Override
    public Response addRecord(Record records) {

        if (records.getKeyWord().isEmpty() ||
                records.getRefrenceCode().isEmpty()){
            throw new missingRecords();
        }

            Response response = new Response();
            if(Objects.equals(records.getKeyWord().toUpperCase(), "START")){

               records.setStatus(HttpStatus.ACCEPTED.value());

               response.setCode(HttpStatus.ACCEPTED.value());
               response.setReason(HttpStatus.ACCEPTED);

            }else if (Objects.equals(records.getKeyWord().toUpperCase(), "STOP")){

                records.setStatus(HttpStatus.OK.value());

                response.setCode(HttpStatus.OK.value());
                response.setReason(HttpStatus.OK);

            }else if (Objects.equals(records.getKeyWord().toUpperCase(), "KILL")){

                records.setStatus(HttpStatus.FORBIDDEN.value());

                response.setCode(HttpStatus.FORBIDDEN.value());
                response.setReason(HttpStatus.FORBIDDEN);

            }else if(Objects.equals(records.getKeyWord().toUpperCase(), "INITIATE")){

                records.setStatus(HttpStatus.PROCESSING.value());

                response.setCode(HttpStatus.PROCESSING.value());
                response.setReason(HttpStatus.PROCESSING);

            }else{
                throw new missingRecords();
            }

            repo.save(records);
            return response;

    }

    @Override
    public Page fetchAll(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
