package `in`.arpaul.daggermagicbox.components

import `in`.arpaul.daggermagicbox.MagicScope
import `in`.arpaul.daggermagicbox.Storage
import dagger.Component
import dagger.Subcomponent

@MagicScope
@Subcomponent
interface MagicBox {
    fun poke(storage: Storage)
}