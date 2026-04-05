

package org.example.finance.controller;

import org.example.finance.model.FinancialRecord;
import org.example.finance.service.FinancialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

        import java.util.List;

@RestController
@RequestMapping("/records")
public class FinancialRecordController {

    @Autowired
    private FinancialRecordService service;

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record) {
        return service.create(record);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAll();
    }

    @GetMapping("/type/{type}")
    public List<FinancialRecord> getByType(@PathVariable String type) {
        return service.getByType(type);
    }





    @GetMapping("/user/{userId}")
    public List<FinancialRecord> getByUser(@PathVariable Long userId) {
        return service.getByUser(userId);
    }

    @GetMapping("/category/{category}")
    public List<FinancialRecord> getByCategory(@PathVariable String category) {

        return service.getByCategory(category);
    }

//    public Map<String, Object> getByCategory(@PathVariable String category) {
//
//        List<FinancialRecord> records = service.getByCategory(category);
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("status", "success");
//        response.put("count", records.size());
//        response.put("data", records);
//
//        return response;
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
