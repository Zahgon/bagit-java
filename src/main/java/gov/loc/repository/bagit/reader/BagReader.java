package gov.loc.repository.bagit.reader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractMap.SimpleImmutableEntry;
import gov.loc.repository.bagit.domain.Bag;
import gov.loc.repository.bagit.domain.Version;
import gov.loc.repository.bagit.exceptions.InvalidBagMetadataException;
import gov.loc.repository.bagit.exceptions.InvalidBagitFileFormatException;
import gov.loc.repository.bagit.exceptions.MaliciousPathException;
import gov.loc.repository.bagit.exceptions.UnparsableVersionException;
import gov.loc.repository.bagit.exceptions.UnsupportedAlgorithmException;
import gov.loc.repository.bagit.hash.BagitAlgorithmNameToSupportedAlgorithmMapping;
import gov.loc.repository.bagit.hash.StandardBagitAlgorithmNameToSupportedAlgorithmMapping;

/**
 * Responsible for reading a bag from the filesystem.
 */
public final class BagReader {

    private final BagitAlgorithmNameToSupportedAlgorithmMapping nameMapping;

    public BagReader() {
        this.nameMapping = new StandardBagitAlgorithmNameToSupportedAlgorithmMapping();
    }

    public BagReader(final BagitAlgorithmNameToSupportedAlgorithmMapping nameMapping) {
        this.nameMapping = nameMapping;
    }

    /**
     * Read the bag from the filesystem and create a bag object
     *
     * @param rootDir the root directory of the bag
     * @throws IOException if there is a problem reading a file
     * @return a {@link Bag} object representing a bag on the filesystem
     *
     * @throws UnparsableVersionException If there is a problem parsing the bagit version
     * @throws MaliciousPathException if there is path that is referenced in the manifest or fetch file that is outside the bag root directory
     * @throws InvalidBagMetadataException if the metadata or bagit.txt file does not conform to the bagit spec
     * @throws UnsupportedAlgorithmException if the manifest uses a algorithm that isn't supported
     * @throws InvalidBagitFileFormatException if the manifest or fetch file is not formatted properly
     */
    public Bag read(final Path rootDir) throws IOException, UnparsableVersionException, MaliciousPathException, InvalidBagMetadataException, UnsupportedAlgorithmException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BagitAlgorithmNameToSupportedAlgorithmMapping getNameMapping() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
