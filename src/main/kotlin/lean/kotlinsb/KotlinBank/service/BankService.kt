package lean.kotlinsb.KotlinBank.service

import org.springframework.stereotype.Service

import lean.kotlinsb.KotlinBank.model.Bank
import lean.kotlinsb.KotlinBank.datasource.BankDataSource

@Service
class BankService(private val bankDataSource: BankDataSource) {
  fun getBanks() : Collection<Bank> {
    return bankDataSource.retrieveBanks()
  }
}
