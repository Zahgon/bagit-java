package gov.loc.repository.bagit.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.loc.repository.bagit.domain.Bag;
import gov.loc.repository.bagit.domain.Manifest;
import gov.loc.repository.bagit.exceptions.InvalidBagitFileFormatException;
import gov.loc.repository.bagit.exceptions.MaliciousPathException;
import gov.loc.repository.bagit.exceptions.UnsupportedAlgorithmException;
import gov.loc.repository.bagit.hash.BagitAlgorithmNameToSupportedAlgorithmMapping;
import gov.loc.repository.bagit.hash.SupportedAlgorithm;
import gov.loc.repository.bagit.util.PathUtils;

/**
 * This class is responsible for reading and parsing manifest files on the filesystem
 */
public final class ManifestReader {

    private static final Logger logger = LoggerFactory.getLogger(ManifestReader.class);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private ManifestReader() {
        //intentionally left empty
    }

    /**
     * Finds and reads all manifest files in the rootDir and adds them to the given bag.
     *
     * @param nameMapping a map between BagIt algorithm names and {@link MessageDigest} names
     * @param rootDir the directory that contain the manifest(s)
     * @param bag to update with the manifests
     *
     * @throws IOException if there is a problem reading a file
     * @throws MaliciousPathException if there is path that is referenced in the manifest that is outside the bag root directory
     * @throws UnsupportedAlgorithmException if the manifest uses a algorithm that isn't supported
     * @throws InvalidBagitFileFormatException if the manifest is not formatted properly
     */
    static void readAllManifests(final BagitAlgorithmNameToSupportedAlgorithmMapping nameMapping, final Path rootDir, final Bag bag) throws IOException, MaliciousPathException, UnsupportedAlgorithmException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
   * Get a list of all the tag and payload manifests
   */
    private static DirectoryStream<Path> getAllManifestFiles(final Path rootDir) throws IOException {
        final DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {

            @Override
            public boolean accept(final Path file) throws IOException {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
        return Files.newDirectoryStream(rootDir, filter);
    }

    /**
     * Reads a manifest file and converts it to a {@link Manifest} object.
     *
     * @param nameMapping a map between BagIt algorithm names and {@link MessageDigest} names
     * @param manifestFile a specific manifest file
     * @param bagRootDir the root directory of the bag
     * @param charset the encoding to use when reading the manifest file
     * @return the converted manifest object from the file
     *
     * @throws IOException if there is a problem reading a file
     * @throws MaliciousPathException if there is path that is referenced in the manifest that is outside the bag root directory
     * @throws UnsupportedAlgorithmException if the manifest uses a algorithm that isn't supported
     * @throws InvalidBagitFileFormatException if the manifest is not formatted properly
     */
    public static Manifest readManifest(final BagitAlgorithmNameToSupportedAlgorithmMapping nameMapping, final Path manifestFile, final Path bagRootDir, final Charset charset) throws IOException, MaliciousPathException, UnsupportedAlgorithmException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
   * read the manifest file into a map of files and checksums
   */
    static Map<Path, String> readChecksumFileMap(final Path manifestFile, final Path bagRootDir, final Charset charset) throws IOException, MaliciousPathException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
