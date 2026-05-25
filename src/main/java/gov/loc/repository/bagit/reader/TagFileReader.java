package gov.loc.repository.bagit.reader;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import gov.loc.repository.bagit.exceptions.InvalidBagitFileFormatException;
import gov.loc.repository.bagit.exceptions.MaliciousPathException;
import gov.loc.repository.bagit.util.PathUtils;

/**
 * Convenience class for reading tag files from the filesystem
 */
public interface TagFileReader {

    Logger logger = LoggerFactory.getLogger(TagFileReader.class);

    ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    String ERROR_PREFIX = "Path [";

    /*
   * Create the file and check it for various things, like starting with a *, or trying to access a file outside the bag
   */
    static Path createFileFromManifest(final Path bagRootDir, final String path) throws MaliciousPathException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
