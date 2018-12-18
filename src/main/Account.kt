class Account {

    var balance=0
    var operations = arrayListOf<Operation>()

    fun deposit(amount: Int) {
        balance += amount
        operations.add(Operation(amount,"DEPOSIT",balance))
    }

    fun withdraw(amount: Int) {
        balance -= amount
        operations.add(Operation(amount,"WITHDRAWAL",balance))
    }

    fun getHistory():String{
        var history = ""
        operations.forEach{
            history += it.toString()+"\n"
        }
        return history
    }
}