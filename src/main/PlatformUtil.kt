import java.time.Clock
import java.time.LocalDateTime

interface Platform{
    fun currentTime(): LocalDateTime
}

class PlatformSG:Platform{

    private var clock = Clock.systemDefaultZone()

    override fun currentTime(): LocalDateTime {
        return LocalDateTime.now(clock)
    }
}