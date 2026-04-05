

package org.example.finance.repository;

import org.example.finance.model.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinancialRecordRepository extends JpaRepository<FinancialRecord, Long> {

    List<FinancialRecord> findByType(String type);
    List<FinancialRecord> findByCategory(String category);

    List<FinancialRecord> findByUserId(Long userId);
}
