package at.asitplus.wallet.por

import at.asitplus.wallet.lib.data.vckJsonSerializer
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.encodeToString
import kotlin.random.Random

class SerializerTest : FunSpec({

    test("serialize credential") {
        val credential = PowerOfRepresentation(
            legalPersonIdentifier = randomString(),
            legalName = randomString(),
            fullPowers = Random.nextBoolean(),
            eService = randomString(),
            effectiveFrom = randomInstant(),
            effectiveUntil = randomInstant(),
            issuanceDate = randomInstant(),
            expiryDate = randomInstant(),
            issuingAuthority = randomString(),
            documentNumber = randomString(),
            administrativeNumber = randomString(),
            issuingCountry = randomString(),
            issuingJurisdiction = randomString(),
        )
        val serialized = vckJsonSerializer.encodeToString(credential)
            .also { println(it) }

        val parsed: PowerOfRepresentation = vckJsonSerializer.decodeFromString(serialized)

        parsed shouldBe credential
    }

})

private fun randomDate() = LocalDate.fromEpochDays(Random.nextInt(0, 1024))

private fun randomInstant() = Instant.fromEpochSeconds(Random.nextLong(0, 1024 * 1024 * 1024))


val charPool = ('A'..'Z') + ('a'..'z') + ('0'..'9')

fun randomString() = (1..16)
    .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
    .joinToString("")
