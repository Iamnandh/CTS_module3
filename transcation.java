import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class TransactionExample {
    public static void transfer(Connection conn, int fromId, int toId, int amount) throws SQLException {
        conn.setAutoCommit(false);
        try {
            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setInt(1, amount);
            debit.setInt(2, fromId);
            debit.executeUpdate();
            debit.close();

            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setInt(1, amount);
            credit.setInt(2, toId);
            credit.executeUpdate();
            credit.close();

            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        }
    }
}