package at.asitplus.wallet.por

import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialRepresentation.SD_JWT
import at.asitplus.wallet.lib.data.ConstantIndex.CredentialScheme

object PowerOfRepresentationScheme : CredentialScheme {

    override val schemaUri: String = "https://wallet.a-sit.at/schemas/1.0.0/por.json"
    override val sdJwtType: String = "urn:eu.europa.ec.eudi:por:1"
    override val isoNamespace: String  = "eu.europa.ec.eudi.por.1"
    override val supportedRepresentations: Collection<CredentialRepresentation> =
        listOf(SD_JWT)
    override val claimNames = PowerOfRepresentationDataElements.ALL_ELEMENTS
}
