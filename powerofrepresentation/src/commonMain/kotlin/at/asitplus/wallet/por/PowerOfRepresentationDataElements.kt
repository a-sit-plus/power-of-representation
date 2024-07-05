package at.asitplus.wallet.por


object PowerOfRepresentationDataElements {

    /** Identifier of the legal person (eIDAS specifications 1.3). */
    const val LEGAL_PERSON_IDENTIFIER = "legal_person_identifier"

    /** Name of the legal person (eIDAS specifications 1.3). */
    const val LEGAL_NAME = "legal_name"

    /** Indication whether natural person has full powers to represent the company. */
    const val FULL_POWERS = "full_powers"

    /** The service for which the natural person has the power to represent the company. */
    const val E_SERVICE = "eService"

    /** Date from which the power to represent the company is effective. The date is included in the validity period,
     *  so on this date the powers are valid. */
    const val EFFECTIVE_FROM_DATE = "effective_from_date"

    /** Date until which the power to represent the company is effective. The date is included in the validity period,
     *  so on this date the powers are valid. */
    const val EFFECTIVE_UNTIL_DATE = "effective_until_date"

    /** Date and time when the PoR attestation was issued */
    const val ISSUANCE_DATE = "issuance_date"

    /** Date and time when the PoR attestation will expire. */
    const val EXPIRY_DATE = "expiry_date"

    /** Name of the administrative authority that has issued this PoR attestation, or the ISO 3166 Alpha-2 country code
     *  of the respective Member State if there is no separate authority authorized to issue PoR attestations. */
    const val ISSUING_AUTHORITY = "issuing_authority"

    /** A number for the PoR attestation, assigned by the Provider. */
    const val DOCUMENT_NUMBER = "document_number"

    /** A number assigned by the PoR attestation Provider for audit control or other purposes. */
    const val ADMINISTRATIVE_NUMBER = "administrative_number"

    /** Alpha-2 country code, as defined in ISO 3166-1, of the CoR attestation Provider’s country or territory. */
    const val ISSUING_COUNTRY = "issuing_country"

    /** Country subdivision code of the jurisdiction that issued the CoR attestation, as defined in ISO 3166-2:2020,
     *  Clause 8. The first part of the code SHALL be the same as the value for issuing_country. */
    const val ISSUING_JURISDICTION = "issuing_jurisdiction"

    val MANDATORY_ELEMENTS = listOf(
        LEGAL_PERSON_IDENTIFIER,
        LEGAL_NAME,
        FULL_POWERS,
        EFFECTIVE_FROM_DATE,
        ISSUANCE_DATE,
        EXPIRY_DATE,
        ISSUING_AUTHORITY,
        ISSUING_COUNTRY,
    )

    val ALL_ELEMENTS = listOf(
        LEGAL_PERSON_IDENTIFIER,
        LEGAL_NAME,
        FULL_POWERS,
        E_SERVICE,
        EFFECTIVE_FROM_DATE,
        EFFECTIVE_UNTIL_DATE,
        ISSUANCE_DATE,
        EXPIRY_DATE,
        ISSUING_AUTHORITY,
        DOCUMENT_NUMBER,
        ADMINISTRATIVE_NUMBER,
        ISSUING_COUNTRY,
        ISSUING_JURISDICTION,
    )

}
