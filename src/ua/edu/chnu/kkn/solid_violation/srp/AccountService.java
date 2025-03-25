package ua.edu.chnu.kkn.solid_violation.srp;

import java.util.List;

public class AccountService
{
    private final TransactionRepository transactionRepository;
    private final Clock clock;
    private final StatementPrinter statementPrinter;

    public AccountService(TransactionRepository transactionRepository, Clock clock, StatementPrinter statementPrinter)
    {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount)
    {
        transactionRepository.add(transactionWith(amount));
    }

    public void withdraw(int amount)
    {
        transactionRepository.add(transactionWith(-amount));
    }

    public void printStatement()
    {
        List<Transaction> transactions = transactionRepository.all();
        statementPrinter.print(transactions);
    }

    private Transaction transactionWith(int amount)
    {
        return new Transaction(clock.today(), amount);
    }
}