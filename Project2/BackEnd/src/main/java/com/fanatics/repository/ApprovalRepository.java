package com.fanatics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fanatics.models.Approval;

@Repository
public interface ApprovalRepository extends JpaRepository <Approval,Integer>{

}
