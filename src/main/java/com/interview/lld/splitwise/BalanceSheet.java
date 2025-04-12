package com.interview.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Author: Prashant K Singh
 * Date: 13/04/2025
 * Time: 00:26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalanceSheet {
   private List<Expense> expenses;
   private Map<Integer, Map<Integer, Double>> balances;

   public Expense addExpense(){
       //Logic
       return null;
   }
   public void addBalance(User from, User to, Double amount){
       //Logic
   }
   public void viewBalanceSheet(){
       //Logic
   }
}
