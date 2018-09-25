package com.chainbox.io.mock.repos;

import com.chainbox.io.mock.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecordsRepo extends JpaRepository<Record,UUID>{

}
