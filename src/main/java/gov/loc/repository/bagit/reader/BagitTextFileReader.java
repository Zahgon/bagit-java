package gov.loc.repository.bagit.reader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ResourceBundle;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import gov.loc.repository.bagit.domain.Version;
import gov.loc.repository.bagit.exceptions.InvalidBagMetadataException;
import gov.loc.repository.bagit.exceptions.InvalidBagitFileFormatException;
import gov.loc.repository.bagit.exceptions.UnparsableVersionException;

/**
 * This class is responsible for reading and parsing bagit.txt files from the filesystem
 */
public final class BagitTextFileReader {

    private static final Logger logger = LoggerFactory.getLogger(BagitTextFileReader.class);

    private static final byte[] BOM = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private static final Version VERSION_1_0 = new Version(1, 0);

    private static final String LINE1_REGEX = "(BagIt-Version: )\\d*\\.\\d*";

    private static final String LINE2_REGEX = "(Tag-File-Character-Encoding: )\\S*";

    private BagitTextFileReader() {
        //intentionally left empty
    }

    /**
     * Read the bagit.txt file and return the version and encoding.
     *
     * @param bagitFile the bagit.txt file
     * @return the bag {@link Version} and {@link Charset} encoding of the tag files
     *
     * @throws IOException if there is a problem reading a file. The file MUST be in UTF-8 encoding.
     * @throws UnparsableVersionException if there is a problem parsing the bagit version number
     * @throws InvalidBagMetadataException if the bagit.txt file does not conform to "key: value"
     * @throws InvalidBagitFileFormatException if the bagit.txt file does not conform to the bagit spec
     */
    public static SimpleImmutableEntry<Version, Charset> readBagitTextFile(final Path bagitFile) throws IOException, UnparsableVersionException, InvalidBagMetadataException, InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
   * As per the specification, a BOM is not allowed in the bagit.txt file
   */
    private static void throwErrorIfByteOrderMarkIsPresent(final Path bagitFile) throws IOException, InvalidBagitFileFormatException {
        final byte[] firstFewBytesInFile = Arrays.copyOfRange(Files.readAllBytes(bagitFile), 0, BOM.length);
        if (Arrays.equals(BOM, firstFewBytesInFile)) {
            final String formattedMessage = messages.getString("bom_present_error");
            throw new InvalidBagitFileFormatException(MessageFormatter.format(formattedMessage, bagitFile).getMessage());
        }
    }

    /*
   * As per the specification, if version is 1.0+ it must only contain 2 lines of the form
   * BagIt-Version: <M.N>
   * Tag-File-Character-Encoding: <ENCODING>
   */
    static void throwErrorIfLinesDoNotMatchStrict(final List<String> lines) throws InvalidBagitFileFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
   * parses the version string into a {@link Version} object
   */
    public static Version parseVersion(final String version) throws UnparsableVersionException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
