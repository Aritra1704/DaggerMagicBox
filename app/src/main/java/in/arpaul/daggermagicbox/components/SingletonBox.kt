package `in`.arpaul.daggermagicbox.components

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface SingletonBox {
    fun getMagicBox(): MagicBox
}