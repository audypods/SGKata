import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Operation {

    var amount=0
    var type=""
    var balance=0
    var date: LocalDateTime

    constructor(amount: Int, type: String, balance: Int) {
        this.amount = amount
        this.type = type
        this.balance = balance
        this.date = platform.currentTime()
    }

    override fun toString(): String {
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS")
        val formattedDate = date.format(formatter)
        return "A $type has been made of $amount€ on $formattedDate. The current balance is now $balance."
    }

}