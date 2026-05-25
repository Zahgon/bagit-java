package gov.loc.repository.bagit.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import gov.loc.repository.bagit.exceptions.InvalidBagMetadataException;

/**
 * Convenience class for reading key value pairs from a file
 */
public final class KeyValueReader {

    private static final Logger logger = LoggerFactory.getLogger(KeyValueReader.class);

    private static final String INDENTED_LINE_REGEX = "^\\s+.*";

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private KeyValueReader() {
        //intentionall left blank
    }

    /**
     * Generic method to read key value pairs from the bagit files, like bagit.txt or bag-info.txt
     *
     * @param file the file to read
     * @param splitRegex how to split the key from the value
     * @param charset the encoding of the file
     *
     * @return a list of key value pairs
     *
     * @throws IOException if there was a problem reading the file
     * @throws InvalidBagMetadataException if the file does not conform to pattern of key value
     */
    @SuppressWarnings("PMD.AvoidInstantiatingObjectsInLoops")
    public static List<SimpleImmutableEntry<String, String>> readKeyValuesFromFile(final Path file, final String splitRegex, final Charset charset) throws IOException, InvalidBagMetadataException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void mergeIndentedLine(final String line, final List<SimpleImmutableEntry<String, String>> keyValues) {
        final SimpleImmutableEntry<String, String> oldKeyValue = keyValues.remove(keyValues.size() - 1);
        final SimpleImmutableEntry<String, String> newKeyValue = new SimpleImmutableEntry<>(oldKeyValue.getKey(), oldKeyValue.getValue() + System.lineSeparator() + line);
        keyValues.add(newKeyValue);
        logger.debug(messages.getString("found_indented_line"), oldKeyValue.getKey());
    }

    private static String[] checkLineFormat(final String line, final String splitRegex) throws InvalidBagMetadataException {
        final String[] parts = line.split(splitRegex, 2);
        if (parts.length != 2) {
            final String formattedMessage = messages.getString("malformed_key_value_line_error");
            throw new InvalidBagMetadataException(MessageFormatter.format(formattedMessage, line, splitRegex).getMessage());
        }
        return parts;
    }
}
