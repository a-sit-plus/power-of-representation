package io.kotest.provided

import at.asitplus.test.XmlReportingProjectConfig
import at.asitplus.wallet.por.Initializer

class ProjectConfig : XmlReportingProjectConfig() {
    init {
        Initializer.initWithVCK()
    }
}