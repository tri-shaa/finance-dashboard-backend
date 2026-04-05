
package org.example.finance.controller;

import org.example.finance.service.FinancialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private FinancialRecordService service;

    @GetMapping("/summary")
    public Map<String, Object> getSummary() {

        double income = service.getTotalIncome();
        double expense = service.getTotalExpense();

        Map<String, Object> response = new HashMap<>();
        response.put("totalIncome", income);
        response.put("totalExpense", expense);
        response.put("balance", income - expense);

        return response;
    }
}