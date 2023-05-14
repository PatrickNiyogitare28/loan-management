package com.loanmanagementsystem.Service;

import com.loanmanagementsystem.Entity.Loan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoanService {
    List<Loan> getAllLoan();
    Loan saveLoan(Loan loan);

    Loan getLoanById(Long id);

    Loan updateLoan(Loan loan);

    void deleteLoantById(Long id);
    public List<Loan> getByKeyword(String keyword);
}
