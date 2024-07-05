package at.asitplus.wallet.por

import at.asitplus.wallet.por.PowerOfRepresentationDataElements.ADMINISTRATIVE_NUMBER
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.DOCUMENT_NUMBER
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.EFFECTIVE_FROM_DATE
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.EFFECTIVE_UNTIL_DATE
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.EXPIRY_DATE
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.E_SERVICE
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.FULL_POWERS
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.ISSUANCE_DATE
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.ISSUING_AUTHORITY
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.ISSUING_COUNTRY
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.ISSUING_JURISDICTION
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.LEGAL_NAME
import at.asitplus.wallet.por.PowerOfRepresentationDataElements.LEGAL_PERSON_IDENTIFIER
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PowerOfRepresentation(

    @SerialName(LEGAL_PERSON_IDENTIFIER)
    val legalPersonIdentifier: String,

    @SerialName(LEGAL_NAME)
    val legalName: String,

    @SerialName(FULL_POWERS)
    val fullPowers: Boolean,

    @SerialName(E_SERVICE)
    val eService: String? = null,

    @SerialName(EFFECTIVE_FROM_DATE)
    val effectiveFrom: Instant,

    @SerialName(EFFECTIVE_UNTIL_DATE)
    val effectiveUntil: Instant? = null,

    @SerialName(ISSUANCE_DATE)
    val issuanceDate: Instant,

    @SerialName(EXPIRY_DATE)
    val expiryDate: Instant,

    @SerialName(ISSUING_AUTHORITY)
    val issuingAuthority: String,

    @SerialName(DOCUMENT_NUMBER)
    val documentNumber: String? = null,

    @SerialName(ADMINISTRATIVE_NUMBER)
    val administrativeNumber: String? = null,

    @SerialName(ISSUING_COUNTRY)
    val issuingCountry: String,

    @SerialName(ISSUING_JURISDICTION)
    val issuingJurisdiction: String? = null,
)

