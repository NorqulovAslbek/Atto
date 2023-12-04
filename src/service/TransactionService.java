package service;

import dto.Transaction;
import enums.TransactionType;
import repository.TransactionRepository;

import java.time.LocalDateTime;

public class TransactionService {
    private TransactionRepository transactionRepository = new TransactionRepository();

    public void createTransaction(Integer cardId, Integer terminalId, Double amount, TransactionType type) {
        Transaction transaction = new Transaction();
        transaction.setCardId(cardId);
        transaction.setTerminalId(terminalId);
        transaction.setAmount(amount);
        transaction.setTransactionType(type);
        transaction.setCreatedDate(LocalDateTime.now());

        transactionRepository.createTransaction(transaction);
    }
}
