package com.loanmanagementsystem.Service.impl;

import com.loanmanagementsystem.Entity.Loan;
import com.loanmanagementsystem.Repository.LoanRepository;
import com.loanmanagementsystem.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {
   @Autowired
   private LoanRepository loanRepository;

    @Override
    public List<Loan> getAllLoan() {
        return loanRepository.findAll();
    }

    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).get();
    }

    @Override
    public Loan updateLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public void deleteLoantById(Long id) {
        loanRepository.deleteById(id);
    }

    public List<Loan> getByKeyword(String keyword){
        return loanRepository.findByKeyword(keyword);
    }

}
