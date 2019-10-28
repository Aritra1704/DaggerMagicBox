package `in`.arpaul.daggermagicbox

import javax.inject.Inject

class Storage {
    @Inject lateinit var singletonOne: SingletonOne
    @Inject lateinit var uniqueMagic: UniqueMagic
    @Inject lateinit var normalMagic: NormalMagic
}