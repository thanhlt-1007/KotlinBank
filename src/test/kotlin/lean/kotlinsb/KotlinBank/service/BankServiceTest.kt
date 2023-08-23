package lean.kotlinsb.KotlinBank.service

import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import lean.kotlinsb.KotlinBank.datasource.BankDataSource

internal class BankServiceTest {
  private val bankDataSource: BankDataSource = mockk(relaxed = true)
  private val bankService = BankService(bankDataSource)

  @Test
  fun `should call its data source to retrieve banks`() {
    bankService.getBanks()

    verify(exactly = 1) { bankDataSource.retrieveBanks() }
  }
}
