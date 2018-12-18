var platform:Platform = PlatformSG()

fun main(args:Array<String>){
    val account = Account()
    account.deposit(70)
    account.withdraw(40)
    print(account.getHistory())
}