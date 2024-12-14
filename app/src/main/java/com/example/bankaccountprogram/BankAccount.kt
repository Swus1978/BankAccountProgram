package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()
    // Deposit
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }
    // Withdraw
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            // We can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder deposited $$amount")

        }else{
            // We cannot withdraw money
            println("You don't have the funds to withdrew $$amount")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory) {
            println(transaction)
        }

    }

    fun acctBalance(): Double {
        return this.balance
    }
}