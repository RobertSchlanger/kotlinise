open class Account {
    var balance: Float = 0.0f

    open fun withdraw(amount: Float): Boolean {
        if(amount < 0.0) {
            return false
        }
        balance -= amount
        return true
    }

    open fun deposit(amount: Float): Boolean {
        if(amount < 0.0) {
            return false
        }
        balance += amount
        return true
    }
}

class SavingAccount: Account() {
    override fun withdraw(amount: Float): Boolean {
        if(amount < 0.0) {
            return false
        }
        if(balance - amount >= 0.0) {
            balance -= amount
            return true
        }
        return false
    }
}

val savingAccount: Account = SavingAccount()
val account: Account = Account()
account.withdraw(100.0f)
savingAccount.withdraw(100.0f)
savingAccount.deposit(50.0f)
savingAccount.withdraw(25.5f)