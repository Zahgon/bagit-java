package gov.loc.repository.bagit.domain;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import gov.loc.repository.bagit.hash.SupportedAlgorithm;

/**
 * A manifest is a list of files and their corresponding checksum with the algorithm used to generate that checksum
 */
public final class Manifest {

    private final SupportedAlgorithm algorithm;

    private Map<Path, String> fileToChecksumMap = new HashMap<>();

    public Manifest(final SupportedAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Map<Path, String> getFileToChecksumMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFileToChecksumMap(final Map<Path, String> fileToChecksumMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SupportedAlgorithm getAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
