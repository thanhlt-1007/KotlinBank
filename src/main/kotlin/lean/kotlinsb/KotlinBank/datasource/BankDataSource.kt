package lean.kotlinsb.KotlinBank.datasource

import lean.kotlinsb.KotlinBank.model.Bank

interface BankDataSource {
  fun retrieveBanks() : Collection<Bank>
}
