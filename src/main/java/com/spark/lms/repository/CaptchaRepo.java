package com.spark.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spark.lms.model.CaptchaEntity;


@Repository
public interface CaptchaRepo extends JpaRepository<CaptchaEntity, Long> {

	

	

}
