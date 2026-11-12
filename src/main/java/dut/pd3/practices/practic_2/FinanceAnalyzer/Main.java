package dut.pd3.practices.practic_2.FinanceAnalyzer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "https://informer.com.ua/dut/java/pr2.csv";

        List<Transaction> transactions = TransactionCSVReader.readTransactions(filePath);

        TransactionAnalyzer analyzer = new TransactionAnalyzer(transactions);

        double totalBalance = analyzer.calculateTotalBalance();
        TransactionReportGenerator.printBalanceReport(totalBalance);

        String monthYear = "01-2024";
        int transactionsCount = analyzer.countTransactionsByMonth(monthYear);
        TransactionReportGenerator.printTransactionsCountByMonth(monthYear, transactionsCount);

        List<Transaction> topExpenses = analyzer.findTopExpenses();
        TransactionReportGenerator.printTopExpensesReport(topExpenses);
    }
}