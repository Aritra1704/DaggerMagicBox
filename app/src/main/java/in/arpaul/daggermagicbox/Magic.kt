package `in`.arpaul.daggermagicbox

import javax.inject.Inject
import javax.inject.Singleton

var staticCounter = 0

@Singleton
class SingletonOne @Inject constructor() {
    val count = staticCounter++
}

@MagicScope
class UniqueMagic @Inject constructor() {
    val count = staticCounter++
}

class NormalMagic @Inject constructor() {
    val count = staticCounter++
}