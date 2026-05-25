package gov.loc.repository.bagit.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.loc.repository.bagit.domain.FetchItem;
import gov.loc.repository.bagit.exceptions.InvalidBagitFileFormatException;
import gov.loc.repository.bagit.exceptions.MaliciousPathException;

/**
 * This class is responsible for reading and parsing fetch.txt file from the filesystem
 */
public final class FetchReader {

    private static final Logger logger = LoggerFactory.getLogger(FetchReader.class);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private static final String FETCH_LINE_REGEX = ".*[ \t]*(\\d*|-)[ \t]*.*";

    private FetchReader() {
        //intentionally left empty
    }

    /**
     * Reads a fetch.txt file
     *
     * @param fetchFile the specific fetch file
     * @param encoding the encoding to read the file with
     * @param bagRootDir the root directory of the bag
     * @return a list of items to fetch
     *
     * @throws IOException if there is a problem reading a file
     * @throws MaliciousPathException if the path was crafted to point outside the bag directory
     * @throws InvalidBagitFileFormatException if the fetch format does not follow the bagit specification
     */
    @SuppressWarnings("PMD.AvoidInstantiatingObjectsInLoops")
    public static List<FetchItem> readFetch(final Path fetchFile, final Charset encoding, final Path bagRootDir) throws IOException, MaliciousPathException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
