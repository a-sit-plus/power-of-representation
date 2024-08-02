package at.asitplus.wallet.por

import at.asitplus.wallet.lib.LibraryInitializer

object Initializer {

    /**
     * A reference to this class is enough to trigger the init block
     */
    init {
        initWithVCK()
    }

    /**
     * This has to be called first, before anything first, to load the
     * relevant classes of this library into the base implementations of vclib
     */
    fun initWithVCK() {
        LibraryInitializer.registerExtensionLibrary(
            credentialScheme = PowerOfRepresentationScheme,
        )
    }

}
