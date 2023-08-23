package lean.kotlinsb.KotlinBank.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class MockBankDataSourceTest {
  private val mockBankDataSource = MockBankDataSource()

  @Test
  fun `should provide a collection of banks`() {
    val banks = mockBankDataSource.retrieveBanks()
    assertThat(banks).isNotEmpty
    assertThat(banks.size).isGreaterThanOrEqualTo(3)
  }

  @Test
  fun `should provide some mock data`() {
    val banks = mockBankDataSource.retrieveBanks()
    assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
    assertThat(banks).anyMatch { it.trust != 0.0 }
    assertThat(banks).anyMatch { it.transactionFee != 0 }
  }
}
