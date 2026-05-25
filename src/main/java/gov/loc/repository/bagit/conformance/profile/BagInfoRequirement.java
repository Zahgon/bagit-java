package gov.loc.repository.bagit.conformance.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class is used to define elements in a bag-info.txt file used by a bagit-profile.
 */
public class BagInfoRequirement {

    private boolean required;

    private List<String> acceptableValues = new ArrayList<>();

    private boolean repeatable;

    @Override
    public boolean equals(final Object other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BagInfoRequirement() {
        //intentionally left empty
    }

    public BagInfoRequirement(final boolean required, final List<String> acceptableValues) {
        this.required = required;
        this.acceptableValues = acceptableValues;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRequired(final boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getAcceptableValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAcceptableValues(final List<String> acceptableValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRepeatable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRepeatable(final boolean repeatable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
