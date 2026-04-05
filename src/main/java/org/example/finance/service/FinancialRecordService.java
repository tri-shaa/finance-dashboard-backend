

package org.example.finance.service;

import org.example.finance.model.FinancialRecord;
import org.example.finance.repository.FinancialRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialRecordService {

    @Autowired
    private FinancialRecordRepository repo;

    public FinancialRecord create(FinancialRecord record) {
        return repo.save(record);
    }

    public List<FinancialRecord> getAll() {
        return repo.findAll();
    }

    public List<FinancialRecord> getByType(String type) {
        return repo.findByType(type);
    }

    public List<FinancialRecord> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public double getTotalIncome() {
        return repo.findAll()
                .stream()
                .filter(r -> r.getType().equalsIgnoreCase("income"))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public double getTotalExpense() {
        return repo.findAll()
                .stream()
                .filter(r -> r.getType().equalsIgnoreCase("expense"))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public List<FinancialRecord> getByUser(Long userId) {
        return repo.findByUserId(userId);
    }
}
