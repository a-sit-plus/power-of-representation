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
    /** Identifier of the legal person (eIDAS specifications 1.3). */
    @SerialName(LEGAL_PERSON_IDENTIFIER)
    val legalPersonIdentifier: String,

    /** Name of the legal person (eIDAS specifications 1.3). */
    @SerialName(LEGAL_NAME)
    val legalName: String,

    /** Indication whether natural person has full powers to represent the company. */
    @SerialName(FULL_POWERS)
    val fullPowers: Boolean,

    /** The service for which the natural person has the power to represent the company. */
    @SerialName(E_SERVICE)
    val eService: String? = null,

    /** Date from which the power to represent the company is effective. The date is included in the validity period,
     *  so on this date the powers are valid. */
    @SerialName(EFFECTIVE_FROM_DATE)
    val effectiveFrom: Instant,

    /** Date until which the power to represent the company is effective. The date is included in the validity period,
     *  so on this date the powers are valid. */
    @SerialName(EFFECTIVE_UNTIL_DATE)
    val effectiveUntil: Instant? = null,

    /** Date and time when the PoR attestation was issued */
    @SerialName(ISSUANCE_DATE)
    val issuanceDate: Instant,

    /** Date and time when the PoR attestation will expire. */
    @SerialName(EXPIRY_DATE)
    val expiryDate: Instant,

    /** Name of the administrative authority that has issued this PoR attestation, or the ISO 3166 Alpha-2 country code
     *  of the respective Member State if there is no separate authority authorized to issue PoR attestations. */
    @SerialName(ISSUING_AUTHORITY)
    val issuingAuthority: String,

    /** A number for the PoR attestation, assigned by the Provider. */
    @SerialName(DOCUMENT_NUMBER)
    val documentNumber: String? = null,

    /** A number assigned by the PoR attestation Provider for audit control or other purposes. */
    @SerialName(ADMINISTRATIVE_NUMBER)
    val administrativeNumber: String? = null,

    /** Alpha-2 country code, as defined in ISO 3166-1, of the CoR attestation Provider’s country or territory. */
    @SerialName(ISSUING_COUNTRY)
    val issuingCountry: String,

    /** Country subdivision code of the jurisdiction that issued the CoR attestation, as defined in ISO 3166-2:2020,
     *  Clause 8. The first part of the code SHALL be the same as the value for issuing_country. */
    @SerialName(ISSUING_JURISDICTION)
    val issuingJurisdiction: String? = null,
)

