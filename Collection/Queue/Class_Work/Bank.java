package CLassWork;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bank {
    Queue<Transaction>transactionsCache = new ArrayDeque<>();

    public <E> Bank(ArrayDeque<E> es) {

    }

    public void executesAllTransaction() {
        while(transactionsCache.peek() != null ) {
            transactionsCache.poll().executs();
        }
    }
    public void addTransaction(Transaction transaction) {
        transactionsCache.offer(transaction);
    }

}
