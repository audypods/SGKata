
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.time.LocalDateTime

class MockPlatform:Platform{
    override fun currentTime(): LocalDateTime {
        return LocalDateTime.of(2018,12,13,15,12,5,5)
    }
}

class appTest {

    @Before
    fun before() {
        platform = MockPlatform()
    }

    @Test
    fun shouldAddMoneyToAccount() {
        //Given
        val account = Account()
        account.balance = 20
        //When
        account.deposit(300)
        //Then
        Assert.assertEquals(320, account.balance)
    }

    @Test
    fun shouldRemoveMoneyFromAccount(){
        //Given
        val account = Account()
        account.balance = 350
        //When
        account.withdraw(70)
        //Then
        Assert.assertEquals(280, account.balance)
    }

    @Test
    fun shouldReturnHistory(){
        //Given
        val account = Account()
        account.deposit(70)
        account.withdraw(40)
        //When
        var history = account.getHistory()
        //Then
        Assert.assertEquals("A DEPOSIT has been made of 70€ on 13-12-2018 15:12:05.000. The current balance is now 70.\n" +
                "A WITHDRAWAL has been made of 40€ on 13-12-2018 15:12:05.000. The current balance is now 30.\n",history)
    }
}
