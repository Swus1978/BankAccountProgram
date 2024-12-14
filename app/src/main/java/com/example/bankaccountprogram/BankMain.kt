package com.example.bankaccountprogram

fun main(){
    val juanBankAccount = BankAccount("Juan Gustavo Quinones", 150000.00)
    val damianBankAccount = BankAccount("Damiano Michael Quinones", 150000.00)

    juanBankAccount.deposit(500.00)
    juanBankAccount.withdraw(5000.00)
    juanBankAccount.deposit(7000.0)
    juanBankAccount.deposit(7500.0)
    juanBankAccount.withdraw(1500.00)

    juanBankAccount.displayTransactionHistory()
    println("${juanBankAccount.accountHolder}" + "" + "balance is ${juanBankAccount.acctBalance()}")


    println("***********************************************************************************")

    damianBankAccount.deposit(500.0)
    damianBankAccount.deposit(1500.00)
    damianBankAccount.withdraw(750.00)


    damianBankAccount.displayTransactionHistory()
    println("${damianBankAccount.accountHolder}" + "" + "balance is ${damianBankAccount.acctBalance()}")


}