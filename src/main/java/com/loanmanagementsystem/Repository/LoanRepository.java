package com.loanmanagementsystem.Repository;

import com.loanmanagementsystem.Entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Long> {
    @Query(value = "select * from loan l where l.first_name like %:keyword% or l.email like %:keyword%", nativeQuery = true)
    List<Loan> findByKeyword(@Param("keyword") String keyword);
}
