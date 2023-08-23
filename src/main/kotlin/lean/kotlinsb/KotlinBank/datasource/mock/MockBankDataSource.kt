package lean.kotlinsb.KotlinBank.datasource.mock

import org.springframework.stereotype.Repository

import lean.kotlinsb.KotlinBank.model.Bank
import lean.kotlinsb.KotlinBank.datasource.BankDataSource

@Repository
class MockBankDataSource : BankDataSource {
  override fun retrieveBanks() : Collection<Bank> {
    val bank = Bank(accountNumber = "", trust = 0.0, transactionFee = 1)
    val banks = listOf(
      Bank(accountNumber = "1234", trust = 3.14, transactionFee = 17),
      Bank(accountNumber = "1010", trust = 1.14, transactionFee = 17),
      Bank(accountNumber = "1234", trust = 3.14, transactionFee = 17)
    )
    return banks
  }
}
