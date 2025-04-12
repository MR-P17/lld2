package com.interview.lld.splitwise;

import com.interview.lld.splitwise.enums.ExpenseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    private Integer expenseId;
    private Double amount;
    private User paidBy;
    private List<Split> splits;
    private ExpenseType expenseType;
}
