package com.bbva.repository;

import com.bbva.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by jorge on 5/01/17.
 */

@Repository("logRepository")
public interface LogRepository extends JpaRepository<Log, Serializable> {
}
