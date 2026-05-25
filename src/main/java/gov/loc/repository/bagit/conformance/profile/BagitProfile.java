package gov.loc.repository.bagit.conformance.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * POJO for all the bagit profile fields.
 * A bagit profile is used to ensure the bag metadata contains all required elements and optional elements follow allowed values
 */
public class BagitProfile {

    private String bagitProfileIdentifier = "";

    private String sourceOrganization = "";

    private String externalDescription = "";

    private String contactName = "";

    private String contactEmail = "";

    private String version = "";

    private Map<String, BagInfoRequirement> bagInfoRequirements = new HashMap<>();

    private List<String> manifestTypesRequired = new ArrayList<>();

    //defaults to false
    private boolean fetchFileAllowed;

    private Serialization serialization = Serialization.optional;

    private List<String> acceptableMIMESerializationTypes = new ArrayList<>();

    private List<String> acceptableBagitVersions = new ArrayList<>();

    private List<String> tagManifestTypesRequired = new ArrayList<>();

    private List<String> tagFilesRequired = new ArrayList<>();

    @Override
    public boolean equals(final Object other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, BagInfoRequirement> getBagInfoRequirements() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBagInfoRequirements(final Map<String, BagInfoRequirement> bagInfo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getManifestTypesRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setManifestTypesRequired(final List<String> manifestsRequired) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFetchFileAllowed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFetchFileAllowed(final boolean allowFetchFile) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Serialization getSerialization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSerialization(final Serialization serialization) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getAcceptableMIMESerializationTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAcceptableMIMESerializationTypes(final List<String> acceptSerialization) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getAcceptableBagitVersions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAcceptableBagitVersions(final List<String> acceptBagitVersion) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getTagManifestTypesRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTagManifestTypesRequired(final List<String> tagManifestsRequired) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getTagFilesRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTagFilesRequired(final List<String> tagFilesRequired) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBagitProfileIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBagitProfileIdentifier(final String bagitProfileIdentifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSourceOrganization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSourceOrganization(final String sourceOrganization) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getExternalDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setExternalDescription(final String externalDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getContactName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactName(final String contactName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getContactEmail() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContactEmail(final String contactEmail) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setVersion(final String version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
